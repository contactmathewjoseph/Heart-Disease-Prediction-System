import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

// Extend HttpServlet class
public class InputForm extends HttpServlet {
 
  // Method to handle GET method request.
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
     
String a[]=new String[8];

a[0]=request.getParameter("firstname");
a[1]=request.getParameter("lastname");
a[2]=request.getParameter("mobile");
a[3]=request.getParameter("email");
a[4]=request.getParameter("optionRadios");
a[5]=request.getParameter("uname");
a[6]=request.getParameter("password");
a[7]=request.getParameter("renter");

	 response.setContentType("text/html");
	 PrintWriter pw = response.getWriter();
	 pw.println("<html><head><title>Registration</title><body> <table><caption>Registered Successfully!!</caption><tr><td>FIRST NAME</td><td> ");
	 pw.println(a[0]);
	 pw.println("</td><tr><td>LAST NAME</td><td>");
	 pw.println(a[1]);
	 pw.println("</td><tr><td>MOBILE</td><td>");
	 pw.println(a[2]);
	 pw.println("</td><tr><td>EMAIL</td><td>");
	 pw.println(a[3]);
	 pw.println("</td><tr><td>DESIGNATION</td><td>");
	 pw.println(a[4]);
	 pw.println("</td><tr><td>USER ID</td><td>");
	 pw.println(a[5]);
	 pw.println("</table>");
	 pw.println("<a href='home1.jsp'>HOME</a>");



	 pw.println("</body></html>");
	 pw.close();
	PrintWriter ob = new PrintWriter(new FileOutputStream("/home/hduser/workspace1/hello/register.txt",true));
		
		for(int i=0;i<7;i++)
			 ob.print(a[i]+" ");
			
	ob.println();
		 ob.close();
  }
  // Method to handle POST method request.
  public void doPost(HttpServletRequest request,
                     HttpServletResponse response)
      throws ServletException, IOException {
     doGet(request, response);
  }
}