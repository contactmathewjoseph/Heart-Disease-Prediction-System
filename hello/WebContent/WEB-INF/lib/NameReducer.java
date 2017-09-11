// WordCountReducer.java
import java.io.IOException;

import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

public class NameReducer extends
        Reducer<Text, IntWritable, Text, IntWritable> {
    protected void reduce(Text key, Iterable<IntWritable> values,
            Context context) throws IOException, InterruptedException {
        int sum = 0;
        String a[]=new String[]{"0","1","2","3","4"};
        String v=key.toString(); 
        for (IntWritable value : values) {
            sum += value.get();
     
        }     
         
       
        	 context.write(key, new IntWritable(sum));
        
    
        
       
       
    }
}
