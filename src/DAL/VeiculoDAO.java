/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ViewModel.Veiculo.VeiculoVM;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago
 */
public class VeiculoDAO {
    
    public void criar(VeiculoVM v){
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        
        try {
            stm = con.prepareStatement("INSERT INTO veiculo (placa,chassi,quilometragem,lotacaoMaxima,numeroDePortas,tipoDeVeiculo,origem,uf,renavam,cilindrada,marca,anoDeFabricacao,modelo,anoDoModelo,versao,categoria,cor,combustivel,cambio,opcionais,restricao)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,)");
            stm.setString(1,v.getPlaca());
            stm.setString(2,v.getChassi());
            stm.setInt(3,v.getQuilometragem());
            stm.setInt(4,v.getLotacaoMaxima());
            stm.setInt(5,v.getNumeroDePortas());
            stm.setInt(6,v.getTipoDeVeiculo());
            stm.setInt(7,v.getOrigem());
            stm.setString(8,v.getUf());
            stm.setString(9,v.getRenavam());
            stm.setString(10,v.getCilindradas());
            stm.setString(11,v.getMarca());
            stm.setDate(12,v.getAnoDeFabricacao());
            stm.setString(13,v.getModelo());
            stm.setDate(14,v.getAnoDoModelo());
            stm.setString(15,v.getVersao());
            stm.setInt(16,v.getCategoria());
            stm.setString(17,v.getCor());
            stm.setInt(18,v.getCombustivel());
            stm.setInt(19,v.getCambio());
            stm.setString(20,v.getOpcionais());
            stm.setInt(21,v.getRestricoes());
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " +ex);
        }finally{
            ConexaoBanco.closeConnection(con, stm);
        }
    }
        
   
    public List<VeiculoVM> ler(){
            Connection con = ConexaoBanco.getConnection();
            PreparedStatement stm = null;
            ResultSet rs = null;
        
        List<VeiculoVM>veiculos = new ArrayList<>();
        try {
            stm = con.prepareStatement("SELECT * FROM veiculo");
            rs = stm.executeQuery();
            while(rs.next()){
        
                VeiculoVM veiculo = new VeiculoVM();
            
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setChassi(rs.getString("chassi"));
                veiculo.setQuilometragem(rs.getInt("quilometragem"));
                veiculo.setLotacaoMaxima(rs.getInt("lotacaoMaxima"));
                veiculo.setNumeroDePortas(rs.getInt("numeroDePortas"));
                veiculo.setTipoDeVeiculo(rs.getInt("tipoDeVeiculo"));
                veiculo.setOrigem(rs.getInt("origem"));
                veiculo.setUf(rs.getString("uf"));
                veiculo.setRenavam(rs.getString("renavan"));
                veiculo.setCilindradas(rs.getString("cilindrada"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setAnoDeFabricacao(rs.getDate("anoDeFabricacao"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setAnoDoModelo(rs.getDate("anoDoModelo"));
                veiculo.setVersao(rs.getString("versao"));
                veiculo.setCategoria(rs.getInt("categoria"));
                veiculo.setCor(rs.getString("cor"));
                veiculo.setCombustivel(rs.getInt("combustivel"));
                veiculo.setCambio(rs.getInt("cambio"));
                veiculo.setOpcionais(rs.getString("opcionais"));
                veiculo.setRestricoes(rs.getInt("restricao"));
                veiculos.add(veiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConexaoBanco.closeConnection(con, stm, rs);
        }
        return veiculos;
    }
    
    public void atualizar(VeiculoVM v){
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        
        try {
            stm = con.prepareStatement("UPDATE veiculo SET chassi = ?,quilometragem = ?,lotacaoMaxima = ?,numeroDePortas = ?,tipoDeVeiculo = ?,origem = ?,uf = ?,renavam = ?,cilindrada = ?,marca = ?,anoDeFabricacao = ?,modelo = ?,anoDoModelo = ?,versao = ?,categoria = ?,cor = ?,combustivel = ?,cambio = ?,opcionais = ?,restricao = ?) WHERE placa = ?");
            stm.setString(1, v.getPlaca());
            stm.setString(2, v.getChassi());
            stm.setInt(3, v.getQuilometragem());
            stm.setInt(4, v.getLotacaoMaxima());
            stm.setInt(5, v.getNumeroDePortas());
            stm.setInt(6, v.getTipoDeVeiculo());
            stm.setInt(7, v.getOrigem());
            stm.setString(8, v.getUf());
            stm.setString(9, v.getRenavam());
            stm.setString(10, v.getCilindradas());
            stm.setString(11, v.getMarca());
            stm.setDate(12, v.getAnoDeFabricacao());
            stm.setString(13, v.getModelo());
            stm.setDate(14, v.getAnoDoModelo());
            stm.setString(15, v.getVersao());
            stm.setInt(16, v.getCategoria());
            stm.setString(17, v.getCor());
            stm.setInt(18, v.getCombustivel());
            stm.setInt(19, v.getCambio());
            stm.setString(20, v.getOpcionais());
            stm.setInt(21, v.getRestricoes());
            
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " +ex);
        }finally{
            ConexaoBanco.closeConnection(con, stm);
        }
    }
    
    public void remover(VeiculoVM v){    
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        
            try {
                stm = con.prepareStatement("DELETE FROM veiculo WHERE placa = ?");
                stm.setString(1, v.getPlaca());

                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " +ex);
            }finally{
                ConexaoBanco.closeConnection(con, stm);
            }
        
    }
}
