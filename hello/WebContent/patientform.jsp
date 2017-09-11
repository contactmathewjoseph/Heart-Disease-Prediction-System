<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	 <%@ include file="hme.css" %> 

	 </style>
</head>
<body>
<center><font size="12" color="black" face="times new roman"><u>HEART DISEASE PREDICTION SYSTEM</u></font></center><br><br><br>

<ul id="menu">
    <li>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  <a href="home1.jsp">HOME</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; 

&nbsp; &nbsp; &nbsp; &nbsp;</li>
    <li><a href="guidelines.jsp"  >GUIDELINES</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 

&nbsp; &nbsp; &nbsp; &nbsp;</li>
     <li><a href="about.jsp" >CONTACT US </a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 

&nbsp;</li>
      <li><a href="home1.jsp" >LOG OUT</a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 

&nbsp;</li>
     </ul>
     <form method="post" action="Report">
   
     <table border="0" width="70%" cellpadding="3" align="center" background="blue.jpg">
                <thead>
                    <tr>
                        <th colspan="2"></th>
                    </tr>
                </thead>
                <tbody>
                <tr>
                        <td><a href='guide.jsp'>Medical Data Required</a>
                        </td>
                    </tr>
                    
                        <tr>
                        <td><a href='guide.jsp'>For more information refer user guide</a>
                        </td>
                    </tr>
                        </td>
                    </tr>
                    <tr>
                        <td>FIRST NAME</td>
                        <td><input type="text" name="fname" value="" /></td>
                    </tr>
                    <tr>
                        <td>LAST NAME</td>
                        <td><input type="text" name="lname" value="" /></td>
                    </tr>
                    <tr>
                        <td>AGE</td>
                        <td><input type="text" name="age" value="" /></td>
                    </tr>
                     <tr>
                        <td>GENDER</td>
                        <td>
                <input type="radio" name="gen" id="optionsRadios1"
              value="0.0" checked>MALE &nbsp; &nbsp; &nbsp;
               <input type="radio" name="gen" id="optionsRadios2" value="1.0">FEMALE
&nbsp; &nbsp; &nbsp;</td>
                    </tr>
                       <tr>
                        <td>CHEST PAIN TYPE</td>
                        <td>
                <input type="radio" name="cp" id="optionsRadios1"
              value="1.0" checked>TYPICAL ANGINA &nbsp; &nbsp; &nbsp;
               <input type="radio" name="cp" id="optionsRadios2" value="2.0">ATYPICAL ANGINA
&nbsp; &nbsp; &nbsp;
                   
                  <input type="radio" name="cp" id="optionsRadios3" value="3.0">NON-ANGINAL
&nbsp; &nbsp; &nbsp;
<input type="radio" name="cp" id="optionsRadios4" value="4.0">ASYMPTOMATIC
&nbsp; &nbsp; &nbsp;</td>
 
                    </tr>
                    <tr>
                        <td> TREST BLOOD PRESSURE(mm of Hg)</td>
                        <td><input type="text" name="tbp" value="" /></td>
                    </tr>
                    <tr>
                        <td>SERUM CHOLESTROL(mg/dl)</td>
                        <td><input type="text" name="sc" value="" /></td>
                    </tr>
                    <tr>
                        <td>FASTING BLOOD PRESSURE</td>
                       <td>  <input type="radio" name="fbs" id="optionsRadios1"
              value="1.0" checked>TRUE 
             
               <input type="radio" name="fbs" id="optionsRadios2" value="0.0">FALSE
&nbsp; &nbsp; &nbsp;
                    </tr>
                    <tr>
                        <td>RESTING ELECTROGRAPHIC RESULTS</td>
                        <td> <input type="radio" name="rer" id="optionsRadios1" value="0.0" checked>NORMAL &nbsp; &nbsp; &nbsp;
               <input type="radio" name="rer" id="optionsRadios2" value="1.0">ST-T WAVE ABNORMALITY
&nbsp; &nbsp; &nbsp;<input type="radio" name="rer" id="optionsRadios3"
              value="2.0" >LEFT VENTRICULAR HYPERTROPHY &nbsp; &nbsp; &nbsp;</td>
                    </tr>
                    <tr>
                        <td>MAXIMUM HEART BEAT RECEIVED</td>
                        <td><input type="text" name="tlch" value="" /></td>
                    </tr>
                    <tr>
                        <td>EXCERSICE INDUCED ANGINA</td>
                        <td>  <input type="radio" name="eia" id="optionsRadios1"
              value="0.0" checked>YES
               <input type="radio" name="eia" id="optionsRadios2" value="1.0">NO</td>
                    </tr>
      
                    <tr>
                        <td>OLD PEAK</td>
                        <td><input type="text" name="op" value="" /></td>
                    </tr>
                    <tr>
                    
                    <tr>
                        <td>SLOPE OF THE PEAK EXCERSICE</td>
                        <td><input type="radio" name="spe" id="optionsRadios1"
              value="1.0" checked>UP SLOPING &nbsp; &nbsp; &nbsp;
               <input type="radio" name="spe" id="optionsRadios2" value="2.0">FLAT
&nbsp; &nbsp; &nbsp;<input type="radio" name="spe" id="optionsRadios3"
              value="3.0" >DOWN SLOPING &nbsp; &nbsp; &nbsp;</td>
                    </tr>
                    <tr>
                        <td>CA</td>
                        <td><input type="text" name="ca" value=" " /></td>
                    </tr>
                    <tr>
                        <td>THAL</td>
                        <td><input type="radio" name="thal" id="optionsRadios1"
              value="3.0" checked>NORMAL &nbsp; &nbsp; &nbsp;
               <input type="radio" name="thal" id="optionsRadios2" value="6.0">FIXED DEFECT
&nbsp; &nbsp; &nbsp;<input type="radio" name="thal" id="optionsRadios3"
              value="7.0" >REVERSIBLE DEFECT&nbsp; &nbsp; &nbsp;</td>
                    </tr>

                    <tr>
                        <td>PLEASE CHOOSE THE DIAGNOSIS METHOD</td>
                        <td><input type="submit" value="Naive Bayes">
                          </td>
                    </tr>
                   </tbody>
            </table>
            </form>
</body>
</html>