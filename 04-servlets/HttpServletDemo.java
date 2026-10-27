package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/http")
public class HttpServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!doctype html><html><body>");
        out.println("<h2>HTTP Servlet Example</h2>");
        out.println("<p>Hello! This is an HTTP Servlet.</p>");
        out.println("<p>GET request received successfully.</p>");
        out.println("</body></html>");
    }
}

