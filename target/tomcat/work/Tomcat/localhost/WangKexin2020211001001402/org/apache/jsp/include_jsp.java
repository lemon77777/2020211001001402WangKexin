/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-06 07:33:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class include_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1648006170529L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1648471627037L));
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

      out.write('\r');
      out.write('\n');
      out.write("<html>\r\n");
      out.write(" <head>\r\n");
      out.write("   <title>My Online Shop</title>\r\n");
      out.write("     <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("     <link type=\"text/css\" rel=\"stylesheet\" href=\"register.css\">\r\n");
      out.write(" </head>\r\n");
      out.write(" <body style=\"margin:0px;padding:0px;font-family:helvetica;\">\r\n");
      out.write(" <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td height=\"78\" style=\"background-color:#788dad;\r\n");
      out.write("                            border-width:2px;\r\n");
      out.write("                            border-style:solid;\r\n");
      out.write("                            border-color:black;\r\n");
      out.write("                            padding:0px;\r\n");
      out.write("                            margin:0px;\" valign=\"bottom\">\r\n");
      out.write("      \r\n");
      out.write("     <img src=\"logo.jpg\" align=\"left\">\r\n");
      out.write("     </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("     <td height=\"15\" style=\"color:white;\r\n");
      out.write("                            background-color:#444444;\r\n");
      out.write("                            border-width:2px;\r\n");
      out.write("                            border-style:solid;\r\n");
      out.write("                            border-top-width:0px;\r\n");
      out.write("                            border-color:black;\" align=\"center\">\r\n");
      out.write("     <a style=\"color:white;\" href=\"include.jsp\">Home</a>\r\n");
      out.write("   - <a style=\"color:white;\" href=\"login.jsp\">Login</a>\r\n");
      out.write("   - <a style=\"color:white;\" href=\"productList\">Product</a>\r\n");
      out.write("   - <a style=\"color:white;\" href=\"#\">FAQ</a>\r\n");
      out.write("   - <a style=\"color:white;\" href=\"#\">About</a>\r\n");
      out.write("   \r\n");
      out.write("   </td>\r\n");
      out.write("   </tr>\r\n");
      out.write("   <tr height=\"25\"><td align=\"right\"><font size=\"18\" color=\"blue\">\r\n");
      out.write("   Welcome,<font size=\"18\" color=\"red\"> Guest</font>\r\n");
      out.write("   </font></td> </tr>\r\n");
      out.write("  <tr height=\"20\"><td align=\"right\">\r\n");
      out.write("   <br> <a href=\"#\">Logout</a>\r\n");
      out.write("  <br><a href=\"#\">My Cart</a><br/>\r\n");
      out.write("<a href=\"register.jsp\">Register Here</a>\r\n");
      out.write("  </td></tr>\r\n");
      out.write(" </table>\r\n");
      out.write("\r\n");
      out.write("<h1>\r\n");
      out.write("    ");
      out.print( "Welcome to my home page!" );
      out.write("\r\n");
      out.write("</h1>\r\n");
      out.write("<a href=\"hello-servlet\">Hello Servlet-week1</a><br/>\r\n");
      out.write("<a href=\"HelloWorldServlet\">Student Info Servlet-week2</a><br/>\r\n");
      out.write("<a href=\"week2/register.jsp\">register and login JSP(My Design by using mybatis)-week2</a><br/>\r\n");
      out.write("<a href=\"life\">Life Cycle Servlet-week3</a></br>\r\n");
      out.write("<a href=\"register.jsp\">Register-getParameter-week3</a><br/>\r\n");
      out.write("<a href=\"config\">Config parameter-week4</a><br/>\r\n");
      out.write("<a href=\"register.jsp\">Register JDBC-week4</a><br/>\r\n");
      out.write("<a href=\"include.jsp\">include-week5</a><br/>\r\n");
      out.write("<a href=\"login.jsp\">Login-week5</a>\r\n");
      out.write("<a href=\"index.jsp\">search-week6</a>\r\n");
      out.write("<br/>\r\n");
      out.write("<p align=\"center\">No. 808, Shuanggang East Street, Economic and Technological Development Zone, Nanchang City, Jiangxi Province E-mail\\: hdjd@ecjtu.edu.cn </p>\r\n");
      out.write("<p align=\"center\" style=\"font-size:8pt;\">Copyright &copy; 2015 XXX\r\n");
      out.write("</p>\r\n");
      out.write("<p align=\"center\">Are you admin?<a href='admin'>Click Here</a></p>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
