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
        		var message = {"name": "asad", "id": 1, "contactNumber": "ads"};
        		alert(message);
			$.ajax({
				type: "POST",
				url: "/HelloWeb/addEmployee?name=Swastik",
				
				success: function(){
					$("#message").html("<p>Ho Gaya</p>");
				}, error: function(xhr, status, error) {
					  alert(xhr.responseText);
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
                    <td><input id="name" name="name"/></td>
                </tr>
                <tr>
                    <td><label>Id</label></td>
                    <td><input id="id" name="id"/></td>
                </tr>
                <tr>
                    <td><label>Contact Number</label></td>
                    <td><input id="contactNumber" name="contactNumber"/></td>
                </tr>
                <tr>
                    
                </tr>
                </tbody>
            </table>
        </form>
        <button onclick="doSubmit()">Submit</button>
        <div id="message"></div>
    </body>
</html>
 