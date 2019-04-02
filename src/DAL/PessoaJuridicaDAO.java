
package DAL;

import ViewModel.Cliente.PessoaJuridicaVM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PessoaJuridicaDAO {
    
    public void criar(PessoaJuridicaVM pj) {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("INSERT INTO pessoajuridica (cnpj, nome, logradouro, cep, numero, bairro, cidade, uf, complemento, telefone, email, celular) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            stm.setString(1, pj.getCnpj());
            stm.setString(2, pj.getInformacoesGerais().getNome());
            stm.setString(3, pj.getInformacoesGerais().getEndereco().getLogradouro());
            stm.setString(4, pj.getInformacoesGerais().getEndereco().getCep());
            stm.setInt(5, pj.getInformacoesGerais().getEndereco().getNumero());
            stm.setString(6, pj.getInformacoesGerais().getEndereco().getBairro());
            stm.setString(7, pj.getInformacoesGerais().getEndereco().getCidade());
            stm.setString(8, pj.getInformacoesGerais().getEndereco().getUf());
            stm.setString(9, pj.getInformacoesGerais().getEndereco().getComplemento());
            stm.setString(10, pj.getInformacoesGerais().getContato().getTelefone());
            stm.setString(11, pj.getInformacoesGerais().getContato().getEmail());
            stm.setString(12, pj.getInformacoesGerais().getContato().getCelular());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm);
        }
    }      

    public List<PessoaJuridicaVM> ler() {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;

        List<PessoaJuridicaVM> pessoasj = new ArrayList<>();

        try {
            stm = con.prepareStatement("SELECT * FROM pessoajuridica");
            rs = stm.executeQuery();
            while (rs.next()) {

                PessoaJuridicaVM pessoaj = new PessoaJuridicaVM();

                pessoaj.setCnpj(rs.getString("cnpj"));
                pessoaj.getInformacoesGerais().setNome(rs.getString("nome"));
                pessoaj.getInformacoesGerais().setEndereco(rs.getString("cep"), rs.getString("logradouro"),
                                                           rs.getInt("numero"), rs.getString("bairro"),
                                                           rs.getString("uf"),rs.getString("cidade"),
                                                           rs.getString("complemento"));
           
                pessoaj.getInformacoesGerais().setContato(rs.getString("telefone"), rs.getString("celular"),
                                                          rs.getString("email"));
                pessoasj.add(pessoaj);

            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm, rs);
        }
        return pessoasj;
    }        
        

    public void atualizar(PessoaJuridicaVM pj) {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("UPDATE SET pessoajuridica cnpj = ?, nome = ?, logradouro = ?, cep = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, complemento = ?, telefone = ?, email = ?, celular =?) WHERE cnpj = ?");
            stm.setString(1, pj.getCnpj());
            stm.setString(2, pj.getInformacoesGerais().getNome());
            stm.setString(3, pj.getInformacoesGerais().getEndereco().getLogradouro());
            stm.setString(4, pj.getInformacoesGerais().getEndereco().getCep());
            stm.setInt(5, pj.getInformacoesGerais().getEndereco().getNumero());
            stm.setString(6, pj.getInformacoesGerais().getEndereco().getBairro());
            stm.setString(7, pj.getInformacoesGerais().getEndereco().getCidade());
            stm.setString(8, pj.getInformacoesGerais().getEndereco().getUf());
            stm.setString(9, pj.getInformacoesGerais().getEndereco().getComplemento());
            stm.setString(10, pj.getInformacoesGerais().getContato().getTelefone());
            stm.setString(11, pj.getInformacoesGerais().getContato().getEmail());
            stm.setString(12, pj.getInformacoesGerais().getContato().getCelular());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm);
        }
    }
    
    public void remover(PessoaJuridicaVM pj){    
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        
            try {
                stm = con.prepareStatement("DELETE FROM pessoajuridica WHERE cnpj = ?");
                stm.setString(1, pj.getCnpj());

                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " +ex);
            }finally{
                ConexaoBanco.closeConnection(con, stm);
            }
        
    }
}
