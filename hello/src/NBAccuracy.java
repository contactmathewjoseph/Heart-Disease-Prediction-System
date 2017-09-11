

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
import javax.servlet.*;
import javax.servlet.http.*;
public class NBAccuracy extends HttpServlet {
	 
	 public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	
	{
		response.setContentType("text/html");

		  PrintWriter outg = response.getWriter();
		try{
			 
    		File f = new File("/home/hduser/workspace1/hello/pren/out2.txt");
 
    		f.delete();
    			
    		}
 
        catch(Exception e){ }
		
	    int i,j,z,flag=0,i1,i2;
	    double inp[]=new double [13];
	    int c1[]=new int[] {0,0,0,0,0};
	    double pc[]=new double[] {0.54,0.18,0.118,0.115,0.043};
	 
	     int conf[][] =new int[5][6];
	     double para[][] =new double[5][7];
	     int tot[]= new int[]{0,0,0,0,0};
	     int fn[]= new int[]{0,0,0,0,0};
	     for(i=0;i<5;i++)
	    	 for(j=0;j<6;j++)
	    		 conf[i][j]=0;
	     
	     double a[]=new double[14];
		 double ag[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double bps[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double chol[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double thl[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double old[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 
		 double av[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double bpv[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double chov[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double thv[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double olv[]=new double[]{0.0,0.0,0.0,0.0,0.0};
		 double k,m,m1,m2;
		 
	  FileReader f2= new FileReader("/home/hduser/workspace1/hello/pren/Train.txt");
	  Scanner sn2 = new Scanner(f2);
	  sn2.useDelimiter("[,\r\n]");
	  
	  FileReader f1= new FileReader("/home/hduser/workspace1/hello/pren/Train.txt");
	  Scanner sn1 = new Scanner(f1);
	  sn1.useDelimiter("[,\r\n]");
	   

	for(i=0;i<242;i++)
	{
	for(j=0;j<14;j++)
	{
	a[j]=sn2.nextDouble();
	}
	z=(int)a[13];
	ag[z]=ag[z]+a[0];
	bps[z]=bps[z]+a[3];
	chol[z]=chol[z]+a[4];
	thl[z]=thl[z]+a[7];
	old[z]=old[z]+a[9];

	c1[z]=c1[z]+1;

	try{
	sn2.nextLine();
	}
	catch(NoSuchElementException e)
	{
	sn2.close();
	}
	}
	for(i=0;i<5;i++)
	{
		ag[i]=ag[i]/c1[i];	
		bps[i]=bps[i]/c1[i];
		chol[i]=chol[i]/c1[i];
		thl[i]=thl[i]/c1[i];
		old[i]=old[i]/c1[i];
		
	}
	for(i=0;i<242;i++)
	{
	for(j=0;j<14;j++)
	{
	a[j]=sn1.nextDouble();
	}
	z=(int)a[13];

	k=(a[0]-ag[z]);
	k=k*k;
	av[z]=av[z]+k;

	k=(a[3]-bps[z]);
	k=k*k;
	bpv[z]=bpv[z]+k;

	k=(a[4]-chol[z]);
	k=k*k;
	chov[z]=chov[z]+k;

	k=(a[7]-thl[z]);
	k=k*k;
	thv[z]=thv[z]+a[7];

	k=(a[9]-old[z]);
	k=k*k;
	olv[z]=olv[z]+a[9];

	try{
	sn1.nextLine();
	}
	catch(NoSuchElementException e)
	{
	sn1.close();
	}
	}
	for(i=0;i<5;i++)
	{
		av[i]=av[i]/c1[i];	
		bpv[i]=bpv[i]/c1[i];
		chov[i]=chov[i]/c1[i];
		thv[i]=thv[i]/c1[i];
		olv[i]=olv[i]/c1[i];

	}
	   
	    double ac1[]=new double[5]; //age
	    double sc1[]=new double[5];
	    double cpc1[]=new double[5];
	    double fbsc1[]=new double[5];  //tbps
	    double rc1[]=new double[5];    //chol
	    double ec1[]=new double[5];
	    double slc1[]=new double[5];
	    double cac1[]=new double[5];    //thal
	    double thc1[]=new double[5];    
	    double trc1[]=new double[5];    //oldpeak
	    double scc1[]=new double[5];
	    double hc1[]=new double[5];
	    double oc1[]=new double[5];
	    double b[]=new double[5];
	    double d[]=new double[5];
	    double maxi;
	    int op;
	    k=0.3989;

	    for(i=0;i<5;i++)
	    {
	    	m=inp[0]-ag[i];
	    
	    	ac1[i]=(k/Math.sqrt(av[i]))*(Math.exp(-0.5*(m/av[i])));
	   
	    	
	    	m=inp[3]-bps[i];
	  
	       fbsc1[i]=(k/Math.sqrt(bpv[i]))*(Math.exp(-0.5*(m/bpv[i])));
	    
	    
	    	
	    	m=inp[4]-chol[i];
	   
	       rc1[i]=(k/Math.sqrt(chov[i]))*(Math.exp(-0.5*(m/chov[i])));
	   
	    	
	         
	        m=inp[7]-thl[i];
	
	    	cac1[i]=(k/Math.sqrt(thv[i]))*(Math.exp(-0.5*(m/thv[i])));
	    	
	    	
	    	
	    	m=inp[9]-old[i];
	   
	    	trc1[i]=(k/Math.sqrt(olv[i]))*(Math.exp(-0.5*(m/olv[i])));
	    
	   
	    	
	    }

	   
	    FileReader f= new FileReader("/home/hduser/workspace1/hello/pren/test.txt");
	    Scanner ip = new Scanner(f);
	    ip.useDelimiter("[,\r\n]");
	    
	    while(ip.hasNextLine())
	    {
	    	flag=0;
	        for(j=0;j<13;j++)
	        {
	            inp[j]=ip.nextDouble();
	        }
	        
	        FileReader fin= new FileReader("/home/hduser/workspace1/hello/pren/Train.txt");
		    Scanner sn = new Scanner(fin);
		    sn.useDelimiter("[,\r\n]");
		    
	        
	    
	    int sc[]=new int[] {0,0,0,0,0};
	    int cpc[]=new int[] {0,0,0,0,0};
	    
	    
	    int ec[]=new int[] {0,0,0,0,0};
	    int slc[]=new int[] {0,0,0,0,0};
	   
	    int thc[]=new int[] {0,0,0,0,0};
	    
	    int scc[]=new int[] {0,0,0,0,0};
	    int hc[]=new int[] {0,0,0,0,0};
	    int oc[]=new int[] {0,0,0,0,0};
	   
	    op=0;

	for(i=0;i<242;i++)
	{
	for(j=0;j<14;j++)
	{
	a[j]=sn.nextDouble();
	}

	if(a[1]==inp[1])
	{
	    z=(int)a[13];
	    sc[z]++;
	   
	}
	if(a[2]==inp[2])
	{
	    z=(int)a[13];
	    cpc[z]++;
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

	if(a[8]==inp[8])
	{
	    z=(int)a[13];
	    thc[z]++;
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

	try{
	sn.nextLine();
	}
	catch(NoSuchElementException e)
	{
	sn.close();
	}
	}
	for(i=0;i<5;i++)
	{
		
		if(sc[i]==0 || cpc[i]==0 || ec[i]==0|| slc[i]==0 || thc[i]==0 || scc[i]==0 ||hc[i]==0 ||oc[i]==0)
		{
			flag=1;
			
			break;
		}
	}
	if(flag==1)
	{
		for(i=0;i<5;i++)
		{
	        
		    sc1[i]=(double)(sc[i]+2)/(c1[i]);
	       
	     
		    cpc1[i]=(double)(cpc[i]+2)/(c1[i]);
		    
		    ec1[i]=(double)(ec[i]+2)/(c1[i]);
		   
	       
	     
		    slc1[i]=(double)(slc[i]+2)/(c1[i]);
		  
		    thc1[i]=(double)(thc[i]+2)/(c1[i]);
		
		 
		    hc1[i]=(double)(hc[i]+2)/(c1[i]);
		
		    oc1[i]=(double)(oc[i]+2)/(c1[i]);
		
		}	
	}
	if(flag==0)
	{                      
	for(i=0;i<5;i++)
	{

	    
	    sc1[i]=(double)sc[i]/c1[i];
	    cpc1[i]=(double)cpc[i]/c1[i];
	    
	    
	    ec1[i]=(double)ec[i]/c1[i];
	    slc1[i]=(double)slc[i]/c1[i];
	   
	    thc1[i]=(double)thc[i]/c1[i];
	    
	    scc1[i]=(double)scc[i]/c1[i];
	    hc1[i]=(double)hc[i]/c1[i];
	    oc1[i]=(double)oc[i]/c1[i];
	    
	}
	}
	for(i=0;i<5;i++)
	{
	    b[i]=(double)ac1[i]*sc1[i]*cpc1[i]*fbsc1[i]*rc1[i]*ec1[i]*slc1[i]*cac1[i]*thc1[i]*trc1[i]*scc1[i]*hc1[i]*oc1[i];
	    
	    d[i]=(double)b[i]*pc[i];
	  
	}
	maxi=d[0];
	for(i=1;i<5;i++)
	{
	   if(d[i]>maxi)
	   {
	       maxi=d[i];
	        op=i;
	   }

	}
	 
	try{
		 PrintWriter out = new PrintWriter(new FileWriter("/home/hduser/workspace1/hello/pren/out2.txt",true));
		
		 out.println(op*1.0);
		 out.close();


		 }
		    catch(IOException e1) {
		      System.out.println("Error during reading/writing");
		 } 

		
		    try{
			 ip.nextLine();
			 }
			 catch(NoSuchElementException e)
			 {
		       ip.close();
		  	 }


	}
	    FileReader f3= new FileReader("/home/hduser/workspace1/hello/pren/sol1.txt");
		  Scanner sn3 = new Scanner(f3);
		  sn3.useDelimiter("[\r\n]");
		  
		  FileReader f4= new FileReader("/home/hduser/workspace1/hello/pren/out2.txt");
		  Scanner sn4 = new Scanner(f4);
		  sn4.useDelimiter("[\r\n]");
		  k=0;
		  for(i=0;i<61;i++)
		  {
			  m1=sn3.nextDouble();
			  m2=sn4.nextDouble();
			  i1=(int)m1;
			  i2=(int)m2;
			  tot[i1]++;
			  
			  if(m1==m2)
			  {  
				  conf[i1][i1]++;
				   k++;
			  }
			  
			  else
			  {
				  conf[i1][i2]++;
				  fn[i1]++;
				  
			  }
			  try{
				  sn3.nextLine();
				  sn4.nextLine();
				  }
				  catch(NoSuchElementException e)
				  { 
				   sn3.close();
				   sn4.close();
				  }
		  
	  
			  
		  }
		  
		  
		  k=k/61;
		  k=k*100;
		  outg.println("Overall Accuracy of Naive Bayes Heart Disease Predictor<br>");
		  
			DecimalFormat ob = new DecimalFormat("0.00");
			outg.println(ob.format(k)+"<br>");  
		  
		  for(i=0;i<5;i++)
			  for(j=0;j<5;j++)
			     conf[i][5]=conf[i][5]+conf[i][j];
		  
		  for(i=0;i<5;i++)
		  {	
			  for(j=0;j<5;j++)
			  {
				  para[i][0]=(double)conf[i][i]/tot[i];
				  para[i][1]=(double)(conf[i][5]-conf[i][i])/tot[i];
				  para[i][2]=1.0-para[i][1];
				  para[i][3]=(double)fn[i]/tot[i];
				  para[i][4]=para[i][0]/(para[i][0]+para[i][1]);
				  para[i][5]=para[i][0]/(para[i][0]+para[i][3]);
				  para[i][6]=((para[i][0]+para[i][2])/(para[i][0]+para[i][1]+para[i][2]+para[i][3]))*100;
				  
				  
				  
				  
			  }
		  }
		  
		  outg.println("<br><table><thead><tr><td>Accuracy Calculation Parameters</td></tr></thead></table><br>");
		  
		  outg.println("<br>True Positive False Positive True Negative False Negative Precision Recall Accuracy<br>");
		  for(i=0;i<5;i++)
		  {	
			  for(j=0;j<7;j++)
			  {
				  outg.print(ob.format(para[i][j])+"  "); 
			  }
			  outg.println("<br>");
		  }
		  
		  
		  
		  outg.println("<br>Confusion Matrix<br>");
		  outg.println();
		  outg.println(" a"+"  "+"b"+"  "+"c"+"  "+"d"+"  "+"e<br>");
		
		  for(i=0;i<5;i++)
		  {	
			  for(j=0;j<5;j++)
		    	 { outg.print(ob.format(conf[i][j])+"  "); 
		    	     }
		          outg.println("<br>");
		          }
		  
		
	      
}
}
