<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%
    HttpSession sessionObj = request.getSession(false);
    String username = sessionObj == null ? null : (String) sessionObj.getAttribute("username");
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!doctype html>
<html lang="en">
<head><meta charset="UTF-8"><title>Welcome</title></head>
<body>
  <h1>Welcome, <%= username.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("'", "&#39;") %>!</h1>
  <p>Login successful.</p>
</body>
</html>
