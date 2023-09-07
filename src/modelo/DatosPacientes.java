package modelo;

public class DatosPacientes {
    private int pcCedula;
    private String pcnombre;
    private String pcTelefono;
    private String pcFechaNacimiento;
    private String pcGenero;
    private String pcEstadoCivil;
    private String pcCiudad;
    private String pcMunicipio;
    private String pcBarrio;
    private String pcEstadoCovid;
    private int cedulaUsuPaciente;

    public DatosPacientes() {
    }

    public DatosPacientes(int pcCedula, String pcnombre, String pcTelefono, String pcFechaNacimiento, String pcGenero, String pcEstadoCivil, String pcCiudad, String pcMunicipio, String pcBarrio, String pcEstadoCovid, int cedulaUsuPaciente) {
        this.pcCedula = pcCedula;
        this.pcnombre = pcnombre;
        this.pcTelefono = pcTelefono;
        this.pcFechaNacimiento = pcFechaNacimiento;
        this.pcGenero = pcGenero;
        this.pcEstadoCivil = pcEstadoCivil;
        this.pcCiudad = pcCiudad;
        this.pcMunicipio = pcMunicipio;
        this.pcBarrio = pcBarrio;
        this.pcEstadoCovid = pcEstadoCovid;
        this.cedulaUsuPaciente = cedulaUsuPaciente;
    }

    public int getPcCedula() {
        return pcCedula;
    }

    public void setPcCedula(int pcCedula) {
        this.pcCedula = pcCedula;
    }

    public String getPcnombre() {
        return pcnombre;
    }

    public void setPcnombre(String pcnombre) {
        this.pcnombre = pcnombre;
    }

    public String getPcTelefono() {
        return pcTelefono;
    }

    public void setPcTelefono(String pcTelefono) {
        this.pcTelefono = pcTelefono;
    }

    public String getPcFechaNacimiento() {
        return pcFechaNacimiento;
    }

    public void setPcFechaNacimiento(String pcFechaNacimiento) {
        this.pcFechaNacimiento = pcFechaNacimiento;
    }

    public String getPcGenero() {
        return pcGenero;
    }

    public void setPcGenero(String pcGenero) {
        this.pcGenero = pcGenero;
    }

    public String getPcEstadoCivil() {
        return pcEstadoCivil;
    }

    public void setPcEstadoCivil(String pcEstadoCivil) {
        this.pcEstadoCivil = pcEstadoCivil;
    }

    public String getPcCiudad() {
        return pcCiudad;
    }

    public void setPcCiudad(String pcCiudad) {
        this.pcCiudad = pcCiudad;
    }

    public String getPcMunicipio() {
        return pcMunicipio;
    }

    public void setPcMunicipio(String pcMunicipio) {
        this.pcMunicipio = pcMunicipio;
    }

    public String getPcBarrio() {
        return pcBarrio;
    }

    public void setPcBarrio(String pcBarrio) {
        this.pcBarrio = pcBarrio;
    }

    public String getPcEstadoCovid() {
        return pcEstadoCovid;
    }

    public void setPcEstadoCovid(String pcEstadoCovid) {
        this.pcEstadoCovid = pcEstadoCovid;
    }

    public int getCedulaUsuPaciente() {
        return cedulaUsuPaciente;
    }

    public void setCedulaUsuPaciente(int cedulaUsuPaciente) {
        this.cedulaUsuPaciente = cedulaUsuPaciente;
    }
    
    
    
}
