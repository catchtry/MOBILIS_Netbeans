/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import ViewModel.PessoaFisicaVM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago
 */
public class PessoaFisicaDAO {
    
    public void criar(PessoaFisicaVM pf){
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null; 
        try {
            stm = con.prepareStatement("INSERT INTO pessoafisica (cpf, nome, logradouro, cep, numero, bairro, cidade, uf, complemento, telefone, email, celular) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            stm.setString(1,pf.getCpf());
            stm.setString(2,pf.getNome());
            stm.setString(3,pf.getLogradouro());
            stm.setString(4,pf.getCep());
            stm.setInt(5,pf.getNumero());
            stm.setString(6,pf.getBairro());
            stm.setString(7,pf.getCidade());
            stm.setString(8,pf.getUf());
            stm.setString(9,pf.getComplemento());
            stm.setString(10,pf.getTelefone());
            stm.setString(11,pf.getEmail());
            stm.setString(12,pf.getCelular());
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " +ex);
        }finally{
            ConexaoBanco.closeConnection(con, stm);
        }
        
        public List<PessoaFisicaVM> ler(){
            Connection con = ConexaoBanco.getConnection();
            PreparedStatement stm = null;
            ResultSet rs = null;
        
            List<PessoaFisicaVM> pessoasf = new ArrayList<>();
        
            try {
                stm = con.prepareStatement("SELECT * FROM pessoafisica");
                rs = stm.executeQuery();
                while(rs.next()){

                    PessoaFisicaVM pessoaf = new PessoaFisicaVM();

                    pessoaf.setCpf(rs.getString("cpf"));
                    pessoaf.setNome(rs.getString("nome"));
                    pessoaf.setLogradouro(rs.getString("logradouro"));
                    pessoaf.setCep(rs.getString("cep"));
                    pessoaf.setNumero(rs.getInt("numero"));
                    pessoaf.setBairro(rs.getString("bairro"));
                    pessoaf.setCidade(rs.getString("cidade"));
                    pessoaf.setUf(rs.getString("uf"));
                    pessoaf.setComplemtento(rs.getString("complemento"));
                    pessoaf.setTelefone(rs.getString("telefone"));
                    pessoaf.setEmail(rs.getString("email"));
                    pessoaf.setCelular(rs.getString("celular"));
                    pessoasf.add(pessoaf);

                }
            } catch (SQLException ex) {
                Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                ConexaoBanco.closeConnection(con, stm, rs);
            }
            return pessoasf;
        }
           
        
