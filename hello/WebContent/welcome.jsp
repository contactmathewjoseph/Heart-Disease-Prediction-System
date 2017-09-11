<%@page import="java.io.*;" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String val[]=new String[7];
int flag=0;
response.setContentType("text/html");
PrintWriter ou = response.getWriter();
String a = request.getParameter("uname");
String b = request.getParameter("pass"); 
BufferedReader br = new BufferedReader(new FileReader("/home/hduser/workspace1/hello/register.txt"));


	String s;
while ((s= br.readLine()) != null){
	val=s.split(" ");	
	if(a.equals(val[5]) && b.equals(val[6]))
		{
		 %>
		
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<style type="text/css">
			 <%@ include file="hme.css" %> 

			 
			</style>
			<body>
	<% 		ou.println("<center><font size=\"12\"color=\"black\" face=\"Lucida Calligraphy\">Welcome"+" "+val[0]+" "+val[1]+"</font></center><br><br><br>"); %>
<center><font size="12" color="black" face="times new roman"><u>HEART DISEASE PREDICTION SYSTEM</u></font></center><br><br><br>
 <ul id="menu">
    <li>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <a href="home1.jsp">HOME</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
    <li><a href="guidelines.jsp"  >GUIDELINES</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
     <li><a href="about.jsp" >CONTACT US </a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
      <li><a href="home1.jsp" >LOG OUT</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
      </ul>
      <br>
      <br>
      <br>
        <table border="0" width="60%" cellpadding="3" align="center" background="ll.jpg">
                <thead>
                <tr>
     <td> <h2> . Diagnose Single Patient for Heart disease </h2></td>
     </tr>
     <tr><td></td></tr>
      <tr>
   <td>&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; <a href='patientform.jsp'> <input type="button" value="CLICK HERE!!!" /></a></td>
    </tr><br>
  <tr><td></td></tr>
  <tr><td></td></tr>
    <tr>
   <td> <h2> . Diagnose Multiple Patient for Heart disease </h2></td>
    <br>
     </tr>
     <tr>
      <td> <h3> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; OR</h3>   </td> 
        </tr> 
        <tr>      
   <td> <h2> . Get Population Survey Over Heart Disease</h2>  </td> 
   </tr>
    <tr><td></td></tr>
    <tr>            
   <td>&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;  <a href='upload.jsp'> <input type="button" value="CLICK HERE!!!" /></a></td> 
  </tr> 
  <tr><td></td></tr> 
  <tr>      
   <td> <h2> .Test our application for accuracy</h2>  </td> 
   </tr>
    <tr><td></td></tr>
    <tr>            
   
   <td>&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;  <a href='NBAccuracy'> <input type="button" value="CLICK HERE!!!" /></a></td> 
  </tr> 
   </table>
</body>
</html>
			<% 
		flag=1;
		break;
		}

}
if(flag==0)
	 out.println("Incorrect Username or Password");
		
		
 br.close();
%>