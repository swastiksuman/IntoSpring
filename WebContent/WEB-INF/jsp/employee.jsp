<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    	<script>
    		function doSubmit(){
        		var x = $("#employeeForm").serialize();
        		alert(x);
			$.ajax({
				type: "POST",
	            contentType: "application/json",
	            Accept : "application/json",
				data: JSON.stringify(x),
				dataType : 'json',
				url: "/HelloWeb/addEmployee",
				
				success: function(){
					$("#message").html("<p>Ho Gaya</p>");
				}, error: function(){
					alert('xxxx');
					}
			});
    		}
    	</script>
    </head>
    <body>
        <form id="employeeForm">
             <table class="striped">
             	<tbody>
                <tr>
                    <td><label>Name</label></td>
                    <td><input name="name"/></td>
                </tr>
                <tr>
                    <td><label>Id</label></td>
                    <td><input name="id"/></td>
                </tr>
                <tr>
                    <td><label>Contact Number</label></td>
                    <td><input name="contactNumber"/></td>
                </tr>
                <tr>
                    <td><button onclick="doSubmit()">Submit</button></td>
                </tr>
                </tbody>
            </table>
        </form>
        <div id="message"></div>
    </body>
</html>
 