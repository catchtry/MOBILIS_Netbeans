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
import ViewModel.VeiculoVM;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

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
            stm.setString(10,v.getCilindrada());
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
        
        public List<VeiculoVM> ler(){
            
            Connection con = ConexaoBanco.getConnection();
            PreparedStatement stm = null;
            ResultSet rs = null;
        
        List<VeiculoVM> veiculos = new ArrayList<>();
        try {
            stm = con.prepareStatement("SELECT * FROM veiculo");
            rs = stm.executeQuery();
            while(rs.next()){
        
                VeiculoVM veiculo = new VeiculoVM();
            
                VeiculoVM veiculo = new VeiculoVM();
                veiculo.setPlaca(rs.getPlaca("placa"));
                veiculo.setChasse(rs.getChassi("chassi"));
                veiculo.setQuilomeragem(rs.getQuilometragem("quilometragem"));
                veiculo.setLotacaoMaxima(rs.getLotacaoMaxima("lotacaoMaxima"));
                veiculo.setNumeroDePortas(rs.getNumeroDePortas("numeroDePortas"));
                veiculo.setTipoDeVeiculo(rs.getTipoDeVeiculo("tipoDeVeiculo"));
                veiculo.setOrigem(rs.getOrigem("origem"));
                veiculo.setUf(rs.getUf("uf"));
                veiculo.setRenavan(rs.getRenavan("renavan"));
                veiculo.setCilindrada(rs.getCilindrada("cilindrada"));
                veiculo.setMarca(rs.getMarca("marca"));
                veiculo.setAnoDeFabricacao(rs.getAnoDeFabricacao("anoDeFabricacao"));
                veiculo.setModelo(rs.getModelo("modelo"));
                veiculo.setAnoDoModelo(rs.getAnoDoModelo("anoDoModelo"));
                veiculo.setVersao(rs.getVersao("versao"));
                veiculo.setCategoria(rs.getCategoria("categoria"));
                veiculo.setCor(rs.getCor("cor"));
                veiculo.setCombustiveil(rs.getCombustivel("combustivel"));
                veiculo.setCambio(rs.getCambio("cambio"));
                veiculo.setOpcionais(rs.getOpcionais("opcionais"));
                veiculo.setRestricoes(rs.getRestricoes("restricao"));
                veiculos.add(veiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConexaoBanco.closeConnection(con, stm, rs);
        }
        
        return veiculos;
            
    }
            
}
