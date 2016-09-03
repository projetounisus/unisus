function headerFunctions(){
	var logoutOpition = $("#logoutOption");
	
	logoutOpition.bind("click", function(){
	$.ajax({
	  url:utils.buildURL("/logout"),
	      success:function(data){
	        location.reload();
	      }
	    });
	});
}

$(document).ready(headerFunctions);