<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>

<!-- Passing the Get Parmeter and Displaying the Data on Web -->
<!-- My Name is ${name} and Password is ${password } -->

<!-- Creating a Form for the User -->
<form action="/login.do" method="post">
	<p><font color="red">${errorMessage }</font></p>

	<div> Enter your name here <input type ="text" name ="name"/> </div>  <br/>
	<div> Enter your password here <input type ="password" name ="password"/> </div> <br/>
	<input type = "submit" value="Login"/>
</form>

</body>
</html>


<!-- If the Vaid User <Send to Welcome Page> -->
<!-- If the Invalid User <Send to Login Page> -->