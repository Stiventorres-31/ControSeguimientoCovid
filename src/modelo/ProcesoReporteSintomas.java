package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProcesoReporteSintomas {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean registrarReporteSintomas(DatosReporteSintomas drs){
        String sql="INSERT INTO reportar_sintomas(pc_cedula,pc_nombres,vac_codigo,rs_sintomas,rs_observacion,rs_fecha_ing,usu_cedula)VALUES(?,?,?,?,?,?,?)";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, drs.getDrs_CedulaPaciente());
            ps.setString(2, drs.getDrs_NombresPacientes());
            ps.setInt(3,drs.getDrs_CodigoVacuna());
            ps.setString(4, drs.getDrs_Sintomas());
            ps.setString(5,drs.getDrs_Observacion());
            ps.setString(6,drs.getDrs_FechaIngreso());
            ps.setInt(7, drs.getUsu_cedula());
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
    public DatosVacunacion buscarProcesoVacunaion(int cedula){
        DatosVacunacion dv= new DatosVacunacion();
        String sql="SELECT * FROM proceso_vacunacion WHERE pc_cedula=? ORDER BY pv_cantidad_dosis DESC";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cedula);
            rs=ps.executeQuery();
            if(rs.next()){
                dv.setPvc_nombres_paciente(rs.getString("pc_nombres"));
                dv.setPvc_codigo_vacuna(rs.getInt("va_codigo"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return dv;
    }
    public List listar (){
        List<DatosReporteSintomas> ListV = new ArrayList();
        String sql="SELECT * FROM reportar_sintomas";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                DatosReporteSintomas drs= new DatosReporteSintomas();
                drs.setDrs_id(rs.getInt("rs_id"));
                drs.setDrs_CedulaPaciente(rs.getInt("pc_cedula"));
                drs.setDrs_NombresPacientes(rs.getString("pc_nombres"));
                drs.setDrs_CodigoVacuna(rs.getInt("vac_codigo"));
                drs.setDrs_Sintomas(rs.getString("rs_sintomas"));
                drs.setDrs_Observacion(rs.getString("rs_observacion"));
                drs.setDrs_FechaIngreso(rs.getString("rs_fecha_ing"));
                drs.setUsu_cedula(rs.getInt("usu_cedula"));
                ListV.add(drs);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListV;
    }
}
