<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<spring:url value="/resources/js/search.js" var="search" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="${search}"></script>
</head>

<title>ZELTAR</title>
</head>
<body>
	<form:form method="POST" action="/HelloWeb/searchResult" modelAttribute="employee">
             <table>
                
                <tr>
                    <td><form:label path="id">Id</form:label></td>
                    
                    <td><form:input path="id"/></td>
                </tr>
                                <tr>
                    <td><input type="submit" value="Fetch"/></td>
                </tr>
            </table>
        </form:form>
        <button onclick="showData()">Test</button>
        
        <div>
        	<p id="result"></p>
        </div>
</body>
</html>