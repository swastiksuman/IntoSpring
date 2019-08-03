function showData(){
	var employeeid = $("#employeeid").val();
	console.log(employeeid);
	var x = {name: "S", id: employeeid, contactNumber: "7299942232"};
	$.ajax({
			type: "POST",
		  url: "/HelloWeb/searchResult",
		  data: x,
		  success: function( result ) {
		    $( "#result" ).html( "<strong>" + result + "</strong> degrees" );
		  },
		  error: function(error){
			  console.log(error);
		  }
		});
	
}