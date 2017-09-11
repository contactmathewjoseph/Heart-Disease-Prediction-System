

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
 * Servlet implementation class CallJobFromServlet
 */



public class CallJobFromServlet extends HttpServlet {

   protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

   Configuration conf = new Configuration();
   // Replace CallJobFromServlet.class name with your servlet class
       Job job = new Job(conf, " CallJobFromServlet.class"); 
       job.setJarByClass(CallJobFromServlet.class);
       job.setJobName("Job Name");
       job.setOutputKeyClass(Text.class);
       job.setOutputValueClass(Text.class);
       job.setMapperClass(NameMapper.class); // Replace Map.class name with your Mapper class
       job.setNumReduceTasks(30);
       job.setReducerClass(NameReducer.class); //Replace Reduce.class name with your Reducer class
       job.setMapOutputKeyClass(Text.class);
       job.setMapOutputValueClass(Text.class);
       job.setInputFormatClass(TextInputFormat.class);
       job.setOutputFormatClass(TextOutputFormat.class);

       // Job Input path
       FileInputFormat.addInputPath(job, new 
       Path("/home/hduser/workspace1/hello/BigData.txt")); 
       // Job Output path
       FileOutputFormat.setOutputPath(job, new 
       Path("/home/hduser/workspace1/hello/output.txt")); 

       //job.waitForCompletion(true);
  }
}


