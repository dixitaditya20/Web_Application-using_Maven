<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo Page</title>
</head>
<body>
<p>Welcome ${name} </p>
<p>My Todos are :-  </p>
<ol>
	<c:forEach items="${todos }" var="todo"></c:forEach>
	<li><${todo }/li>
</ol>

</body>
</html>