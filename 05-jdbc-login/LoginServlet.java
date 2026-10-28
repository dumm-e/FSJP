package test;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        String url = "jdbc:mysql://localhost:3306/login_db";
        String dbUser = "root";
        String dbPass = "11838920";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, dbUser, dbPass);

            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next())
                out.println("<h2>Login Successful</h2>");
            else
                out.println("<h2>Invalid username or password</h2>");

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            out.println("Database Error: " + e.getMessage());
        }
    }
}
