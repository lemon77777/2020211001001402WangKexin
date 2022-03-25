<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<p style="margin-left: 30px">This is my register JSP page </p>
<div class="register">
    <form class="register" action="/WangKexin2020211001001402/Register" method="post" onsubmit="return change()">
        <div class="register-content">
            <div class="register-content-title">Register</div>
            <div class="register-content-input">
                <input type="text" name="username" placeholder="username" required>
                <input type="password" name="password" placeholder="password" required id="password">
                <input type="text" name="email" placeholder="Email" required id="email">
                <div>
                    <text style="font-weight: 700">Gender：</text><br>
                    <input name="gender" type="radio" value="Male" checked style="margin-top: 10px">Male
                    <input name="gender" type="radio" value="Female">Female
                </div>
                <input type="text" name="birth" placeholder="Date of Birth (yyyy-mm-dd)" required id="birth">
                <input type="submit" value="Sign up" style="border: 0; background: none; outline: none;">
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
