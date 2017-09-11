import java.io.File;
import java.io.IOException;
import java.util.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.hadoop.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
//import java.io.*;
import java.util.Date;
import java.util.Formatter;

import java.util.Scanner;
/**
 * Servlet implementation class Run
 */
public class hell extends HttpServlet{
private static final long serialVersionUID = 1L;

public void func() throws IOException, ClassNotFoundException, InterruptedException
{
	//Configuration conf = new Configuration();
//GenericOptionsParser parser = new GenericOptionsParser(conf, args);
	//args = parser.getRemainingArgs();
	
	Job job = new Job();

    // Set job name to locate it in the distributed environment
   // job.setJarByClass(NameDriver.class);
    job.setJobName("ex");
 //  Job job = new Job(conf, "ex");
	job.setOutputKeyClass(Text.class);
	job.setOutputValueClass(IntWritable.class);
	 job.setInputFormatClass(TextInputFormat.class);
     job.setOutputFormatClass(TextOutputFormat.class);
	Formatter formatter = new Formatter();

    FileInputFormat.setInputPaths(job, new Path("BigData.txt"));
	FileOutputFormat.setOutputPath(job, new Path("out"));

	String outpath = "Out"
	       + formatter.format("%1$tm%1$td%1$tH%1$tM%1$tS", new Date());

	
	 final String SRC_FOLDER = "out";
	 
	    
	 
	    	File directory = new File(SRC_FOLDER);
	 
	    	//make sure directory exists
	    	if(!directory.exists()){
	 
	          // System.out.println("Directory does not exist.");
	          
	 
	        }else{
	 
	           try{
	 
	               delete(directory);
	 
	           }catch(IOException e){
	               e.printStackTrace();
	               System.exit(0);
	           }
	        }
	 
	    	job.setMapperClass(NameMapper.class);
	    	job.setReducerClass(NameReducer.class);
	    	
	    	System.out.println(job.waitForCompletion(true));
	    	// final hell demo=new hell("Graphical Analysis");
//	    	   demo.pack();
	//    	   RefineryUtilities.centerFrameOnScreen(demo);
	  //  	   demo.setVisible(true);
	    	
}

 
    public void delete(File file)
    	throws IOException{
 
    	if(file.isDirectory()){
 
    		//directory is empty, then delete it
    		if(file.list().length==0){
 
    		   file.delete();
    		  
 
    		}else{
 
    		   //list all the directory contents
        	   String files[] = file.list();
 
        	   for (String temp : files) {
        	      //construct the file structure
        	      File fileDelete = new File(file, temp);
 
        	      //recursive delete
        	     delete(fileDelete);
        	   }
 
        	   //check the directory again, if empty then delete it
        	   if(file.list().length==0){
           	     file.delete();
        	   
        	   }
    		}
 
    	}else{
    		//if file, then delete it
    		file.delete();
    		//System.out.println("File is deleted : " + file.getAbsolutePath());
    	}
    
    }
   
   
    
    
   
     

    /**
     * @see HttpServlet#HttpServlet()
     */
    
        // TODO Auto-generated constructor stub
    
    

        

    
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
	try {
		func();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//NameDriver ob = new NameDriver();
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
public void doPost(HttpServletRequest request,
        HttpServletResponse response)
throws ServletException, IOException {System.out.print("hell");
doGet(request, response);

}

}