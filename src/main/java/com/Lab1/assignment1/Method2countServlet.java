package com.Lab1.assignment1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/countServlet2")
public class Method2countServlet extends HttpServlet {
    //using ServletContext storage object which can global shared
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        Object count = servletContext.getAttribute("count");
        if (count == null) {
            count = 1;
            servletContext.setAttribute("count",count);
        }
        else {
            int number = Integer.valueOf(String.valueOf(count)) + 1;
            servletContext.setAttribute("count",number);
        }
        response.getWriter().write("<h1>this page has been accessed "+count+" times</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
