import java.io.FileOutputStream;
import java.io.OutputStream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Run {

	public static void main(String[] args) {
		
		try {
			//Gerando as seriesdo gráfico
			DefaultCategoryDataset ds = new DefaultCategoryDataset();
			ds.addValue(40.5, "maximo", "dia 1");
			ds.addValue(38.2, "maximo", "dia 2");
			ds.addValue(37.3, "maximo", "dia 3");
			ds.addValue(31.5, "maximo", "dia 4");
			ds.addValue(35.7, "maximo", "dia 5");
			ds.addValue(42.5, "maximo", "dia 6");
			
			//Gerando o gráfico
			JFreeChart grafico = ChartFactory.createBarChart("Meu Grafico", "Dia", 
				    "Valor", ds, PlotOrientation.VERTICAL, true, true, false);
			
			//Salvando em PNG
			OutputStream arquivo = new FileOutputStream("grafico.png");
			ChartUtils.writeChartAsPNG(arquivo, grafico, 550, 400);
			arquivo.close();
			
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}




//cria o gráfico
			//JFreeChart grafico = ChartFactory.createLineChart("Meu Grafico", "Dia",  "Valor", ds, PlotOrientation.VERTICAL, true, true, false);
			