/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-05-24 17:39:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.WangKexin.model.Users;

public final class updateUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1652809718100L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1619543054000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
//.println(basePath);

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <title>Home | E-Shopper</title>\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      out.print(basePath);
      out.write("css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath);
      out.write("js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->       \r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.print(basePath);
      out.write("images/ico/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"");
      out.print(basePath);
      out.write("images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"");
      out.print(basePath);
      out.write("images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"");
      out.print(basePath);
      out.write("images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"");
      out.print(basePath);
      out.write("images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head><!--/head-->\r\n");
      out.write("<body>\r\n");
      out.write("\t<header id=\"header\"><!--header-->\r\n");
      out.write("\t\t<div class=\"header_top\"><!--header_top-->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"contactinfo\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-envelope\"></i> info@ecjtu.com</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user\"></i> Welcome,\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(session.getAttribute("user")!=null){
								Users user=(Users)session.getAttribute("user");
  									 out.print(user.getUsername());
  									 }else{out.print("Guest");} 
      out.write("\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"social-icons pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/header_top-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"header-middle\"><!--header-middle-->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"logo pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"home\"><img src=\"");
      out.print(basePath);
      out.write("images/home/logo.png\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-group pull-right clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tCN\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\">Canada</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\">UK</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tRMB\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\">Canadian Dollar</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"\">Pound</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"shop-menu clearfix pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("accountDetails\"><i class=\"fa fa-user\"></i> Account</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("cart\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("Register\"><i class=\"fa fa-crosshairs\"></i> Register</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("login\"><i class=\"fa fa-lock\"></i> Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("logout\"><i class=\"fa fa-unlock\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/header-middle-->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"header-bottom\"><!--header-bottom-->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mainmenu pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav collapse navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("home\" class=\"active\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                    <ul role=\"menu\" class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"");
      out.print(basePath);
      out.write("shop\">Products</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--<li><a href=\"product-details.html\">Product Details</a></li>  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("cart\">Cart</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("order\">Order</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li> \r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--<li><a href=\"404.html\">404</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(basePath);
      out.write("contactUs\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t<form method=\"get\" target='_blank' action=\"");
      out.print(basePath);
      out.write("search\" style=\"width: 426px; \">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"txt\" placeholder=\"search\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"search\" style=\"width:65px; \">\r\n");
      out.write("   \t\t\t\t\t\t\t\t\t\t <option value=\"baidu\">Baidu</option>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t  <option value=\"bing\">Bing</option>\r\n");
      out.write("  \t\t\t\t\t\t\t\t\t\t  <option value=\"google\">Google</option>\r\n");
      out.write(" \t\t\t\t\t\t\t\t\t   </select>&nbsp;<button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--<input type=\"text\" placeholder=\"Search\"/>-->\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/header-bottom-->\r\n");
      out.write("\t</header><!--/header-->\r\n");
      out.write('\r');
      out.write('\n');

    Users u = (Users)session.getAttribute("user");

      out.write('\r');
      out.write('\n');
 if (!(request.getAttribute("updateFail") ==null)){
    out.println("<h5 style='color:red;'>"+request.getAttribute("updateFail")+"</h5>");
}
      out.write("\r\n");
      out.write("<div class=\"box\">\r\n");
      out.write("    <form class=\"register\" action=\"updateUser\" method=\"post\" onsubmit=\"return change()\">\r\n");
      out.write("        <div class=\"register-content\">\r\n");
      out.write("            <div class=\"register-content-title\">User Update</div>\r\n");
      out.write("            <div class=\"register-content-input\">\r\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(u.getId());
      out.write("\">\r\n");
      out.write("                <input type=\"text\" name=\"username\" placeholder=\"username\" required value=\"");
      out.print(u.getUsername());
      out.write("\">\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"password\" required id=\"password\" value=\"");
      out.print(u.getPassword());
      out.write("\">\r\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"Email\" required id=\"email\" value=\"");
      out.print(u.getEmail());
      out.write("\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <text style=\"font-weight: 700\">Gender：</text><br>\r\n");
      out.write("                    <input name=\"gender\" type=\"radio\" value=\"Male\" checked style=\"margin-top: 10px\" ");
      out.print("Male".equals(u.getGender())?"checked":"");
      out.write(">Male\r\n");
      out.write("                    <input name=\"gender\" type=\"radio\" value=\"Female\" ");
      out.print("Female".equals(u.getGender())?"checked":"");
      out.write(">Female\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"text\" name=\"birth\" placeholder=\"Date of Birth (yyyy-mm-dd)\" required id=\"birth\" value=\"");
      out.print(u.getBirth());
      out.write("\">\r\n");
      out.write("                <input type=\"submit\" value=\"Save Changes\" style=\"border: 0; background: none; outline: none;\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    function change() {\r\n");
      out.write("        var pwd = document.getElementById('password');\r\n");
      out.write("        var email = document.getElementById('email');\r\n");
      out.write("        var birth = document.getElementById(\"birth\")\r\n");
      out.write("        var reg = /^[A-Za-z\\d]+([-_.][A-Za-z\\d]+)*@([A-Za-z\\d]+[-.])+[A-Za-z\\d]{2,4}$/;\r\n");
      out.write("        var reg2 = /^(\\d{4})-(0\\d{1}|1[0-2])-(0\\d{1}|[12]\\d{1}|3[01])$/;\r\n");
      out.write("        if (pwd.value.length < 8) {\r\n");
      out.write("            pwd.value=\"\";\r\n");
      out.write("            pwd.className=\"change\";\r\n");
      out.write("            pwd.setAttribute(\"placeholder\",\"should not be less than 8 digits!\")\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        else if (!reg.test(email.value)){\r\n");
      out.write("            email.value=\"\";\r\n");
      out.write("            email.className=\"change\";\r\n");
      out.write("            email.setAttribute(\"placeholder\",\"Please enter the correct email address!\")\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        else if (!reg2.test(birth.value)) {\r\n");
      out.write("            birth.value=\"\";\r\n");
      out.write("            birth.className=\"change\";\r\n");
      out.write("            birth.setAttribute(\"placeholder\",\"Please enter the correct birthday format!\")\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");

String path1 = request.getContextPath();
String basePath1 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path1+"/";
//.println(basePath);

      out.write("\r\n");
      out.write("<footer id=\"footer\"><!--Footer-->\r\n");
      out.write("\t\t<div class=\"footer-top\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"companyinfo\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2><span>e</span>-shopper</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-7\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"video-gallery text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"iframe-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(basePath1);
      out.write("images/home/iframe1.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"overlay-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Circle of Hands</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>24 DEC 2014</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"video-gallery text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"iframe-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(basePath1);
      out.write("images/home/iframe2.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"overlay-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Circle of Hands</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>24 DEC 2014</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"video-gallery text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"iframe-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(basePath1);
      out.write("images/home/iframe3.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"overlay-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Circle of Hands</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>24 DEC 2014</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"video-gallery text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"iframe-img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(basePath1);
      out.write("images/home/iframe4.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"overlay-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-play-circle-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Circle of Hands</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>24 DEC 2014</h2>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"address\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(basePath1);
      out.write("images/home/map.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t<p>No. 808, Shuanggang East Street, Economic and Technological Development Zone, Nanchang, Jiangxi E-mail\\: hdjd@ecjtu.edu.cn</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"footer-widget\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Service</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Online Help</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Order Status</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Change Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">FAQâs</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Quock Shop</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">T-Shirt</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Mens</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Womens</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Gift Cards</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Shoes</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Policies</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Terms of Use</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Privecy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Refund Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Billing System</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Ticket System</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>About Shopper</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Company Information</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Careers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Store Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Affillate Program</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Copyright</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3 col-sm-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>About Shopper</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"searchform\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your email address\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Get the most recent updates from <br />our site and be updated your self...</p>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"footer-bottom\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<p class=\"pull-left\">Copyright Â© 2013 ecjtu All rights reserved.</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"pull-left\" style=\"width: 178px; margin-left: 300px; \" >Are you admin?<a href='");
      out.print(basePath1+"admin/home");
      out.write("'>Click Here</a></p>\r\n");
      out.write("\t\t\t\t\t<p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"http://www.ecjtu.jx.cn/\">ECJTU</a></span></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</footer><!--/Footer-->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <script src=\"");
      out.print(basePath1);
      out.write("js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath1);
      out.write("js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath1);
      out.write("js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("\t<script src=\"");
      out.print(basePath1);
      out.write("js/price-range.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath1);
      out.write("js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(basePath1);
      out.write("js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
