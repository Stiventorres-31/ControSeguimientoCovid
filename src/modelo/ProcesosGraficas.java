package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcesosGraficas {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public DatosGraficas buscarFechas(String fecha) {
        DatosGraficas dg= new DatosGraficas();
        String sql = "SELECT COUNT(pv_fecha_ing) as cantidad FROM proceso_vacunacion WHERE pv_fecha_ing = ?";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, fecha);
            rs=ps.executeQuery();
            if(rs.next()){
                dg.setCantidadVacunadosFecha(rs.getInt("cantidad"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return dg;
    }
    public DatosGraficas buscarSintomas(String sintoma) {
        DatosGraficas dg= new DatosGraficas();
        String sql = "SELECT COUNT(rs_sintomas) as cantidad FROM reportar_sintomas WHERE rs_sintomas = ?";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, sintoma);
            rs=ps.executeQuery();
            if(rs.next()){
                dg.setCantidadSintomasReportados(rs.getInt("cantidad"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return dg;
    }
}
