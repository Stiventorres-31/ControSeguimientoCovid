package modelo;

public class DatosReporteSintomas {
    private int drs_id;
    private int drs_CedulaPaciente;
    private String drs_NombresPacientes;
    private int drs_CodigoVacuna;
    private String drs_Sintomas;
    private String drs_Observacion;
    private String drs_FechaIngreso;
    private int usu_cedula;

    public DatosReporteSintomas() {
    }

    public DatosReporteSintomas(int drs_id, int drs_idVacunacion, int drs_CedulaPaciente, String drs_NombresPacientes, int drs_CodigoVacuna, String drs_Sintomas, String drs_Observacion, String drs_FechaIngreso, int usu_cedula) {
        this.drs_id = drs_id;
        this.drs_CedulaPaciente = drs_CedulaPaciente;
        this.drs_NombresPacientes = drs_NombresPacientes;
        this.drs_CodigoVacuna = drs_CodigoVacuna;
        this.drs_Sintomas = drs_Sintomas;
        this.drs_Observacion = drs_Observacion;
        this.drs_FechaIngreso = drs_FechaIngreso;
        this.usu_cedula = usu_cedula;
    }

    public int getDrs_id() {
        return drs_id;
    }

    public void setDrs_id(int drs_id) {
        this.drs_id = drs_id;
    }

    public int getDrs_CedulaPaciente() {
        return drs_CedulaPaciente;
    }

    public void setDrs_CedulaPaciente(int drs_CedulaPaciente) {
        this.drs_CedulaPaciente = drs_CedulaPaciente;
    }

    public String getDrs_NombresPacientes() {
        return drs_NombresPacientes;
    }

    public void setDrs_NombresPacientes(String drs_NombresPacientes) {
        this.drs_NombresPacientes = drs_NombresPacientes;
    }

    public int getDrs_CodigoVacuna() {
        return drs_CodigoVacuna;
    }

    public void setDrs_CodigoVacuna(int drs_CodigoVacuna) {
        this.drs_CodigoVacuna = drs_CodigoVacuna;
    }

    public String getDrs_Sintomas() {
        return drs_Sintomas;
    }

    public void setDrs_Sintomas(String drs_Sintomas) {
        this.drs_Sintomas = drs_Sintomas;
    }

    public String getDrs_Observacion() {
        return drs_Observacion;
    }

    public void setDrs_Observacion(String drs_Observacion) {
        this.drs_Observacion = drs_Observacion;
    }

    public String getDrs_FechaIngreso() {
        return drs_FechaIngreso;
    }

    public void setDrs_FechaIngreso(String drs_FechaIngreso) {
        this.drs_FechaIngreso = drs_FechaIngreso;
    }

    public int getUsu_cedula() {
        return usu_cedula;
    }

    public void setUsu_cedula(int usu_cedula) {
        this.usu_cedula = usu_cedula;
    }
    
    
 
    
    
    
}
