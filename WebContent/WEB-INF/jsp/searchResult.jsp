<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Submitted Employee Information</h2>
    <table>
    	<c:forEach var="employee" items="${employeeList}">
        <tr>
            <td>Name :</td>
            <td>${employee.name}</td>
        </tr>
        <tr>
            <td>ID :</td>
            <td>${employee.id}</td>
        </tr>
        <tr>
            <td>Contact Number :</td>
            <td>${employee.contactNumber}</td>
        </tr>
        </c:forEach>
    </table>
    <%@ include file="footer.jsp" %>  
</body>
</html>