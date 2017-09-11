import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

/**
 * Servlet implementation class UploadServlet
 */
public class upload extends HttpServlet {
    //private static final long serialVersionUID = 1L;
	 List items;
     Iterator iter;
     FileItem item;
     String fileName;
     String filePath;
        
 //   private static final String DATA_DIRECTORY = "data";
    private static final int MAX_MEMORY_SIZE = 1024 * 1024 * 2;
    private static final int MAX_REQUEST_SIZE = 1024 * 1024;
    public void func(String fileName) throws IOException, ClassNotFoundException, InterruptedException
    {
    	//Configuration conf = new Configuration();
    
    	
    	Job job = new Job();

        // Set job name to locate it in the distributed environment
       // job.setJarByClass(NameDriver.class);
        job.setJobName("ex");
     //  Job job = new Job(conf, "ex");
    	job.setOutputKeyClass(Text.class);
    	job.setOutputValueClass(IntWritable.class);
    	 job.setInputFormatClass(TextInputFormat.class);
         job.setOutputFormatClass(TextOutputFormat.class);
    	

        FileInputFormat.setInputPaths(job, new Path(fileName));
    	FileOutputFormat.setOutputPath(job, new Path("/home/hduser/workspace1/hello/out"));

    	
    	
    	 final String SRC_FOLDER = "/home/hduser/workspace1/hello/out";
    	 
    	    
    	 
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
        public void func1(String fileName) throws IOException, ClassNotFoundException, InterruptedException
        {
        	//Configuration conf = new Configuration();
        
        	
        	Job job = new Job();

            // Set job name to locate it in the distributed environment
           // job.setJarByClass(NameDriver.class);
            job.setJobName("ex1");
         //  Job job = new Job(conf, "ex");
        	job.setOutputKeyClass(Text.class);
        	job.setOutputValueClass(IntWritable.class);
        	 job.setInputFormatClass(TextInputFormat.class);
             job.setOutputFormatClass(TextOutputFormat.class);
        	
            FileInputFormat.setInputPaths(job, new Path(fileName));
        	FileOutputFormat.setOutputPath(job, new Path("/home/hduser/workspace1/hello/out1"));

        	

        	
        	 final String SRC_FOLDER = "/home/hduser/workspace1/hello/out1";
        	 
        	    
        
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
        	 
        	    	job.setMapperClass(MapAge.class);
        	    	job.setReducerClass(RedAge.class);
        	    	
        	    	
        	    	System.out.println(job.waitForCompletion(true));
        	    
        	    	
        }
        public void func2(String fileName) throws IOException, ClassNotFoundException, InterruptedException
        {
        	//Configuration conf = new Configuration();
        
        	
        	Job job = new Job();

            // Set job name to locate it in the distributed environment
           // job.setJarByClass(NameDriver.class);
            job.setJobName("ex2");
         //  Job job = new Job(conf, "ex");
        	job.setOutputKeyClass(Text.class);
        	job.setOutputValueClass(IntWritable.class);
        	 job.setInputFormatClass(TextInputFormat.class);
             job.setOutputFormatClass(TextOutputFormat.class);
        	
            FileInputFormat.setInputPaths(job, new Path(fileName));
        	FileOutputFormat.setOutputPath(job, new Path("/home/hduser/workspace1/hello/out2"));

        	

        	
        	 final String SRC_FOLDER = "/home/hduser/workspace1/hello/out2";
        	 
        	    
        
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
        	 
        	    	job.setMapperClass(MapAge.class);
        	    	job.setReducerClass(RedAge.class);
        	    	
        	    	
        	    	System.out.println(job.waitForCompletion(true));
        	    
        	    	
        }

        public void func3(String fileName) throws IOException, ClassNotFoundException, InterruptedException
        {
        	//Configuration conf = new Configuration();
        
        	
        	Job job = new Job();

            // Set job name to locate it in the distributed environment
           // job.setJarByClass(NameDriver.class);
            job.setJobName("ex3");
         //  Job job = new Job(conf, "ex");
        	job.setOutputKeyClass(Text.class);
        	job.setOutputValueClass(IntWritable.class);
        	 job.setInputFormatClass(TextInputFormat.class);
             job.setOutputFormatClass(TextOutputFormat.class);
        	
            FileInputFormat.setInputPaths(job, new Path(fileName));
        	FileOutputFormat.setOutputPath(job, new Path("/home/hduser/workspace1/hello/out3"));

        	

        	
        	 final String SRC_FOLDER = "/home/hduser/workspace1/hello/out3";
        	 
        	    
        
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
        	 
        	    	job.setMapperClass(MapBp.class);
        	    	job.setReducerClass(RedBp.class);
        	    	
        	    	
        	    	System.out.println(job.waitForCompletion(true));
        	    
        	    	
        }
        public void func4(String fileName) throws IOException, ClassNotFoundException, InterruptedException
        {
        	//Configuration conf = new Configuration();
        
        	
        	Job job = new Job();

            // Set job name to locate it in the distributed environment
           // job.setJarByClass(NameDriver.class);
            job.setJobName("ex4");
         //  Job job = new Job(conf, "ex");
        	job.setOutputKeyClass(Text.class);
        	job.setOutputValueClass(IntWritable.class);
        	 job.setInputFormatClass(TextInputFormat.class);
             job.setOutputFormatClass(TextOutputFormat.class);
        	
            FileInputFormat.setInputPaths(job, new Path(fileName));
        	FileOutputFormat.setOutputPath(job, new Path("/home/hduser/workspace1/hello/out4"));

        	

        	
        	 final String SRC_FOLDER = "/home/hduser/workspace1/hello/out4";
        	 
        	    
        
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
        	 
        	    	job.setMapperClass(chol.class);
        	    	job.setReducerClass(Redchol.class);
        	    	
        	    	
        	    	System.out.println(job.waitForCompletion(true));
        	    
        	    	
        }
       
            
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Check that we have a file upload request
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);

        if (!isMultipart) {
            return;
        }

      
        DiskFileItemFactory factory = new DiskFileItemFactory();

       
        factory.setSizeThreshold(MAX_MEMORY_SIZE);

       
        ServletFileUpload upload = new ServletFileUpload(factory);

        upload.setSizeMax(MAX_REQUEST_SIZE);

        try { 
             items = upload.parseRequest(request);
             iter = items.iterator();
            while (iter.hasNext()) {
                item = (FileItem) iter.next();
                fileName = new File(item.getName()).getName();
                if (!item.isFormField()) {
                   
                  filePath = "/home/hduser/workspace1/hello/"+fileName;
                    //String filePath = "Desktop" ;
                    File uploadedFile = new File(filePath);
                    System.out.println(filePath);
                    // saves the file to upload directory
                    item.write(uploadedFile);
                   
                }
                //getServletContext().getRequestDispatcher("/done.jsp").forward(
                  //             request, response);
                func(filePath);  
                func1(filePath);
                func2(filePath);
                func3(filePath);
                func4(filePath);
                }

            // displays done.jsp page after upload finished
         getServletContext().getRequestDispatcher("/done.jsp").forward(
                    request, response);

        } catch (FileUploadException ex) {
            throw new ServletException(ex);
        } catch (Exception ex) {
            throw new ServletException(ex);
        }

    }

}