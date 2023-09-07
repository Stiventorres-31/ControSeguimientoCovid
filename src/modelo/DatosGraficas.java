package modelo;

public class DatosGraficas {
    private int cantidadVacunadosFecha;
    private int cantidadSintomasReportados;

    public DatosGraficas() {
    }

    public DatosGraficas(int cantidadVacunadosFecha, int cantidadSintomasReportados) {
        this.cantidadVacunadosFecha = cantidadVacunadosFecha;
        this.cantidadSintomasReportados = cantidadSintomasReportados;
    }

    public int getCantidadVacunadosFecha() {
        return cantidadVacunadosFecha;
    }

    public void setCantidadVacunadosFecha(int cantidadVacunadosFecha) {
        this.cantidadVacunadosFecha = cantidadVacunadosFecha;
    }

    public int getCantidadSintomasReportados() {
        return cantidadSintomasReportados;
    }

    public void setCantidadSintomasReportados(int cantidadSintomasReportados) {
        this.cantidadSintomasReportados = cantidadSintomasReportados;
    }
    
}
