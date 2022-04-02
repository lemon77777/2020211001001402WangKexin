<%@ page import="java.util.Calendar" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%!String getSystemTime(){
    return Calendar.getInstance().getTime().toString();
}
%>
<%@page import="java.util.Calendar" %>

<html>
<head>
    <title>Counter JSP</title>
</head>
<body>
This is Count JSP page.<br>
<%! int count=0; %>
The page count is now : <%out.println(++count);%><br>
CurrentTime : <%out.println(getSystemTime()); %>
</body>
</html>
