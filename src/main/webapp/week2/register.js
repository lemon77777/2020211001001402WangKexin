function change() {
    var pwd = document.getElementById('password');
    var email = document.getElementById('email');
    var reg = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/;
    if (pwd.value.length < 8) {
        pwd.value="";
        pwd.setAttribute("placeholder","The password should not be less than 8 digits!")
        return false;
    }
    else if(!reg.test(email.value)){
        email.value="";
        email.setAttribute("placeholder","Please enter the correct email address!")
        return false;
    }
    return true;
}