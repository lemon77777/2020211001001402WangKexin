package com.WangKexin.controller;

import com.WangKexin.dao.UserDao;
import com.WangKexin.model.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet("/updateUser")
public class UpdateUserServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {
        super.init();
        con = (Connection) getServletContext().getAttribute("con");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/updateUser.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birth = request.getParameter("birth");
        Users users = new Users();
        users.setId(Integer.parseInt(id));
        users.setUsername(username);
        users.setPassword(password);
        users.setEmail(email);
        users.setGender(gender);
        users.setBirth(Date.valueOf(birth));
        UserDao userDao = new UserDao();
        try {
            int update = userDao.updateUser(con,users);
            if (update == 0) {
                HttpSession session = request.getSession();//create session if session not exist -- otherwise return existing session
                session.setMaxInactiveInterval(10);
                //change request(one page) to session -- can get session attribute in many jsp
                session.setAttribute("user",users);
                request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request,response);
            }
            else {
                request.setAttribute("updateFail","updateUser fail!");
                request.getRequestDispatcher("WEB-INF/views/updateUser.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
