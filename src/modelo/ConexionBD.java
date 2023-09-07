package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
    Connection conne;
    public Connection getConexion(){
        try {
            
            String urlBD="jdbc:mysql://localhost:3306/control_seguimiento_covid";
            conne=DriverManager.getConnection(urlBD,"root","");
            return conne;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        return null;
    }
}
