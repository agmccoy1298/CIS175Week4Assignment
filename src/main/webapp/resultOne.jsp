<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Word Result</title>
</head>
<body>
	<h1>First Word Result</h1>
	<p>${firstWordValidator.toString()} <br />
	<a href="firstHome.jsp"> Try Again</a>
	<a href="secondHome.jsp"> Go To Next Word</a>
	

</body>
</html>