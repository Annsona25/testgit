/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

/**
 *
 * @author Manoj
 */
import java.io.DataInputStream;
import java.io.FileInputStream;
import javax.swing.JFrame;  
import javax.swing.SwingUtilities;  
import javax.swing.WindowConstants;
  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;  
  
public class BarChartExample extends JFrame {  
  
    public int nr;
    public int re;
  private static final long serialVersionUID = 1L;  
  
  public BarChartExample(String appTitle,int a,int b) {  
    super(appTitle);  
  nr=a;
  re=b;
    // Create Dataset  
    CategoryDataset dataset = createDataset();  
      
    //Create chart  
    JFreeChart chart=ChartFactory.createBarChart(  
        "Result Chart", //Chart Title  
        "Types", // Category axis  
        "Percentage", // Value axis  
        dataset,  
        PlotOrientation.VERTICAL,  
        true,true,false  
       );  
  
    ChartPanel panel=new ChartPanel(chart);  
    setContentPane(panel);  
  }  
  
  private CategoryDataset createDataset() {  
    DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
    try
    {
        double val1=((nr*1.0)/(nr+re))*100;
        double val2=((re*1.0)/(nr+re))*100;
        System.out.println("val1 "+val1);
        System.out.println("val2 "+val2);
      dataset.addValue(val1,"NR","Result Graph");
       dataset.addValue(val2,"RE","Result Graph");
    }
    catch(Exception ee)
    {
      System.out.println(ee);
    }
  
    return dataset;  
  }  
  
  public static void main(String[] args) throws Exception {  
    SwingUtilities.invokeAndWait(()->{  
      BarChartExample example=new BarChartExample("Bar Chart Window",50,50);  
      example.setSize(800, 400);  
      example.setLocationRelativeTo(null);  
      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
      example.setVisible(true);  
    });  
  }  
}  
