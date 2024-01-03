function validateForm() {
	var password = document.getElementById("password").value;
	console.log("calling js")
	// Check if password is greater than 6 characters
	if (password.length <= 6) {
		alert("Password must be greater than 6 characters.");
		return false;
	}

	// Check if password includes at least one number
	if (!/\d/.test(password)) {
		alert("Password must include at least one number.");
		return false;
	}

	// Check if password includes at least one alphabet
	if (!/[a-zA-Z]/.test(password)) {
		alert("Password must include at least one alphabet.");
		return false;
	}

	// Everything correct, the form will be submitted
	alert("Welcome to ISS")
	return true;
}