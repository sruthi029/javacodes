import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

public class BarChartExample extends JFrame {

    public BarChartExample(String title) {
        super(title);

        // Create dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Category 1", "Label 1");
        dataset.addValue(4.0, "Category 1", "Label 2");
        dataset.addValue(3.0, "Category 1", "Label 3");
        dataset.addValue(5.0, "Category 1", "Label 4");

        // Create the chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Bar Chart Example",
                "X-Axis Label",
                "Y-Axis Label",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Customize the chart, if needed
        XYPlot plot = chart.getXYPlot();
        // ...

        // Create the panel to display the chart
        ChartPanel chartPanel = new ChartPanel(chart);
        setContentPane(chartPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BarChartExample example = new BarChartExample("Bar Chart Example");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
