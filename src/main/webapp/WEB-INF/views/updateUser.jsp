<%--
  Created by IntelliJ IDEA.
  User: thinkpad
  Date: 2022/4/17
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<%
    Users u = (Users)session.getAttribute("user");
%>
<% if (!(request.getAttribute("updateFail") ==null)){
    out.println("<h5 style='color:red;'>"+request.getAttribute("updateFail")+"</h5>");
}%>
<div class="box">
    <form class="register" action="updateUser" method="post" onsubmit="return change()">
        <div class="register-content">
            <div class="register-content-title">User Update</div>
            <div class="register-content-input">
                <input type="hidden" name="id" value="<%=u.getId()%>">
                <input type="text" name="username" placeholder="username" required value="<%=u.getUsername()%>">
                <input type="password" name="password" placeholder="password" required id="password" value="<%=u.getPassword()%>">
                <input type="text" name="email" placeholder="Email" required id="email" value="<%=u.getEmail()%>">
                <div>
                    <text style="font-weight: 700">Gender：</text><br>
                    <input name="gender" type="radio" value="Male" checked style="margin-top: 10px" <%="Male".equals(u.getGender())?"checked":""%>>Male
                    <input name="gender" type="radio" value="Female" <%="Female".equals(u.getGender())?"checked":""%>>Female
                </div>
                <input type="text" name="birth" placeholder="Date of Birth (yyyy-mm-dd)" required id="birth" value="<%=u.getBirth()%>">
                <input type="submit" value="Save Changes" style="border: 0; background: none; outline: none;">
            </div>
        </div>
    </form>
</div>
<script>
    function change() {
        var pwd = document.getElementById('password');
        var email = document.getElementById('email');
        var birth = document.getElementById("birth")
        var reg = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/;
        var reg2 = /^(\d{4})-(0\d{1}|1[0-2])-(0\d{1}|[12]\d{1}|3[01])$/;
        if (pwd.value.length < 8) {
            pwd.value="";
            pwd.className="change";
            pwd.setAttribute("placeholder","should not be less than 8 digits!")
            return false;
        }
        else if (!reg.test(email.value)){
            email.value="";
            email.className="change";
            email.setAttribute("placeholder","Please enter the correct email address!")
            return false;
        }
        else if (!reg2.test(birth.value)) {
            birth.value="";
            birth.className="change";
            birth.setAttribute("placeholder","Please enter the correct birthday format!")
            return false;
        }
        return true;
    }
</script>
<%@include file="footer.jsp"%>
