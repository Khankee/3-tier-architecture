$(document).ready(function () {
	
	
	$("#btn").click(function () {
		var dataArray = $("#Form").serializeArray(),
			dataObj = {};

		$(dataArray).each(function (i, field) {
			dataObj[field.name] = field.value;
		});

		
		$('#Form').on('submit', function (e) {
			$.post('http://localhost:8080/NC1600-WebApp/Servlet', 
				{
					Java_d1: dataObj['d1'],
					Java_d2: dataObj['d2'],
					Java_d3: dataObj['d3'],
				},
				function (data, status) {
					//This gets executed when post is successful
					//alert(data + "/" + status);
					$("#AjaxServletResponse").text(data);
					
				}).error(function () {
				// This is executed when the call to post failed
			});
			//We now prevent the page from refreshing after post
			e.preventDefault();
		});
	});
});
