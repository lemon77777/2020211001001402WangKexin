<%@ page import="com.WangKexin.model.Users" %><%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2022/4/2
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Info</h1>
<%
    Cookie [] allCookies = request.getCookies();
    for (Cookie c : allCookies) {
        out.println("<br/>"+c.getName()+" --- "+c.getValue());
    }
%>
<%
    Users users = (Users)request.getAttribute("user");
%>
<table>
    <tr>
        <td>Username:</td><td><%=users.getUsername()%></td>
    </tr>
    <tr>
        <td>Password:</td><td><%=users.getPassword()%></td>
    </tr>
    <tr>
        <td>Email:</td><td><%=users.getEmail()%></td>
    </tr>
    <tr>
        <td>Gender:</td><td><%=users.getGender()%></td>
    </tr>
    <tr>
        <td>Birth Date:</td><td><%=users.getBirth()%></td>
    </tr>
</table>
