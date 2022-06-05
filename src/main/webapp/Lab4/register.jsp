<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <style>
        .box {
            margin-top: 40px;
            width: 100%;
            height: auto;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        .register {
            width: 30vw;
            height: auto;
            z-index: 1000;
            border-radius: 30px;
            overflow: hidden;
            background: #faf0eb;
            box-shadow: rgba(0, 0, 0, 0.39) 0 0 10px;
        }
        .register-content {
            display: flex;
            flex-direction: column;
            width: 30vw;
            height: auto;
        }
        .register-content-title {
            display: flex;
            justify-content: center;
            margin-top: 10px;
            color: #000000;
            font-size: 14px;
            letter-spacing: 2px;
        }
        .register-content-input {
            margin-left: 10%;
        }
        .register-content-input input {
            width: 90%;
            border: 0;
            background: none;
            outline: none;
            color: grey;
            font-size: 10px;
            margin-top: 10px;
            border-bottom: 1px solid rgba(115, 124, 167, 0.6);
        }
        .register-content-input input:nth-last-of-type(1) {
            margin-bottom: 10px;
        }
        .register-content-input div {
            width: 100%;
            height: 30px;
            font-size: 10px;
            color: grey;
            margin-top: 10px;
            margin-bottom: 10px;
        }
        .register-content-input div input {
            width: 50px;
            margin: 0;
        }

        .change::placeholder {
            color: red;
            font-size: 7px;
        }
    </style>
</head>
<body>
<div class="box">
    <form class="register" action="register.jsp" method="post" onsubmit="return change()">
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
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <sql:setDataSource var="myDS"
                       driver="com.mysql.cj.jdbc.Driver"
                       url="jdbc:mysql://localhost:3306/userdb?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true"
                       user="root"
                       password="wkx074527" />
    <c:if test="${!empty param.username}">
        <sql:update var="newUser" dataSource="${myDS}">
            insert into usertable values(NULL,?,?,?,?,?)
            <sql:param value="${param.username}"></sql:param>
            <sql:param value="${param.password}"></sql:param>
            <sql:param value="${param.email}"></sql:param>
            <sql:param value="${param.gender}"></sql:param>
            <sql:param value="${param.birth}"></sql:param>
        </sql:update>
    </c:if>
    <sql:query var="selectUsers" dataSource="${myDS}">
        select * from usertable
    </sql:query>
    <table>
        <tr>
            UserList
        </tr>
        <c:forEach var="row" items="${selectUsers.rows}">
            <tr>
                <td><c:out value="${row.Id}"></c:out></td>
                <td><c:out value="${row.username}"></c:out></td>
                <td><c:out value="${row.password}"></c:out></td>
                <td><c:out value="${row.email}"></c:out></td>
                <td><c:out value="${row.gender}"></c:out></td>
                <td><c:out value="${row.birthdate}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
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
</body>
</html>
<%@include file="/footer.jsp"%>