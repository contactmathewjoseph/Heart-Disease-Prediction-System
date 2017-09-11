
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;

//import java.util.Date;
//import java.util.Formatter;
//import java.util.NoSuchElementException;
import java.util.Scanner;
//import java.util.StringTokenizer;
//import org.apache.hadoop.mapred.OutputCollector;
//import org.apache.hadoop.mapred.Reporter;

//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
//import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
//import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
//import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
//import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
//import org.apache.hadoop.util.GenericOptionsParser;


class NameMapper extends Mapper<LongWritable, Text, Text,IntWritable>
{
public void map(LongWritable key, Text value, Context context)
                        throws IOException,InterruptedException  {
	int i,j,z;
	final IntWritable one = new IntWritable(1);
    int c1[]=new int[] {164,55,36,35,13};
   
   // char c[]=new char[14];
    double inp[]=new double [13];
    double a[]=new double[44];
    double pc[]=new double[] {0.54,0.18,0.118,0.115,0.043};
    double ac1[]=new double[5];
    double sc1[]=new double[5];
    double cpc1[]=new double[5];
    double fbsc1[]=new double[5];
    double rc1[]=new double[5];
    double ec1[]=new double[5];
    double slc1[]=new double[5];
    double cac1[]=new double[5];
    double thc1[]=new double[5];
    double trc1[]=new double[5];
    double scc1[]=new double[5];
    double hc1[]=new double[5];
    double oc1[]=new double[5];
    double b[]=new double[5];
    double d[]=new double[5];
    double maxi;
    int op=0;
    
        
        FileReader fin= new FileReader("in.txt");
       Scanner sn = new Scanner(fin);
       sn.useDelimiter("[,\r\n]");
        int ac[]=new int[] {0,0,0,0,0};
        int sc[]=new int[] {0,0,0,0,0};
        int cpc[]=new int[] {0,0,0,0,0};
        int fbsc[]=new int[] {0,0,0,0,0};
        int rc[]=new int[] {0,0,0,0,0};
        int ec[]=new int[] {0,0,0,0,0};
        int slc[]=new int[] {0,0,0,0,0};
        int cac[]=new int[] {0,0,0,0,0};
        int thc[]=new int[] {0,0,0,0,0};
        int trc[]=new int[] {0,0,0,0,0};
        int scc[]=new int[] {0,0,0,0,0};
        int hc[]=new int[] {0,0,0,0,0};
        int oc[]=new int[] {0,0,0,0,0};
        String line = value.toString();

        String[] val=line.split(",");
        for(int q=0;q<13;q++)
        {
        	inp[q]=Double.parseDouble(val[q]);
        }

        for(i=0;i<303;i++)
        {
        for(j=0;j<14;j++)
        {
        a[j]=sn.nextDouble();
        }
        if(a[0]==inp[0])
        {
            z=(int)a[13];
          //  printf("%d\n",z);
            ac[z]++;
           // printf("%d\n",ac[z]);
        }
        if(a[1]==inp[1])
        {
            z=(int)a[13];
           // printf("%d\n",z);
            sc[z]++;
           // printf("%d\n",sc[z]);
        }
        if(a[2]==inp[2])
        {
            z=(int)a[13];
            cpc[z]++;
        }
        if(a[3]==inp[3])
        {
            z=(int)a[13];
            fbsc[z]++;
        }
        if(a[4]==inp[4])
        {
            z=(int)a[13];
            rc[z]++;
        }
        if(a[5]==inp[5])
        {
            z=(int)a[13];
            ec[z]++;
        }
        if(a[6]==inp[6])
        {
            z=(int)a[13];
            slc[z]++;
        }
        if(a[7]==inp[7])
        {
            z=(int)a[13];
            cac[z]++;
        }
        if(a[8]==inp[8])
        {
            z=(int)a[13];
            thc[z]++;
        }
        if(a[9]==inp[9])
        {
            z=(int)a[13];
            trc[z]++;
        }
        if(a[10]==inp[10])
        {
            z=(int)a[13];
            scc[z]++;
        }
        if(a[11]==inp[11])
        {
            z=(int)a[13];
            hc[z]++;
        }
        if(a[12]==inp[12])
        {
            z=(int)a[13];
            oc[z]++;
        }
        //if(a[13]==inp[13])
           // z=a[13];
           // pc[z]++;


        sn.nextLine();
        }
        for(i=0;i<5;i++)
        {

            ac1[i]= (double)ac[i]/c1[i];
            sc1[i]=(double)sc[i]/c1[i];
            cpc1[i]=(double)cpc[i]/c1[i];
            fbsc1[i]=(double)fbsc[i]/c1[i];
            rc1[i]=(double)rc[i]/c1[i];
            ec1[i]=(double)ec[i]/c1[i];
            slc1[i]=(double)slc[i]/c1[i];
            cac1[i]=(double)cac[i]/c1[i];
            thc1[i]=(double)thc[i]/c1[i];
            trc1[i]=(double)trc[i]/c1[i];
            scc1[i]=(double)scc[i]/c1[i];
            hc1[i]=(double)hc[i]/c1[i];
            oc1[i]=(double)oc[i]/c1[i];
            // pc[i]=pc[i]/c[i];

        }
        for(i=0;i<5;i++)
        {
            b[i]=(double)ac1[i]*sc1[i]*cpc1[i]*fbsc1[i]*rc1[i]*ec1[i]*slc1[i]*cac1[i]*thc1[i]*trc1[i]*scc1[i]*hc1[i]*oc1[i];
            //printf("%1.22lf \n",b[i]);
             d[i]=(double)b[i]*pc[i];
             // printf("%1.22lf \n",d[i]);
        }
        maxi=d[0];
        for(i=0;i<5;i++)
        {
           if(d[i]>maxi)
           {
               maxi=d[i];
                op=i;
           }

        }
     
    String clas = Integer.toString(op);
               //context.write(new Text(val[0]), new IntWritable((int)op));   
               //  context.write(new Text(val[0]), new IntWritable(op)); 
                context.write(new Text(clas), one);
                        
}                            
                        
                        
                }

