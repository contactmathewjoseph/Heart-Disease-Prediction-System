


import java.io.IOException;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

public class Redchol extends
        Reducer<Text, IntWritable, Text, IntWritable> {

    protected void reduce(Text key, Iterable<IntWritable> values,
            Context context) throws IOException, InterruptedException {
      int n=0,y=0,val;
      
        for (IntWritable value : values) {
        	
        	val=value.get();
        	if(val==0)
        		{
        		n++;
        		
        		}
        				
        	else{
        		y++;
        		
        		 }
        		 
        	
        }
        context.write(key,new IntWritable (y));
    	context.write(key,new IntWritable (n));
     
        }     
         
       
     
    
        
       
       
    
}

