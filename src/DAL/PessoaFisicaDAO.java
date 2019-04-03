
package DAL;

import ViewModel.Cliente.PessoaFisicaVM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaFisicaDAO {

    public void criar(PessoaFisicaVM pf) {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("INSERT INTO pessoafisica (cpf, nome, logradouro, cep, numero, bairro, cidade, uf, complemento, telefone, email, celular) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            stm.setString(1, pf.getCpf());
            stm.setString(2, pf.getInformacoesGerais().getNome());
            stm.setString(3, pf.getInformacoesGerais().getEndereco().getLogradouro());
            stm.setString(4, pf.getInformacoesGerais().getEndereco().getCep());
            stm.setInt(5, pf.getInformacoesGerais().getEndereco().getNumero());
            stm.setString(6, pf.getInformacoesGerais().getEndereco().getBairro());
            stm.setString(7, pf.getInformacoesGerais().getEndereco().getCidade());
            stm.setString(8, pf.getInformacoesGerais().getEndereco().getUf());
            stm.setString(9, pf.getInformacoesGerais().getEndereco().getComplemento());
            stm.setString(10, pf.getInformacoesGerais().getContato().getTelefone());
            stm.setString(11, pf.getInformacoesGerais().getContato().getEmail());
            stm.setString(12, pf.getInformacoesGerais().getContato().getCelular());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm);
        }
    }
        
        

    public List<PessoaFisicaVM> ler(){
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;

        List<PessoaFisicaVM> pessoasf = new ArrayList<>();

        try {
            stm = con.prepareStatement("SELECT * FROM pessoafisica");
            rs = stm.executeQuery();
            while (rs.next()) {

                PessoaFisicaVM pessoaf = new PessoaFisicaVM(rs.getString("cpf"));

                pessoaf.getInformacoesGerais().setNome(rs.getString("nome"));
                pessoaf.getInformacoesGerais().setEndereco(rs.getString("cep"), rs.getString("logradouro"),
                                                           rs.getInt("numero"), rs.getString("bairro"),
                                                           rs.getString("uf"),rs.getString("cidade"),
                                                           rs.getString("complemento"));
           
                pessoaf.getInformacoesGerais().setContato(rs.getString("telefone"), rs.getString("celular"),
                                                          rs.getString("email"));
                
                pessoasf.add(pessoaf);

            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm, rs);
        }
        return pessoasf;
    }  
    
    public PessoaFisicaVM lerPessoaFisicaByCPF(String cpf){
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;

        PessoaFisicaVM pessoaf = new PessoaFisicaVM(cpf);

        try {
            stm = con.prepareStatement("SELECT * FROM pessoafisica WHERE cpf = ?");
            stm.setString(1, pessoaf.getCpf());
            rs = stm.executeQuery();
            while (rs.next()) {

                pessoaf.setCpf(rs.getString("cpf"));
                pessoaf.getInformacoesGerais().setNome(rs.getString("nome"));
                pessoaf.getInformacoesGerais().setEndereco(rs.getString("cep"), rs.getString("logradouro"),
                                                           rs.getInt("numero"), rs.getString("bairro"),
                                                           rs.getString("uf"),rs.getString("cidade"),
                                                           rs.getString("complemento"));
           
                pessoaf.getInformacoesGerais().setContato(rs.getString("telefone"), rs.getString("celular"),
                                                          rs.getString("email"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm, rs);
        }
        return pessoaf;
    }         

    public void atualizar(PessoaFisicaVM pf) {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("UPDATE SET pessoafisica cpf = ?, nome = ?, logradouro = ?, cep = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, complemento = ?, telefone = ?, email = ?, celular =?) WHERE cpf = ?");
            stm.setString(1, pf.getCpf());
            stm.setString(2, pf.getInformacoesGerais().getNome());
            stm.setString(3, pf.getInformacoesGerais().getEndereco().getLogradouro());
            stm.setString(4, pf.getInformacoesGerais().getEndereco().getCep());
            stm.setInt(5, pf.getInformacoesGerais().getEndereco().getNumero());
            stm.setString(6, pf.getInformacoesGerais().getEndereco().getBairro());
            stm.setString(7, pf.getInformacoesGerais().getEndereco().getCidade());
            stm.setString(8, pf.getInformacoesGerais().getEndereco().getUf());
            stm.setString(9, pf.getInformacoesGerais().getEndereco().getComplemento());
            stm.setString(10, pf.getInformacoesGerais().getContato().getTelefone());
            stm.setString(11, pf.getInformacoesGerais().getContato().getEmail());
            stm.setString(12, pf.getInformacoesGerais().getContato().getCelular());

            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm);
        }
    }
    
    public void remover(PessoaFisicaVM pf){    
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        
            try {
                stm = con.prepareStatement("DELETE FROM pessoafisica WHERE cpf = ?");
                stm.setString(1, pf.getCpf());

                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " +ex);
            }finally{
                ConexaoBanco.closeConnection(con, stm);
            }
        
    }

}

