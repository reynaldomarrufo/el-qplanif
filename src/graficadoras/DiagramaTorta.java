package graficadoras;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class DiagramaTorta {
	
	public DiagramaTorta(){
		
	}
	
	private PieDataset crearDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("uno", new Double(35.2));
        dataset.setValue("dos", new Double(5.0));
        dataset.setValue("Tres", new Double(17.5));
        dataset.setValue("Cuatro", new Double(17.5));
        dataset.setValue("5", new Double(11.0));
        dataset.setValue("Six", new Double(14.4));
        return dataset;
    }
	
	public JPanel crearPanel() {
        JFreeChart chart = crearChart(crearDataset());
        return new ChartPanel(chart);
    }
	
	private  JFreeChart crearChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
            "Porcentaje de Uso de Cpu",  // titulo
            dataset,             // datos
            true,               // legendas
            true,
            false
        );
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionOutlinesVisible(false);
        plot.setNoDataMessage("Informacion no Disponible");
        return chart;
    }
}
