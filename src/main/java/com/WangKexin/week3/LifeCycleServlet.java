package com.WangKexin.week3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet {
    public LifeCycleServlet() {
        System.out.println("i am in constructor --> LifeCycleServlet()");
    }

    @Override
    public void init() {
        System.out.println("i am in init()");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service() --> doGet()");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("i am in destroy()");
    }
}
