<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <link rel="shortcut icon" href="images/logo_favicon.ico">
    <link type="text/css" rel="stylesheet" href="register.css">
    <script type="text/javascript" src="register.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<div id="login" class="login">
    <form class="front login" action="/WangKexin2020211001001402/LoginServlet" method="post">
        <div class="login-left">
            <div class="login-left-title">Login</div>
            <div class="login-left-input">
                <input type="text" name="username" placeholder="Username">
                <input type="password" name="password" placeholder="password">
            </div>
        </div>
        <div class="login-right">
            <div class="login-right-title">Register</div>
            <img src="images/go.png" id="signUp">
            <div class="login-right-text">
                <input type="submit" value="Sign in" style="border: 0; background: none; outline: none;">
            </div>
        </div>
    </form>
    <form class="back login" action="/WangKexin2020211001001402/Register" method="post" onsubmit="return change()">
        <div class="login-left">
            <div class="login-left-title">Register</div>
            <div class="login-left-input">
                <input type="text" name="username" placeholder="username" required>
                <input type="password" name="password" placeholder="password" required id="password">
                <input type="text" name="email" placeholder="Email" required id="email">
                <div>
                    <text style="font-weight: 700">Gender：</text><br>
                    <input name="gender" type="radio" value="Male" checked style="margin-top: 10px">Male
                    <input name="gender" type="radio" value="Female">Female
                </div>
                <input type="text" name="birth" placeholder="Date of Birth (yyyy-mm-dd)" required id="birth">
            </div>
        </div>
        <div class="login-right">
            <div class="login-right-title">Login</div>
            <img src="images/go.png" id="signIn">
            <div class="login-right-text">
                <input type="submit" value="Sign up" style="border: 0; background: none; outline: none;">
            </div>
        </div>
    </form>
</div>
<div class="runBox">
</div>
<script>
    $("#signUp").click(function () {
        $(".login").toggleClass("trans");
    });
    $("#signIn").click(function () {
        $(".login").toggleClass("trans");
    });
</script>
</body>
</html>
