<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/js/search.js" var="search" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ZELTAR</title>
</head>
<body>
	<a href="/HelloWeb/employee"> Register</a>
	<br>
	<a href="/HelloWeb/login">  Login</a>
	<br>
	<a href="/HelloWeb/search">  Search</a>
	<%@ include file="footer.jsp" %>
	<%@ include file="search.jsp" %>
</body>
</html>