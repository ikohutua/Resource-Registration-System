<<<<<<< HEAD
$(document).on('change', '#userStatusId', function(event) {
	var json = {
		"status" : $("#userStatusId").val(),
		"login" : $("#login").text()
	};

	$.ajax({
		type : "POST",
		url : "get-all-inactive-users",
		dataType : "text",
		data : JSON.stringify(json),
		contentType : 'application/json; charset=utf-8',

		success : function() {
			var tr = $(event.target).closest("tr");
			tr.css("background-color", "#000000");
			tr.fadeIn(1000).fadeOut(200, function() {
				tr.remove();
			})
		}

	});
});
=======
$(document).on('change', '#userStatusId', function(event) {
	var json = {
		"status" : $("#userStatusId").val(),
		"login" : $("#login").text()
	};

	$.ajax({
		type : "POST",
		url : "get-all-inactive-users",
		dataType : "text",
		data : JSON.stringify(json),
		contentType : 'application/json; charset=utf-8',

		success : function() {
			var tr = $(event.target).closest("tr");
			tr.css("background-color", "#000000");
			tr.fadeIn(1000).fadeOut(200, function() {
				tr.remove();
			})
		}

	});
});
>>>>>>> 0bc10303861f3d1e44cca7f2cb34cb02d4101af7
