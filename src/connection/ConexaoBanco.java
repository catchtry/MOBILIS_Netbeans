/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Amanda
 */
public class ConexaoBanco {
    public Statement stm;
    public ResultSet rs;
    public Connection con;
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql:localhost:5432/mobilis";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao: " +ex);
        }
    }
    
    public static void closeConnection(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao desconectar ao banco! Erro: "+ex.getMessage());
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stm){
        closeConnection(con);
        if(stm != null){
            try {
                stm.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao desconectar ao banco! Erro: "+ex.getMessage());
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stm, ResultSet rs){
        closeConnection(con, stm);
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro ao desconectar ao banco! Erro: "+ex.getMessage());
            }
        }
    }
    
}
