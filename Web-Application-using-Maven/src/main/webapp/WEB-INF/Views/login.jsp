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
My Name is ${name} and Password is ${password }

<!-- Creatinga Form for the User -->
<form action="/login.do">
	Enter your name here <input type ="text" name ="name"/> <input type = "submit" name = "Click to Submit"/>
</form>

</body>
</html>