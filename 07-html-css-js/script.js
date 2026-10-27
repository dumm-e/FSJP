const loginButton = document.getElementById("login-button");
const message = document.getElementById("message");

loginButton.addEventListener("click", () => {
  const username = document.getElementById("username").value.trim();
  const password = document.getElementById("password").value;

  if (!username || !password) {
    message.textContent = "Please enter username and password.";
  } else if (username === "admin" && password === "1234") {
    message.textContent = "Login successful!";
  } else {
    message.textContent = "Invalid username or password.";
  }
});
