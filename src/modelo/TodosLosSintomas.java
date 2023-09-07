package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class TodosLosSintomas {

    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void todosLosSintomas() {
        try {
            String sql = "SELECT rs_sintomas,COUNT(*) as cantidad FROM reportar_sintomas GROUP by rs_sintomas";
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            DefaultPieDataset dataset = new DefaultPieDataset();
            while (rs.next()) {
                dataset.setValue(rs.getString("rs_sintomas"), rs.getDouble("cantidad"));
            }           
            //Creamos el grafico
            JFreeChart jf = ChartFactory.createPieChart("Todos los sintomas", dataset);
            ChartFrame cf = new ChartFrame("Total de ventas por día", jf);
            cf.setSize(1000, 500);
            cf.setLocationRelativeTo(null);
            cf.setResizable(false);
            cf.setVisible(true);
          
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
