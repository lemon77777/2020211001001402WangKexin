<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2022/5/20
  Time: 1:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyDearJsp</title>
</head>
<body>
<%--using jsp scripts--%>
<%
    String name = request.getParameter("name");
    String clas = request.getParameter("clas");
    String ID = request.getParameter("ID");
    String submit = request.getParameter("submit");
    response.setContentType("text/html");
    PrintWriter writer = response.getWriter();
    writer.println("<h1>Using java code in jsp</h1>");
    writer.println("<h2>Using jsp scripts</h2>");
    writer.println("name:"+name+"<br/>");
    writer.println("class:"+clas+"<br/>");
    writer.println("ID:"+ID+"<br/>");
    writer.println("submit:"+submit+"<br/>");
%>
<h2>Using jsp expressions</h2>
name:<%= request.getParameter("name")%><br/>
class:<%= request.getParameter("clas")%><br/>
ID:<%= request.getParameter("ID")%><br/>
submit:<%= request.getParameter("submit")%>
<h1>Using EL</h1>
name:${param.name}<br/>
class:${param.clas}<br/>
ID:${param.ID}<br/>
submit:${param.submit}
</body>
</html>
