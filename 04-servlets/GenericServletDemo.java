package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/generic")
public class GenericServletDemo extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!doctype html><html><body>");
        out.println("<h2>Generic Servlet Example</h2>");
        out.println("<p>Hello! This is a Generic Servlet.</p>");
        out.println("</body></html>");
    }
}

