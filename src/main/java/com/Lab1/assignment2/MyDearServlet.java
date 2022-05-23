package com.Lab1.assignment2;

import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;

@WebServlet("/MyDear")
public class MyDearServlet extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        String name = request.getParameter("name");
        String clas = request.getParameter("clas");
        String ID = request.getParameter("ID");
        String submit = request.getParameter("submit");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head><title>UsingServlet</title></head>");
        writer.println("<body><h1>Using Servlet</h1>name:"+name+"<br/>");
        writer.println("class:"+clas+"<br/>");
        writer.println("ID:"+ID+"<br/>");
        writer.println("submit:"+submit+"<br/></body></html>");
        writer.close();
    }
}
