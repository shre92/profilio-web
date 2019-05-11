function checkDuplicateUser(username){
	if(username != null && username.length >= 3){
		$.ajax({
			type: "POST",
			async: false, 
			url : "/ProfilioWeb/ajaxCheck.html?username=" + username,
			success: function(data){
				if(data != null && data == "userAlreadyPresent"){
					alert("User Already Esxists, Please choose a different username");
				}
			}
		});
	}
}