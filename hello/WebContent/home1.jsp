
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
    <style type="text/css">
	 <%@ include file="hme.css" %> 

	 
	</style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Untitled Document</title>
    <script type='text/javascript'>
    
function validateForm()
{
var x=document.forms["myForm"]["uname"].value;
var y=document.forms["myForm"]["pass"].value;
if (x==null || x=="" || y==null || y=="")
  {
  alert("Username or Password is empty");
  return false;
  }
}
</script>

    </head>
     
<body >
<center><font size="12" color="black" face="times new roman"><u>HEART DISEASE PREDICTION SYSTEM</u></font></center><br><br><br>

<ul id="menu">
    <li>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <a href="home1.jsp">HOME</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
    <li><a href="guidelines.jsp"  >GUIDELINES</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
     <li><a href="form.jsp" >SIGN UP </a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
      <li><a href="about.jsp" >CONTACT US</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
     
     
   
    </ul>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>

  
    <br></br>
        <form name="myForm" method="post" action="welcome.jsp" onsubmit="return validateForm()">
            <center>
            <table border="0" width="30%" cellpadding="3" align="right" background="gr.jpg">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                    <tr>
                    <td></td></tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                    <td></td></tr>
                    <tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                    <td></td></tr>
                    <tr>
                    <tr>
                      <td></td>
                       <td><a href='input.jsp'><input type="submit" value="Login" /></a>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="reset" value="Reset" />
                      </td>
                         
                    </tr>
                   <tr>
                    <td></td></tr>
                    <tr>
                    <tr>
                    <td></td></tr>
                    <tr>
                </tbody>
            </table>
            </center>
        </form>
        	  <%@ include file="aboutus.jsp" %>
    </body>
 </html>