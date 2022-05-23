package com.Lab1.assignment1;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/countServlet")
public class Method1countServlet extends HttpServlet {
    //using local variable to storage the accessed times (can not shared by others)
    private int counts = 0;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ++counts;
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<h1>this page has been accessed "+counts+" times</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
