const emailInput = document.getElementById("email");
const passwordInput = document.getElementById("password");
const message = document.getElementById("message");

document.getElementById("login-button").addEventListener("click", () => {
  const email = emailInput.value.trim();
  if (!email) {
    message.textContent = "Please enter your email address.";
    return;
  }
  if (!email.includes("@") || !email.includes(".")) {
    message.textContent = "Invalid email address. Include '@' and '.'.";
    return;
  }
  if (!passwordInput.value) {
    message.textContent = "Please enter your password.";
    return;
  }
  message.textContent = "Login successful!";
});
