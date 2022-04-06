<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<div class="box">
    <p>This is my login JSP page </p>
    <% if (!(request.getAttribute("message") ==null)){
        out.println("<h5 style='color:red;'>"+request.getAttribute("message")+"</h5>");
    }%>
    <form class="register" action="login" method="post" onsubmit="return change()">
        <div class="register-content">
            <div class="register-content-title">Login</div>
            <div class="register-content-input">
                <input type="text" name="username" placeholder="username" required>
                <input type="password" name="password" placeholder="password" required id="password">
                <input type="submit" value="Sign in" style="border: 0; background: none; outline: none;">
            </div>
        </div>
    </form>
</div>
<%@include file="footer.jsp"%>
