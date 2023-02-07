<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Word Scrambler problem 2</title>
</head>
<body>
	<h1>Word Scrambler Problem 2:</h1>
	
	<form action="secondWordServlet" method="post">
	<h3>What is this word?:    HMINATCOS</h3>
	<input type="text" name="wordTwo" size="10">
	<input type="submit" value="Submit word"/>
	<input type="reset" value="Reset"/>
	</form>
</body>
</html>