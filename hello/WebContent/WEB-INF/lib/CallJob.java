


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Formatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

/**
 * Servlet implementation class CallJob
 */

public class CallJob extends HttpServlet {

    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

    	Configuration conf = new Configuration();
        //	GenericOptionsParser parser = new GenericOptionsParser(conf, args);
        //	args = parser.getRemainingArgs();
        	
        	//Job job = new Job();

            // Set job name to locate it in the distributed environment
           
            //job.setJobName("NameDriver");
           Job job = new Job(conf, "ex");
           job.setJarByClass(CallJob.class);
           job.setOutputKeyClass(Text.class);
        	job.setOutputValueClass(IntWritable.class);
        	 job.setInputFormatClass(TextInputFormat.class);
             job.setOutputFormatClass(TextOutputFormat.class);
        	Formatter formatter = new Formatter();

            FileInputFormat.setInputPaths(job, new Path("BigData.txt"));
        	FileOutputFormat.setOutputPath(job, new Path("out"));

        	String outpath = "Out"
        	       + formatter.format("%1$tm%1$td%1$tH%1$tM%1$tS", new Date());

        	
        	    	job.setMapperClass(NameMapper.class);
        	    	job.setReducerClass(NameReducer.class);
        	    	
        	    //	System.out.println(job.waitForCompletion(true));
   }
}
