
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;





// Extend HttpServlet class
public class InputFrm extends HttpServlet {
	
	
	

  // Method to handle GET method request.
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
	  
	  // Set response content type
      response.setContentType("text/html");
String a[]=new String[16];

a[0]=request.getParameter("fname");
a[1]=request.getParameter("lname");
a[2]=request.getParameter("age");
a[3]=request.getParameter("gen");
a[4]=request.getParameter("chos");
a[5]=request.getParameter("bp");
a[6]=request.getParameter("rer");
a[7]=request.getParameter("eia");
a[8]=request.getParameter("spe");
a[9]=request.getParameter("ca");
a[10]=request.getParameter("thal");
a[11]=request.getParameter("tbp");
a[12]=request.getParameter("sc");
a[13]=request.getParameter("thalh");
a[14]=request.getParameter("peak");
a[15]=request.getParameter("optionsRadios");
String s,s1,s2,s3,s4;

if(a[3].equals("0"))
	s="Male";
else
	s="Female";
if(a[6].equals("0"))
	s1="Normal";
else if(a[6].equals("1"))
	s1="Wave Abnormality";
else 
    s1="Showing";

if(a[7].equals("0"))
	s2="Yes";
else
	s2="No";
if(a[8].equals("0"))
	s3="Unsloping";
else if(a[8].equals("1"))
	s3="Flat";
else 
    s3="Down Sloping";
if(a[10].equals("3"))
	s4="Normal";
else if(a[10].equals("6"))
	s4="Fixed Defect";
else 
    s4="Reversible Defect";


PrintWriter ob = new PrintWriter(new FileWriter("/home/hduser/workspace1/hello/register2.txt",true));
	for(int i=0;i<16;i++)
	{
		
		 ob.print(a[i]+" ");
		
	} ob.close(); 
//System.out.println("successful");
 
response.setContentType("text/html");

PrintWriter out = response.getWriter();
String title = "USER REPORT";
//String s1="center";
String docType =
"<!doctype html public \"-//w3c//dtd html 4.0 " +
"transitional//en\">\n";
out.println(docType +
          "<html>\n" +
          "<head><title>" + title + "</title></head>\n" +
          "<body bgcolor=\"#f0f0f0\">\n" +
          "<h1 align=\"center\">" + title + "</h1>\n" +
  /*        "<ul align="+s1+">\n" +
          "  <li><b>First Name</b>:"
          +"\t"+a[0] + "\n" +
          "  <li><b>Last Name</b>:"
          +"\t"+a[1] + "\n" +
          "</ul>\n" +*/
          "\n" +
          "  <b>FIRST NAME</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[0] + "<br>" +
          "  <b>LAST NAME</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[1] + "<br>" +
          "  <b>AGE</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[2] + "<br>" +
          "  <b>GENDER</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s + "<br>" +
          "  <b>CHOLESTROL(units)</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[4] + "<br>" +
          "  <b>BLOOD PRESSURE(mm of Hg)</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[5] + "<br>" +
          "  <b>RESTING ELECTROGRAPHIC RESULTS</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s1+ "<br>" +
          "  <b>EXCERSICE INDUCED ANGINA</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s2 + "<br>" +
          "  <b>SLOPE OF THE PEAK EXCERSICE</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s3+ "<br>" +
          "  <b>CA</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[9] + "<br>" +
          "  <b>THAL</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +s4 + "<br>" +
          "  <b>TREST BLOOD PRESSURE(mg/dl)</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[11] + "<br>" +
          "  <b>SERUM CHOLESTROL(mm of Hg)</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[12] + "<br>" +
          "  <b>THALH</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[13] + "<br>" +
          "  <b>OLD PEAK</b>:&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
          +a[14] + "<br>" +
         
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