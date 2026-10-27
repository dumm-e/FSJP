package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String url = System.getenv().getOrDefault("DB_URL", "jdbc:mysql://localhost:3306/login_db");
        String dbUser = System.getenv().getOrDefault("DB_USER", "root");
        String dbPassword = System.getenv().getOrDefault("DB_PASSWORD", "");
        String sql = "SELECT username FROM users WHERE username = ? AND password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);
                try (ResultSet result = statement.executeQuery()) {
                    if (result.next()) {
                        HttpSession session = request.getSession();
                        session.setAttribute("username", result.getString("username"));
                        response.sendRedirect("welcome.jsp");
                    } else {
                        response.sendRedirect("login.jsp?error=1");
                    }
                }
            }
        } catch (Exception e) {
            getServletContext().log("Login database request failed", e);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            try (PrintWriter out = response.getWriter()) {
                out.println("<h2>Database connection error. Check server configuration.</h2>");
            }
        }
    }
}

