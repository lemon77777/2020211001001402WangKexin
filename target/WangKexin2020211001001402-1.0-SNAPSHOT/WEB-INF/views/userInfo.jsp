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
<%--<%
    Cookie [] allCookies = request.getCookies();
    for (Cookie c : allCookies) {
        out.println("<br/>"+c.getName()+" --- "+c.getValue());
    }
%>--%>
<%
//    Users users = (Users)request.getAttribute("user");
    Users u = (Users)session.getAttribute("user");
%>
<table>
    <tr>
        <td>ID:</td><td><%=u.getId()%></td>
    </tr>
    <tr>
        <td>Username:</td><td><%=u.getUsername()%></td>
    </tr>
    <tr>
        <td>Password:</td><td><%=u.getPassword()%></td>
    </tr>
    <tr>
        <td>Email:</td><td><%=u.getEmail()%></td>
    </tr>
    <tr>
        <td>Gender:</td><td><%=u.getGender()%></td>
    </tr>
    <tr>
        <td>Birth Date:</td><td><%=u.getBirth()%></td>
    </tr>
    <tr>
        <td style="border: #0019ff 1px solid;"><a href="updateUser" style="text-decoration: none; color: #0019ff">Update User</a></td>
    </tr>
</table>
<%@include file="footer.jsp"%>
