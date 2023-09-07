package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProcesoLoginUsuario {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public DatosUsuarios iniciar_sesion(String usuario, String clave) {
        DatosUsuarios datoLogin = new DatosUsuarios();
        String sql = "SELECT * FROM usuario WHERE usu_usuario=? AND usu_clave=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            if (rs.next()) {
                datoLogin.setLogin_Usuario_cedula(rs.getInt("usu_cedula"));
                datoLogin.setLogin_Usuario_nombre(rs.getString("usu_nombres"));
                datoLogin.setLogin_Usuario_correo(rs.getString("usu_correo"));
                datoLogin.setLogin_Usuario_telefono(rs.getString("usu_telefono"));
                datoLogin.setLogin_Usuario_usuario(rs.getString("usu_usuario"));
                datoLogin.setLogin_Usuario_clave(rs.getString("usu_clave"));
                datoLogin.setLogin_Usuario_rol(rs.getString("usu_rol"));
                datoLogin.setLogin_Usuario_estado_cuenta(rs.getString("usu_estado_cuenta"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return datoLogin;
    }

    public boolean RegistrarUsuario(DatosUsuarios ds) {
        String sql = "INSERT INTO usuario(usu_cedula,usu_nombres,usu_correo,usu_telefono,usu_usuario,usu_clave,usu_rol,usu_estado_cuenta)VALUES(?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConexion();
            ps = con.prepareCall(sql);
            ps.setInt(1, ds.getLogin_Usuario_cedula());
            ps.setString(2, ds.getLogin_Usuario_nombre());
            ps.setString(3, ds.getLogin_Usuario_correo());
            ps.setString(4, ds.getLogin_Usuario_telefono());
            ps.setString(5, ds.getLogin_Usuario_usuario());
            ps.setString(6, ds.getLogin_Usuario_clave());
            ps.setString(7, ds.getLogin_Usuario_rol());
            ps.setString(8, ds.getLogin_Usuario_estado_cuenta());
            ps.execute();
            return true;
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null, "El número de cédula ya existe","Registrar usuario",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
            return false;
        } finally {//Para cerrar la conexion y mostrar si hay un error
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public boolean bloquearUsuario(DatosUsuarios ds) {
        String sql = "UPDATE usuario SET usu_estado_cuenta=? WHERE usu_cedula=?";
        try {
            con = cn.getConexion();
            ps = con.prepareCall(sql);
            ps.setString(1, ds.getLogin_Usuario_estado_cuenta());
            ps.setInt(2, ds.getLogin_Usuario_cedula());

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }

    }

    public boolean actualizarClave(DatosUsuarios ds) {
        String sql = "UPDATE usuario SET usu_nombres=?, usu_correo=?,usu_telefono=?,usu_usuario=?,usu_clave=?,usu_rol=? WHERE usu_cedula=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ds.getLogin_Usuario_nombre());
            ps.setString(2, ds.getLogin_Usuario_correo());
            ps.setString(3, ds.getLogin_Usuario_telefono());
            ps.setString(4, ds.getLogin_Usuario_usuario());
            ps.setString(5, ds.getLogin_Usuario_clave());
            ps.setString(6, ds.getLogin_Usuario_rol());
            ps.setInt(7, ds.getLogin_Usuario_cedula());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public DatosUsuarios validarClave(int cedula) {
        DatosUsuarios datoClave = new DatosUsuarios();
        String sql = "SELECT SUBSTRING(usu_clave, -3) as clave FROM usuario WHERE usu_cedula=?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cedula);
            rs = ps.executeQuery();
            if (rs.next()) {
                datoClave.setLogin_Usuario_clave(rs.getString("clave"));
            }
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        return datoClave;
    }
    
    public DatosUsuarios buscarUsuario(int cedula){
        DatosUsuarios du = new DatosUsuarios();
        String sql="SELECT * FROM usuario WHERE usu_cedula=?";
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            ps.setInt(1, cedula);
            rs=ps.executeQuery();
            if(rs.next()){
                du.setLogin_Usuario_cedula(rs.getInt("usu_cedula"));
                du.setLogin_Usuario_nombre(rs.getString("usu_nombres"));
                du.setLogin_Usuario_correo(rs.getString("usu_correo"));
                du.setLogin_Usuario_telefono(rs.getString("usu_telefono"));
                du.setLogin_Usuario_usuario(rs.getString("usu_usuario"));
                du.setLogin_Usuario_clave(rs.getString("usu_clave"));
                du.setLogin_Usuario_rol(rs.getString("usu_rol"));
                du.setLogin_Usuario_estado_cuenta(rs.getString("usu_estado_cuenta"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            
        }
        return du;
    }
}
