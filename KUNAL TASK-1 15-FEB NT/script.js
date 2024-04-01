function submitForm(event) {
  event.preventDefault();

  let form = document.getElementById("Registrationform");
  let username = form.elements["username"].value;
  let email = form.elements["email"].value;
  let password = form.elements["password"].value;

  let message = "Registration successful!\n";
  message += "Username: " + username + "\n";
  message += "Email: " + email;

  document.getElementById("message").innerText = message;
}
