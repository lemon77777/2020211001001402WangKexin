<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%-- todo 9: use c:out to print message fron request --%>
<%--<%=//request.getAttribute("message")%>--%>
<c:out value="${message}"></c:out>
<%--todo 1: use c:url to set url in action="validate.jsp" --%>
<form action="<c:url value="validate.jsp"></c:url>">
    Username : <input type="text" name="username"><br>
    Password : <input type="password" name="password"><br>
    <input type="submit" value="Login"/>
</form>

</body>
</html>
