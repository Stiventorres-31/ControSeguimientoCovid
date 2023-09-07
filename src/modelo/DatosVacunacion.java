package modelo;

public class DatosVacunacion {
    private int id;
    private int pvc_cedula_paciente;
    private String pvc_nombres_paciente;
    private int pvc_codigo_vacuna;
    private String pvc_nombre_vacuna;
    private String pvc_laboratorio_vacuna;
    private  int pvc_dosis;
    private  String pvc_fecha_registro;
    private int pvc_cedula_usuario;

    public DatosVacunacion() {
    }

    public DatosVacunacion(int id, int pvc_cedula_paciente, String pvc_nombres_paciente, int pvc_codigo_vacuna, String pvc_nombre_vacuna, String pvc_laboratorio_vacuna, int pvc_dosis, String pvc_fecha_registro, int pvc_cedula_usuario) {
        this.id = id;
        this.pvc_cedula_paciente = pvc_cedula_paciente;
        this.pvc_nombres_paciente = pvc_nombres_paciente;
        this.pvc_codigo_vacuna = pvc_codigo_vacuna;
        this.pvc_nombre_vacuna = pvc_nombre_vacuna;
        this.pvc_laboratorio_vacuna = pvc_laboratorio_vacuna;
        this.pvc_dosis = pvc_dosis;
        this.pvc_fecha_registro = pvc_fecha_registro;
        this.pvc_cedula_usuario = pvc_cedula_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPvc_cedula_paciente() {
        return pvc_cedula_paciente;
    }

    public void setPvc_cedula_paciente(int pvc_cedula_paciente) {
        this.pvc_cedula_paciente = pvc_cedula_paciente;
    }

    public String getPvc_nombres_paciente() {
        return pvc_nombres_paciente;
    }

    public void setPvc_nombres_paciente(String pvc_nombres_paciente) {
        this.pvc_nombres_paciente = pvc_nombres_paciente;
    }

    public int getPvc_codigo_vacuna() {
        return pvc_codigo_vacuna;
    }

    public void setPvc_codigo_vacuna(int pvc_codigo_vacuna) {
        this.pvc_codigo_vacuna = pvc_codigo_vacuna;
    }

    public String getPvc_nombre_vacuna() {
        return pvc_nombre_vacuna;
    }

    public void setPvc_nombre_vacuna(String pvc_nombre_vacuna) {
        this.pvc_nombre_vacuna = pvc_nombre_vacuna;
    }

    public String getPvc_laboratorio_vacuna() {
        return pvc_laboratorio_vacuna;
    }

    public void setPvc_laboratorio_vacuna(String pvc_laboratorio_vacuna) {
        this.pvc_laboratorio_vacuna = pvc_laboratorio_vacuna;
    }

    public int getPvc_dosis() {
        return pvc_dosis;
    }

    public void setPvc_dosis(int pvc_dosis) {
        this.pvc_dosis = pvc_dosis;
    }

    public String getPvc_fecha_registro() {
        return pvc_fecha_registro;
    }

    public void setPvc_fecha_registro(String pvc_fecha_registro) {
        this.pvc_fecha_registro = pvc_fecha_registro;
    }

    public int getPvc_cedula_usuario() {
        return pvc_cedula_usuario;
    }

    public void setPvc_cedula_usuario(int pvc_cedula_usuario) {
        this.pvc_cedula_usuario = pvc_cedula_usuario;
    }
    
    
}
