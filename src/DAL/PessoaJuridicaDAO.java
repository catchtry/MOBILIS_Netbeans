/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import ViewModel.PessoaJuridicaVM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaJuridicaDAO {
    
    public void criar(PessoaJuridicaVM pj) {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        try {
            stm = con.prepareStatement("INSERT INTO pessoajuridica (cnpj, nome, logradouro, cep, numero, bairro, cidade, uf, complemento, telefone, email, celular) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            stm.setString(1, pj.getCnpj());
            stm.setString(2, pj.getNome());
            stm.setString(3, pj.getLogradouro());
            stm.setString(4, pj.getCep());
            stm.setInt(5, pj.getNumero());
            stm.setString(6, pj.getBairro());
            stm.setString(7, pj.getCidade());
            stm.setString(8, pj.getUf());
            stm.setString(9, pj.getComplemento());
            stm.setString(10, pj.getTelefone());
            stm.setString(11, pj.getEmail());
            stm.setString(12, pj.getCelular());

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
                pessoaj.setNome(rs.getString("nome"));
                pessoaj.setLogradouro(rs.getString("logradouro"));
                pessoaj.setCep(rs.getString("cep"));
                pessoaj.setNumero(rs.getInt("numero"));
                pessoaj.setBairro(rs.getString("bairro"));
                pessoaj.setCidade(rs.getString("cidade"));
                pessoaj.setUf(rs.getString("uf"));
                pessoaj.setComplemtento(rs.getString("complemento"));
                pessoaj.setTelefone(rs.getString("telefone"));
                pessoaj.setEmail(rs.getString("email"));
                pessoaj.setCelular(rs.getString("celular"));
                pessoasj.add(pessoaj);

            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoBanco.closeConnection(con, stm, rs);
        }
        return pessoasj;
    }        
        

    public void atualizar(PessoaJuridicaVM pf) {
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;

        try {
            stm = con.prepareStatement("UPDATE SET pessoajuridica cnpj = ?, nome = ?, logradouro = ?, cep = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, complemento = ?, telefone = ?, email = ?, celular =?) WHERE cnpj = ?");
            stm.setString(1, pj.getCnpj());
            stm.setString(2, pj.getNome());
            stm.setString(3, pj.getLogradouro());
            stm.setString(4, pj.getCep());
            stm.setInt(5, pj.getNumero());
            stm.setString(6, pj.getBairro());
            stm.setString(7, pj.getCidade());
            stm.setString(8, pj.getUf());
            stm.setString(9, pj.getComplemento());
            stm.setString(10, pj.getTelefone());
            stm.setString(11, pj.getEmail());
            stm.setString(12, pj.getCelular());

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
