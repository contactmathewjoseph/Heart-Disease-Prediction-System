import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
 
/**
 * Servlet implementation class JFreeChartServlet
 */
public class jfree extends HttpServlet {
 //private static final long serialVersionUID = 1L;
 
 /**
  * @see HttpServlet#HttpServlet()
  */
 public jfree() {
  super();
  
  // TODO Auto-generated constructor stub
 }
 

 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
  *      response)
  */
 protected void doGet(HttpServletRequest request,
   HttpServletResponse response) throws ServletException, IOException {
	
	 response.setContentType("image/png");
	 
	 ServletOutputStream os = response.getOutputStream();

	 DefaultCategoryDataset dataset = new DefaultCategoryDataset();
  
 
  
      final String series1 = "No disease";
      final String series2 = "Disease";
      String b1;
      double a1;
     // final String series3 = "Third";
      File file = new File("/home/hduser/workspace1/hello/out/part-r-00000");
     // File file1 = new File("big1.txt");
      try{
  	Scanner  scanner = new Scanner(file);
  	
  
      while (scanner.hasNextLine()) {
      	Double b=scanner.nextDouble();
      	int a=scanner.nextInt();
      	int c=b.intValue();
      	
      	a1=a;
      	b1=Integer.toString(c);
      	dataset.addValue(a1, series1, b1);
    
      	b=scanner.nextDouble();
      	a=scanner.nextInt();
      	c=b.intValue();
      	a1=a;
      	b1=Integer.toString(c);
      	dataset.addValue(a1, series2, b1);
      
      	
      } 
      }
      catch(NoSuchElementException e)
      { }
    
  	JFreeChart chart = ChartFactory.createBarChart("Graphical Analysis", "Age",
      		    "No.of People", dataset, PlotOrientation.VERTICAL, true, true, false);
      		 

      // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

      // set the background color for the chart...
      

      // get a reference to the plot for further customisation...
         
  RenderedImage chartImage = chart.createBufferedImage(1500, 1000);
  ImageIO.write(chartImage, "png", os);
  os.flush();
  os.close(); 
   
      }  
    
 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
  *      response)
  */
 protected void doPost(HttpServletRequest request,
   HttpServletResponse response) throws ServletException, IOException {
 doGet(request,response);
 }
 
}