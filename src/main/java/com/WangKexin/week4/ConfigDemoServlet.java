package com.WangKexin.week4;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(name = "ConfigDemoServlet",urlPatterns = {"/config"},
        initParams = {
        @WebInitParam(name = "driver",value = "com.mysql.cj.jdbc.Driver"),
                @WebInitParam(name = "url",value = "jdbc:mysql://localhost:3306/week2?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT"),
                @WebInitParam(name = "username",value = "root"),
                @WebInitParam(name = "password",value = "wkx074527"),
                @WebInitParam(name = "name",value = "WangKexin"),
                @WebInitParam(name = "studentid",value = "2020211001001402")
        },
        loadOnStartup = 1
)
public class ConfigDemoServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {
        super.init();
        ServletConfig config = getServletConfig();
        String driver = config.getInitParameter("driver");
        String url = config.getInitParameter("url");
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection -->"+con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String name = config.getInitParameter("name");
        String studentid = config.getInitParameter("studentid");
        PrintWriter writer = response.getWriter();
        writer.println("Name : "+name);
        writer.println("studentID : "+studentid);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
