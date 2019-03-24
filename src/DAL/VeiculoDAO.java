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
import ViewModel.Veiculo;

/**
 *
 * @author Thiago
 */
public class VeiculoDAO {
    public void criar(Veiculo v){
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stm = null;
        
        try {
            stm = con.prepareStatement("INSERT INTO veiculo (placa, modelo, marca, cor) values (?,?,?)");
            //stm.setString();preciso das classes montadas para prosseguir
        } catch (SQLException ex) {
            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
