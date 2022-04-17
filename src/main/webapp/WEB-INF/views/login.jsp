<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<div class="box">
    <p>This is my login JSP page </p>
    <% if (!(request.getAttribute("message") ==null)){
        out.println("<h5 style='color:red;'>"+request.getAttribute("message")+"</h5>");
    }%>
    <%
        Cookie [] allCookies = request.getCookies();//give all cookies
        String username = "",password = "",rememberMe = "";
        if (allCookies!=null) {
            for (Cookie c : allCookies) {
                if (c.getName().equals("cUsername")) {
                    username = c.getValue();
                }
                if (c.getName().equals("cPassword")) {
                    password = c.getValue();
                }
                if (c.getName().equals("cRememberMe")) {
                    rememberMe = c.getValue();
                }
            }
        }
    %>
    <form class="register" action="login" method="post" onsubmit="return change()">
        <div class="register-content">
            <div class="register-content-title">Login</div>
            <div class="register-content-input">
                <input type="text" name="username" placeholder="username" required value="<%=username%>">
                <input type="password" name="password" placeholder="password" required id="password" value="<%=password%>">
                <div style="height: 30px; display: flex; flex-direction: row;justify-content: center;margin-top: 20px;margin-bottom: 0">
                    <input type="checkbox" value="1" name="rememberMe" <%=rememberMe.equals("1")?"checked":""%> checked style="width: 20px">Remember me
                </div>
                <input type="submit" value="Sign in" style="border: 0; background: none; outline: none; margin-top: 0;color: #000000;font-weight: 700;">
            </div>
        </div>
    </form>
</div>
<%@include file="footer.jsp"%>
