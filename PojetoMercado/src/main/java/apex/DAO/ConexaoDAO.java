package apex.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    Connection conn;
    
    public boolean ExecutaComando(String comando){
        try {
            conn.prepareStatement(comando).execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }
    
   public ResultSet retornaDados(String Consulta){
        try {
            return conn.prepareStatement(Consulta).executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
   }
    
    public ConexaoDAO(){
        try {
            String textoConexao = "jdbc:mysql://localhost:3306/mercado?user=root&password=";
            conn = DriverManager.getConnection(textoConexao);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
