import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;

public class Report extends HttpServlet {
 
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      
    int i,j,z;

String a[]=new String[15];
a[0]=request.getParameter("fname");
a[1]=request.getParameter("lname");
a[2]=request.getParameter("age");
a[3]=request.getParameter("gen");
a[4]=request.getParameter("cp");
a[5]=request.getParameter("tbp");
a[6]=request.getParameter("sc");
a[7]=request.getParameter("fbs");
a[8]=request.getParameter("rer");
a[9]=request.getParameter("tlch");
a[10]=request.getParameter("eia");
a[11]=request.getParameter("op");
a[12]=request.getParameter("spe");
a[13]=request.getParameter("ca");
a[14]=request.getParameter("thal");
for(i=2;i<=14;i++)
System.out.print(a[i]);

    double inp[]=new double [13];
    int c1[]=new int[] {164,55,36,35,13};

    for(i=0;i<13;i++)
    inp[i]= Double.parseDouble(a[i+2]);
   
    double b[]=new double[14];
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
    double b1[]=new double[5];
    double d[]=new double[5];
    double maxi;
    int op=0;

    FileReader fin= new FileReader("/home/hduser/workspace1/hello/in.txt");
    Scanner sn = new Scanner(fin);
    sn.useDelimiter("[,\r\n]");
    int ac[]=new int[] {0,0,0,0,0};
    int sc[]=new int[] {0,0,0,0,0};
    int cpc[]=new int[] {0,0,0,0,0};
    int tpbc[]=new int[] {0,0,0,0,0};
    int scc[]=new int[] {0,0,0,0,0};
    int fbsc[]=new int[] {0,0,0,0,0};
    int rerc[]=new int[] {0,0,0,0,0};
    int tlhc[]=new int[] {0,0,0,0,0};
    int eiac[]=new int[] {0,0,0,0,0};
    int opc[]=new int[] {0,0,0,0,0};
    int spec[]=new int[] {0,0,0,0,0};
    int cac[]=new int[] {0,0,0,0,0};
    int thalc[]=new int[] {0,0,0,0,0};
  //  int nc[]=new int[] {0,0,0,0,0};
 


String s,s1,s2,s3,s4,s5,s6,s7;

if(a[3].equals("0"))
	s="Male";
else
	s="Female";
if(a[4].equals("1"))
	s1="Typical Angina";
else if(a[4].equals("2"))
	s1="Atypical Angina";
else if(a[4].equals("3"))
    s1="Non-Anginal";
else s1="Asymptomatic";

if(a[8].equals("0"))
	s3="Normal";
else if(a[8].equals("1"))
	s3="ST-T Wave Abnormality";
else 
    s3="Left Ventricular Hypertropy";

if(a[7].equals("1"))
	s2="True";
else
	s2="False";
if(a[10].equals("0"))
s4="Yes";
else
s4="No";

if(a[12].equals("0"))
	s6="Unsloping";
else if(a[12].equals("1"))
	s6="Flat";
else 
    s6="Down Sloping";
if(a[14].equals("3"))
	s7="Normal";
else if(a[14].equals("6"))
	s7="Fixed Defect";
else 
    s7="Reversible Defect";

  
for(i=0;i<303;i++)
{
for(j=0;j<14;j++)
{
b[j]=sn.nextDouble();
}
if(b[0]==inp[0])
{
    z=(int)b[13];
    ac[z]++;
   
}
if(b[1]==inp[1])
{
    z=(int)b[13];
    sc[z]++;
}
if(b[2]==inp[2])
{
    z=(int)b[13];
    cpc[z]++;
}
if(b[3]==inp[3])
{
    z=(int)b[13];
    tpbc[z]++;
}
if(b[4]==inp[4])
{
    z=(int)b[13];
    scc[z]++;
}
if(b[5]==inp[5])
{
    z=(int)b[13];
    fbsc[z]++;
}
if(b[6]==inp[6])
{
    z=(int)b[13];
    rerc[z]++;
}
if(b[7]==inp[7])
{
    z=(int)b[13];
    tlhc[z]++;
}
if(b[8]==inp[8])
{
    z=(int)b[13];
    eiac[z]++;
}
if(b[9]==inp[9])
{
    z=(int)b[13];
    opc[z]++;
}
if(b[10]==inp[10])
{
    z=(int)b[13];
    spec[z]++;
}
if(b[11]==inp[11])
{
    z=(int)b[13];
    cac[z]++;
}
if(b[12]==inp[12])
{
    z=(int)b[13];
    thalc[z]++;
}
try{
sn.nextLine();
}
catch(NoSuchElementException e)
{ }


}

for(i=0;i<5;i++)
{

    ac1[i]= (double)ac[i]/c1[i];
    sc1[i]=(double)sc[i]/c1[i];
    cpc1[i]=(double)cpc[i]/c1[i];
    fbsc1[i]=(double)tpbc[i]/c1[i];
    rc1[i]=(double)scc[i]/c1[i];
    ec1[i]=(double)fbsc[i]/c1[i];
    slc1[i]=(double)rerc[i]/c1[i];
    cac1[i]=(double)tlhc[i]/c1[i];
    thc1[i]=(double)eiac[i]/c1[i];
    trc1[i]=(double)opc[i]/c1[i];
    scc1[i]=(double)spec[i]/c1[i];
    hc1[i]=(double)cac[i]/c1[i];
    oc1[i]=(double)thalc[i]/c1[i];

}
sn.close();
for(i=0;i<5;i++)
{
    b1[i]=(double)ac1[i]*sc1[i]*cpc1[i]*fbsc1[i]*rc1[i]*ec1[i]*slc1[i]*cac1[i]*thc1[i]*trc1[i]*scc1[i]*hc1[i]*oc1[i];
     d[i]=(double)b[i]*pc[i];
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

PrintWriter ob = new PrintWriter(new FileWriter("/home/hduser/workspace1/hello/register2.txt",true));
for(i=0;i<15;i++)
{
	
	 ob.print(a[i]+" ");
	
}
ob.println();
ob.close(); 
 
if(inp[3]==145.0)
{
	s5="No Disease: Safe level";
}
else if(inp[3]==120.0)
{
	s5="Has Disease:Low Risk level";
}
else if(inp[3]==160.0)
{
	s5="Has Disease:Medium Risk level";
}
else if(op==140.0)
{
	s5="Has Disease:High Risk level";
}
else
{
	s5="Has Disease:Very High Risk level";
}



response.setContentType("text/html");

PrintWriter out = response.getWriter();
String title = "PATIENT REPORT";
//String s1="center";
String docType =
"<!doctype html public \"-//w3c//dtd html 4.0 " +
"transitional//en\">\n";
out.println(docType +
          "<html>\n" +
          "<head><title>" + title + "</title></head>\n" +
          "<body bgcolor=\"#f0f0f0\">\n" +
          "<h1 align=\"center\">" + title + "</h1>\n" +
  
          "\n" +
          "  <b>FIRST NAME</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[0] + "<br>" +
          "  <b>LAST NAME</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[1] + "<br>" +
          "  <b>AGE</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[2] + "<br>" +
          "  <b>GENDER</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s + "<br>" +
          "  <b>CHEST PAIN TYPE</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s1 + "<br>" +
          "  <b>TREST BLOOD PRESSURE(mm of Hg)</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[5] + "<br>" +
          "  <b>SERUM CHOLESTROL</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[6]+ "<br>" +
          "  <b>FASTING BLOOD PRESSURE</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s2 + "<br>" +
          "  <b>RESTING ELECTROGRAPHIC RESULTS</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s3 + "<br>" +
          "  <b>MAXIMUM HEART BEAT RECEIVED</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[9] + "<br>" +
          "  <b>EXCERCISE INDUCED ANGINA</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s4 + "<br>" +
          "  <b>OLD PEAK</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[11] + "<br>" +
          "  <b>SLOPE OF THE PEAK EXCERSICE</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s6 + "<br>" +
          "  <b>CA</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[13] + "<br>" +
          "  <b>THALH</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s7 + "<br>" +
          "  <b>HEART DISEASE STATUS:</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s5 + "<br>" +
          "\n" +
          "</body></html>");


  }
  // Method to handle POST method request.
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
     doGet(request, response);
   }
  }
