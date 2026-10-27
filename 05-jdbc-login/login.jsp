<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head><meta charset="UTF-8"><title>Login</title></head>
<body>
  <main>
    <h1>Login</h1>
    <% if ("1".equals(request.getParameter("error"))) { %>
      <p role="alert">Invalid username or password.</p>
    <% } %>
    <form action="LoginServlet" method="post">
      <label>Username <input type="text" name="username" required></label><br>
      <label>Password <input type="password" name="password" required></label><br>
      <button type="submit">Login</button>
    </form>
  </main>
</body>
</html>
