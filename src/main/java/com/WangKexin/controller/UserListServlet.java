package com.WangKexin.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/admin/userList")
public class UserListServlet extends HttpServlet {
    private Connection con = null;

    @Override
    public void init() throws ServletException  {
        con = (Connection) getServletContext().getAttribute("con");
    }
    public void destroy() {
        super.destroy();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = "/WEB-INF/views/admin/userList.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
