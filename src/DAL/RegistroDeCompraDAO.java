
package DAL;

import ViewModel.Compra.AvaliacaoDoVeiculoVM;
import ViewModel.FichaDeAtendimento.FichaDeAtendimentoVM;
import ViewModel.Cliente.PessoaFisicaVM;
import ViewModel.Cliente.PessoaJuridicaVM;
import ViewModel.Compra.RegistroDeCompraVM;
import ViewModel.Veiculo.VeiculoVM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroDeCompraDAO {
    private PessoaFisicaVM pessoaFisica;
    private PessoaJuridicaVM pessoaJuridica;
    private VeiculoVM veiculo;
    private FichaDeAtendimentoVM FichaDeAtendimento;
    private AvaliacaoDoVeiculoVM avaliacaoDoVeiculo;
    private double valorDeCompra;
    private double valorDeVenda;
    
    public void criar(RegistroDeCompraVM rc){
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("INSERT INTO registroDeCompra (valorDeCompra, valorDeVenda) values(?,?)");
            stm.setDouble(1, rc.getValorDeCompra());
            stm.setDouble(2, rc.getValorDeVenda());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm);
        }
    }
    
    public List<RegistroDeCompraVM> ler() {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;

        List<RegistroDeCompraVM> registrocompra = new ArrayList<>();

        try {
            stm = con.prepareStatement("SELECT * FROM registroDeCompra");
            rs = stm.executeQuery();
            while (rs.next()) {

                RegistroDeCompraVM registro = new RegistroDeCompraVM();

                registro.setValorDeCompra(rs.getDouble("valorDeCompra"));
                registro.setValorDeVenda(rs.getDouble("valorDeVenda"));
                registro.add(registrocompra);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm, rs);
        }
        return registrocompra;
    }
    
    public void atualizar(RegistroDeCompraVM rc) {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("UPDATE SET registroDeCompra (valorDeCompra = ?, valorDeVenda = ?) WHERE codigoV = ?");
            stm.setDouble(1, rc.getValorDeCompra());
            stm.setDouble(2, rc.getValorDeVenda());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm);
        }
    }
    
    public void remover(RegistroDeCompraVM rc){    
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        
            try {
                stm = con.prepareStatement("DELETE FROM registroDeCompra WHERE codigoR = ?");
                stm.setInt(1, rc.getCodigoR);

                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " +ex);
            }finally{
                ConexaoBanco.closeConnection(con, stm);
            }
    }
    
}
