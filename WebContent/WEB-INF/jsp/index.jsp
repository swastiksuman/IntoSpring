<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<script>
	function register(){
		$.ajax({
			type: "GET",
		  url: "/HelloWeb/employee",
		  
		  success: function( result ) {
			  console.log(result);
		    $( "#content" ).html(result);
		  },
		  error: function(error){
			  console.log(error);
		  }
		});
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ZELTAR</title>
</head>
<body>
	<nav>
	<div class="nav-wrapper">
		<a href="#" class="brand-logo right">ZELTAR</a>
		<ul id="nav-mobile" class="left hide-on-med-and-down">
			<li onclick="register()">Register</li>
			<li><a href="/HelloWeb/search">Search</a></li>
		</ul>
		<div id="content" class="container">
			<div id="content" class="row">
			
			</div>
			<div class="row">
				
			</div>
		</div>
	</div>
	</nav>

	<%@ include file="footer.jsp"%>
</body>
</html>