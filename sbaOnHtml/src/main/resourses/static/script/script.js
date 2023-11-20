
//if statement,External script requirment
function checkLetterEntry(elm_id, expected) {
	var alpha_val = document.getElementById(elm_id).value;
	if (alpha_val != '' && alpha_val != expected) {
		alert_val = confirm("Please enter: " + expected);
		if (alert_val) {
			callBackAfterConfirm(elm_id);
		}
	}
}
//use of callback function
function callBackAfterConfirm(elm_id) {
	document.getElementById(elm_id).value = '';
}

function submitForm() {
	document.getElementById('myForm').submit();
	return false;
}

document.addEventListener('DOMContentLoaded', function() {
});
// event call examples

function showPicture(imageName) {
	var imagePath = '../images/' + imageName;
	window.open(imagePath, '_blank');
}

//!--  Login page function(with regex requirment,form)
function validateForm() {
	// Regex for email validation
	var emailRegex = /^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$/;

	// Get input values
	var name = document.getElementById('firstname').value;
	var email = document.getElementById('email').value;

	// Validate email using regex
	if (!emailRegex.test(email)) {
		alert('Invalid email address');
		return false;
	}


	return true;
}
//functionality for requirment of loops and collection..
function submitAlphaForm(formElement) {
	const alphas = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
	for (i = 0; i < alphas.length; i++) {
		let letter = alphas[i];
		let elem_id = letter + '_input_text';
		var alpha_val = document.getElementById(elem_id).val;
		if (!alpha_val || alpha_val == '') {
			document.getElementById('error_message').innerHTML = 'Please complete Alphabet sheet first.';
			alert('Please complete Alphabet sheet first.');
			break;
		} else {
			formElement.submit();
		}

	}
}