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