package modelo;

public class DatosVacunas {
    private int VcCodigo;
    private String VcNombre;
    private String VcLaboratorio;
    private String VcFechaIngreso;
    private String VcUsado;

    public DatosVacunas() {
    }

    public DatosVacunas(int VcCodigo, String VcNombre, String VcLaboratorio, String VcFechaIngreso,String VcUsado) {
        this.VcCodigo = VcCodigo;
        this.VcNombre = VcNombre;
        this.VcLaboratorio = VcLaboratorio;
        this.VcFechaIngreso = VcFechaIngreso;
        this.VcUsado=VcUsado;
    }

    public int getVcCodigo() {
        return VcCodigo;
    }

    public void setVcCodigo(int VcCodigo) {
        this.VcCodigo = VcCodigo;
    }

    public String getVcNombre() {
        return VcNombre;
    }

    public void setVcNombre(String VcNombre) {
        this.VcNombre = VcNombre;
    }

    public String getVcLaboratorio() {
        return VcLaboratorio;
    }

    public void setVcLaboratorio(String VcLaboratorio) {
        this.VcLaboratorio = VcLaboratorio;
    }

    public String getVcFechaIngreso() {
        return VcFechaIngreso;
    }

    public String getVcUsado() {
        return VcUsado;
    }

    public void setVcUsado(String VcUsado) {
        this.VcUsado = VcUsado;
    }
    
    public void setVcFechaIngreso(String VcFechaIngreso) {
        this.VcFechaIngreso = VcFechaIngreso;
    }
    
    
}
