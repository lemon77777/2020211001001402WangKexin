package com.WangKexin.controller;

import com.WangKexin.dao.OrderDao;
import com.WangKexin.model.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/orderDetails")
public class OrderDetailsServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {
        con = (Connection) getServletContext().getAttribute("con");
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int orderId = request.getParameter("orderId")!=null?Integer.parseInt(request.getParameter("orderId")):0;
        Item item = new Item();
        OrderDao dao = new OrderDao();
        List<Item> items = dao.findItemsByOrderId(con,orderId);
        request.setAttribute("itemList",items);
        String path = "orderDetails.jsp";
        request.getRequestDispatcher(path).forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
