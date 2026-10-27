<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.util.ArrayList" %>
<%
    String user = request.getParameter("username");
    String item = request.getParameter("item");
    Date currentDate = new Date();
    ArrayList<String> items = new ArrayList<>();
    if (item != null) items.add(item);
    session.setAttribute("user", user);
%>
<!doctype html>
<html lang="en">
<head><meta charset="UTF-8"><title>JSP Objects Output</title></head>
<body>
  <h1>Output</h1>
  <h2>Implicit objects</h2>
  <p>request: <%= user %></p>
  <p>session: <%= session.getAttribute("user") %></p>
  <p>out: <% out.print("Rendered using out object"); %></p>
  <h2>Explicit objects</h2>
  <p>Date: <%= currentDate %></p>
  <p>ArrayList: <%= items %></p>
</body>
</html>
