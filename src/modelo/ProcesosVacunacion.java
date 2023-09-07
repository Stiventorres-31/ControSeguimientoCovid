package modelo;


import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProcesosVacunacion {
    ConexionBD cn = new ConexionBD();
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    
    public boolean regisrarProcesoVacunacion(DatosVacunacion dvc){
        String sql="INSERT INTO proceso_vacunacion(pc_cedula,pc_nombres,va_codigo,va_nombre,va_laboratorio,pv_cantidad_dosis,pv_fecha_ing,usu_cedula)VALUES(?,?,?,?,?,?,?,?)";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dvc.getPvc_cedula_paciente());
            ps.setString(2, dvc.getPvc_nombres_paciente());
            ps.setInt(3,dvc.getPvc_codigo_vacuna());
            ps.setString(4,dvc.getPvc_nombre_vacuna());
            ps.setString(5,dvc.getPvc_laboratorio_vacuna());
            ps.setInt(6,dvc.getPvc_dosis());
            ps.setString(7, dvc.getPvc_fecha_registro());
            ps.setInt(8,dvc.getPvc_cedula_usuario());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "No se ha podido registrar el proceso de vacuna","Proceso de vacunación",JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        
    }
    public boolean actualizarEstadoVacuna(DatosVacunas dv){
        String sql="UPDATE registrar_vacuna SET rv_usado=? WHERE vc_codigo=?";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, dv.getVcUsado());
            ps.setInt(2, dv.getVcCodigo());
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
    public List listar (){
        List<DatosVacunacion> ListV = new ArrayList();
        String sql="SELECT * FROM proceso_vacunacion";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                DatosVacunacion dv= new DatosVacunacion();
                dv.setId(rs.getInt("pv_id"));
                dv.setPvc_cedula_paciente(rs.getInt("pc_cedula"));
                dv.setPvc_nombres_paciente(rs.getString("pc_nombres"));
                dv.setPvc_codigo_vacuna(rs.getInt("va_codigo"));
                dv.setPvc_nombre_vacuna(rs.getString("va_nombre"));
                dv.setPvc_laboratorio_vacuna(rs.getString("va_laboratorio"));
                dv.setPvc_dosis(rs.getInt("pv_cantidad_dosis"));
                dv.setPvc_fecha_registro(rs.getString("pv_fecha_ing"));
                dv.setPvc_cedula_usuario(rs.getInt("usu_cedula"));
                ListV.add(dv);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListV;
    }
}
