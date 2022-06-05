<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>

<%--
if(request.getParameter("username").equals("admin") && request.getParameter("password").equals("admin")){
    String url="welcome.jsp?username="+request.getParameter("username");
    response.sendRedirect(url);
}else{
    request.setAttribute("message","Username Password Error");
    request.getRequestDispatcher("login.jsp").include(request,response);
}
--%>
<%--todo 2: use c:choose ,c:when c:otherwise to validate username is 'admin' and  password is 'admin'--%>
<!-- add code for Lab-4-->
<%-- todo lab 4-1: user taglib to import sql tags in this JSP page --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%-- todo lab 4-2: user sql:setDataSource to get Connection --%>
<sql:setDataSource var="myDS"
                   driver="com.mysql.cj.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/userdb?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true"
                   user="root"
                   password="wkx074527" />
<%-- todo lab 4-3: user sql:query and sql:param to execute select statement --%>
<sql:query var="selectUsers" dataSource="${myDS}">
    select * from usertable where username = ? and password = ?
    <sql:param value="${param.username}"></sql:param>
    <sql:param value="${param.password}"></sql:param>
</sql:query>
<c:choose>
    <%-- todo lab 4-4: change code and use c:when test=\${selectUser.rows} --%>
    <c:when test="${!empty selectUsers.rows}">
        <c:forEach var="row" items="${selectUsers.rows}">
        <!-- end of Lab-4 -->
        <%--todo 3: when username == admin use c:url and c:param to make url = "welcome.jsp?username=admin"--%>
         <c:url var="url" value="welcome.jsp">
            <c:param name="name" value="${row.username}"></c:param>
        </c:url>
        <%-- todo 4.use c:redirect to url= welcome.jsp?username=admin--%>
        <c:redirect url="${url}"></c:redirect>
        </c:forEach>
    </c:when>
    <%-- todo 5. use c:otherwise --%>
<c:otherwise>
    <%-- todo 6:use c:set to set a attribute name message="username password error" in request  --%>
    <c:set var="message" value="username or password error!" scope="request" />
    <%--todo 7:use c:import to include login.jsp --%>
        <c:import url="login.jsp" />
</c:otherwise>
    </c:choose>
</body>
</html>
