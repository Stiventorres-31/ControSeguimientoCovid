package modelo;

public class DatosUsuarios {
    private int Login_Usuario_cedula;
    private String Login_Usuario_nombre;
    private String Login_Usuario_correo;
    private String Login_Usuario_telefono;
    private String Login_Usuario_usuario;
    private String Login_Usuario_clave;
    private String Login_Usuario_rol;
    private String Login_Usuario_estado_cuenta;

    public DatosUsuarios() {
    }

    public DatosUsuarios(int Login_Usuario_cedula, String Login_Usuario_nombre, String Login_Usuario_correo, String Login_Usuario_telefono, String Login_Usuario_usuario, String Login_Usuario_clave, String Login_Usuario_rol, String Login_Usuario_estado_cuenta) {
        this.Login_Usuario_cedula = Login_Usuario_cedula;
        this.Login_Usuario_nombre = Login_Usuario_nombre;
        this.Login_Usuario_correo = Login_Usuario_correo;
        this.Login_Usuario_telefono = Login_Usuario_telefono;
        this.Login_Usuario_usuario = Login_Usuario_usuario;
        this.Login_Usuario_clave = Login_Usuario_clave;
        this.Login_Usuario_rol = Login_Usuario_rol;
        this.Login_Usuario_estado_cuenta = Login_Usuario_estado_cuenta;
    }

    public int getLogin_Usuario_cedula() {
        return Login_Usuario_cedula;
    }

    public void setLogin_Usuario_cedula(int Login_Usuario_cedula) {
        this.Login_Usuario_cedula = Login_Usuario_cedula;
    }

    public String getLogin_Usuario_nombre() {
        return Login_Usuario_nombre;
    }

    public void setLogin_Usuario_nombre(String Login_Usuario_nombre) {
        this.Login_Usuario_nombre = Login_Usuario_nombre;
    }

    public String getLogin_Usuario_correo() {
        return Login_Usuario_correo;
    }

    public void setLogin_Usuario_correo(String Login_Usuario_correo) {
        this.Login_Usuario_correo = Login_Usuario_correo;
    }

    public String getLogin_Usuario_telefono() {
        return Login_Usuario_telefono;
    }

    public void setLogin_Usuario_telefono(String Login_Usuario_telefono) {
        this.Login_Usuario_telefono = Login_Usuario_telefono;
    }

    public String getLogin_Usuario_usuario() {
        return Login_Usuario_usuario;
    }

    public void setLogin_Usuario_usuario(String Login_Usuario_usuario) {
        this.Login_Usuario_usuario = Login_Usuario_usuario;
    }

    public String getLogin_Usuario_clave() {
        return Login_Usuario_clave;
    }

    public void setLogin_Usuario_clave(String Login_Usuario_clave) {
        this.Login_Usuario_clave = Login_Usuario_clave;
    }

    public String getLogin_Usuario_rol() {
        return Login_Usuario_rol;
    }

    public void setLogin_Usuario_rol(String Login_Usuario_rol) {
        this.Login_Usuario_rol = Login_Usuario_rol;
    }

    public String getLogin_Usuario_estado_cuenta() {
        return Login_Usuario_estado_cuenta;
    }

    public void setLogin_Usuario_estado_cuenta(String Login_Usuario_estado_cuenta) {
        this.Login_Usuario_estado_cuenta = Login_Usuario_estado_cuenta;
    }
    
}
