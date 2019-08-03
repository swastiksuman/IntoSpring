function showData(){
	var x = {name: "S", id: 1, contactNumber: "7299942232"};
	$.ajax({
			type: "POST",
		  url: "/HelloWeb/searchResult",
		  data: {
		    zipcode: x
		  },
		  success: function( result ) {
			  console.log(result);
		    $( "#result" ).html( "<strong>" + result + "</strong> degrees" );
		  },
		  error: function(error){
			  console.log(error);
		  }
		});
	
}