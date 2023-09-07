package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProcesosPacientes {
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarPacientes(DatosPacientes dp){
      String  sql="INSERT INTO registrar_paciente (pc_cedula,pc_nombres,pc_telefono,pc_fecha_nac,pc_genero,pc_estado_civil,pc_ciudad,pc_municipio,pc_barrio,pc_estado_covid,usu_cedula) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dp.getPcCedula());
            ps.setString(2, dp.getPcnombre());
            ps.setString(3, dp.getPcTelefono());
            ps.setString(4, dp.getPcFechaNacimiento());
            ps.setString(5, dp.getPcGenero());
            ps.setString(6, dp.getPcEstadoCivil());
            ps.setString(7, dp.getPcCiudad());
            ps.setString(8, dp.getPcMunicipio());
            ps.setString(9, dp.getPcBarrio());
            ps.setString(10, dp.getPcEstadoCovid());
            ps.setInt(11, dp.getCedulaUsuPaciente());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL INSERTAR EN LA BASE DE DATOS","ERROR BASE DE DATOS",JOptionPane.ERROR_MESSAGE);
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
    public boolean ActualizarDatosPacientes(DatosPacientes dp){
        String sql="UPDATE registrar_paciente SET pc_nombres=?,pc_telefono=?,pc_fecha_nac=?,pc_genero=?,pc_estado_civil=?,pc_ciudad=?,pc_municipio=?,pc_barrio=?,pc_estado_covid=? WHERE pc_cedula=?";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, dp.getPcnombre());
            ps.setString(2,dp.getPcTelefono());
            ps.setString(3,dp.getPcFechaNacimiento());
            ps.setString(4,dp.getPcGenero());
            ps.setString(5,dp.getPcEstadoCivil());
            ps.setString(6,dp.getPcCiudad());
            ps.setString(7,dp.getPcMunicipio());
            ps.setString(8,dp.getPcBarrio());
            ps.setString(9,dp.getPcEstadoCivil());
            ps.setInt(10, dp.getPcCedula());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "No se pudo actualizar los datos el paciente","Actualizar datos",JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    public DatosPacientes BuscarDatos(int cedulaPaciente){
        DatosPacientes dp= new DatosPacientes();
        String sql="SELECT * FROM registrar_paciente WHERE pc_cedula=?";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cedulaPaciente);
            rs=ps.executeQuery();
            if(rs.next()){
                dp.setPcnombre(rs.getString("pc_nombres"));
                dp.setPcTelefono(rs.getString("pc_telefono"));
                dp.setPcFechaNacimiento(rs.getString("pc_fecha_nac"));
                dp.setPcGenero(rs.getString("pc_genero"));
                dp.setPcEstadoCivil(rs.getString("pc_estado_civil"));
                dp.setPcCiudad(rs.getString("pc_ciudad"));
                dp.setPcMunicipio(rs.getString("pc_municipio"));
                dp.setPcBarrio(rs.getString("pc_barrio"));
                dp.setPcEstadoCovid(rs.getString("pc_estado_covid"));
                
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
        return dp;
    }
}
