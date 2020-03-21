<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<spring:url value="/resources/js/search.js" var="search" />
            
<script src="${search}"></script>
</head>

<title>ZELTAR</title>
</head>
<body>
	    <table>
                
                <tr>
                    <td><label path="id">Id</label></td>
                    
                    <td><input id="employeeid"/></td>
                </tr>
                                <tr>
                    <td><button class="btn waves-effect waves-light" onclick="showData()">Fetch</button></td>
                </tr>
            </table>
        
        <div>
        	<p id="result"></p>
        </div>
</body>
</html>