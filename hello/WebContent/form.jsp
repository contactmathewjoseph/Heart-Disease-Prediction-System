<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
href="css/bootstrap-responsive.css">
<link rel="stylesheet" type="text/css"
href="css/bootstrap-responsive.min.css">
<style type="text/css">
	 <%@ include file="hme.css" %> 
</style>
<script type='text/javascript'>
function validateForm()
{
var phoneno = /^\d{10}$/; 
var x=document.forms["myForm"]["email"].value;
var y=document.forms["myForm"]["mobile"].value;
var z=document.forms["myForm"]["firstname"].value;
var w=document.forms["myForm"]["lastname"].value;
var w1=document.forms["myForm"]["uname"].value;
var w2=document.forms["myForm"]["password"].value;
var w3=document.forms["myForm"]["renter"].value;
var msg;

var atpos=x.indexOf("@");
var dotpos=x.lastIndexOf(".");
var a="These fields are invalid: ";
var b=a.length;
if(z==null || z==""||w==null || w=="")
{
a=a+"Name fields, ";
}

if (!(y.match(phoneno)))
{
a=a+"Mobile number, ";
}

if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
  {
	a=a+"Email address, ";
  
  }
if(w1==null || w1=="")
{
a=a+"User-id, ";
}  
if(w2==null || w2==""||w3==null || w3=="")
{
a=a+"Password fields";
}  

var c=a.length;
if(c>b)
	{
alert(a);
return false;
	}
if(c==b && w2!=w3)
	{
	msg="Two passwords donot match";
	alert(msg);
	return false;
	}
}
</script>
</head>
<body>
<center><font size="12" color="black" face="times new  roman"><u>HEART DISEASE PREDICTION SYSTEM</u></font></center><br><br><br>
 <ul id="menu">
    <li>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <a href="home1.jsp">HOME</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
    <li><a href="guidelines.jsp"  >GUIDELINES</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
     <li><a href="about.jsp" >CONTACT US </a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
      <li><a href="home1.jsp" > LOG OUT</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</li>
     
     
   
    </ul>
<h1 align="center">
<b>REGISTRATION FORM</b>
</h1>
<form name=myForm action="InputForm" method="post" onsubmit="return validateForm();">
<center>
 <table border="0" width="50%" cellpadding="3" align="left" background="ll.jpg">
                <thead>
                    <tr>
                        <th colspan="2">REGISTER HERE</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
<td><label for="inputFirstname">FIRST NAME
</label>
&nbsp; &nbsp;
<input type="text" name="firstname" maxlength="12"></input></td>


</tr>
 <br>
<tr><td>
<label for="inputLastname">LAST NAME </label>
&nbsp; &nbsp;&nbsp;
<input type="text" name="lastname" maxlength="12"></input></td>

</tr>
 <br>
<tr><td>
<label for="inputMobile">MOBILE</label>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
<input type="text" name="mobile" maxlength="10" ></input></td></tr>
 
 <br>
<tr><td>
<label for="inputEmail">E-MAIL</label>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;
<input type="text" name="email" maxlength="50"></input></td></tr>


 
<tr><td>

<label for="cp">DESIGNATION * </label ></td></tr>
<br>
<br><tr><td>
<input type="radio" name="optionRadios" id="optionsRadios1" value="MedicalOfficer/Physician/Doctor" checked>Medical Officer/Physician/Doctor &nbsp; &nbsp; &nbsp; 
<input type="radio" name="optionRadios" id="optionsRadios2" value="ResearchAnalyst">Research Analyst &nbsp; &nbsp; &nbsp;
<input type="radio" name="optionRadios" id="optionsRadios3" value="OTHER">OTHER
</td></tr>

 <br>
 <tr><td>
<label for="User-Id">USER ID
</label>
&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
<input type="text" name="uname" maxlength="12"></input>
</td></tr>

 <br>
<tr><td>
PASSWORD *&nbsp;&nbsp;<input type="password" name="password"value="" /> </td></tr>
<br>
<br>
<tr><td>
RE-ENTER *&nbsp;&nbsp;&nbsp;<input type="password" name="renter" value="" /></td></tr>

 <br><tr><td>

<input type="reset" value="Reset" />&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
 <input type="submit" value="Submit" /></td></tr>
</tbody>
 </table>
</form>
</body>
</html>