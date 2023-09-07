package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProcesosVacunas {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarVacunas(DatosVacunas dv){
        String sql="INSERT INTO registrar_vacuna(vc_codigo,vc_nombre,vc_laboratorio,vc_fecha_ing,rv_usado) VALUES(?,?,?,?,?)";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dv.getVcCodigo());
            ps.setString(2, dv.getVcNombre());
            ps.setString(3, dv.getVcLaboratorio());
            ps.setString(4, dv.getVcFechaIngreso());
            ps.setString(5, dv.getVcUsado());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    public DatosVacunas buscarVacuna(int codigo){
        DatosVacunas dv= new DatosVacunas();
        String sql="SELECT * FROM registrar_vacuna WHERE vc_codigo=?";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs=ps.executeQuery();
            if(rs.next()){
                dv.setVcCodigo(rs.getInt("vc_codigo"));
                dv.setVcNombre(rs.getString("vc_nombre"));
                dv.setVcLaboratorio(rs.getString("vc_laboratorio"));
                dv.setVcUsado(rs.getString("rv_usado"));
            }
           
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
         return dv;
    }
}
