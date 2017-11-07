/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-07 11:55:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"register.css\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction validate() {\n");
      out.write("\t\tconsole.log(\"inside\")\n");
      out.write("\n");
      out.write("\t\tvar email = document.getElementById(\"email\").value;\n");
      out.write("\t\tvar mobileNumber = document.getElementById(\"mobile\").value;\n");
      out.write("\t\tvar confirmPassword = document.getElementById(\"confirmpassword\").value;\n");
      out.write("\t\tvar password = document.getElementById(\"password\").value;\n");
      out.write("\t\tvar emailValidation = /^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$/;\n");
      out.write("\t\tvar mobileValidation = /^((\\+)?(\\d{2}[-]))?(\\d{10}){1}?$/;\n");
      out.write("\t\tvar isError = false;\n");
      out.write("\n");
      out.write("\t\tif (!emailValidation.test(email)) {\n");
      out.write("\t\t\t$(\"#email\").css(\"border-color\", \"red\");\n");
      out.write("\t\t\t$(\"#email\")\n");
      out.write("\t\t\t\t\t.after(\n");
      out.write("\t\t\t\t\t\t\t\"<span id='errors'> <font color= 'red'> Not a valid email </font></span>\")\n");
      out.write("\t\t\tisError = true;\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$(\"#email\").css(\"border-color\", \"green\");\n");
      out.write("\t\t\t$(\"#errors\").remove();\n");
      out.write("\t\t}\n");
      out.write("\t\tif (confirmPassword != password) {\n");
      out.write("\t\t\t$(\"#password\").css(\"border-color\", \"red\");\n");
      out.write("\t\t\t$(\"#confirmpassword\").css(\"border-color\", \"red\");\n");
      out.write("\t\t\t$(\"#confirmpassword\")\n");
      out.write("\t\t\t\t\t.after(\n");
      out.write("\t\t\t\t\t\t\t\"<span id='errors'> <font color= 'red'> passwords are not matching </font></span>\")\n");
      out.write("\t\t\tisError = true;\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$(\"#password\").css(\"border-color\", \"green\");\n");
      out.write("\t\t\t$(\"#confirmpassword\").css(\"border-color\", \"green\");\n");
      out.write("\t\t\t$(\"#errors\").remove();\n");
      out.write("\t\t}\n");
      out.write("\t\tif (!mobileValidation.test(mobileNumber)) {\n");
      out.write("\t\t\t$(\"#mobile\").css(\"border-color\", \"red\");\n");
      out.write("\t\t\t$(\"#mobile\")\n");
      out.write("\t\t\t\t\t.after(\n");
      out.write("\t\t\t\t\t\t\t\"<span id='errors'> <font color= 'red'> enter valid 10 digit number </font></span>\")\n");
      out.write("\t\t\talert()\n");
      out.write("\t\t\tisError = true;\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\t$(\"#mobile\").css(\"border-color\", \"green\");\n");
      out.write("\t\t\t$(\"#errors\").remove();\n");
      out.write("\t\t}\n");
      out.write("\t\tif (isError == true) {\n");
      out.write("\t\t\treturn false;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t$(\"#name\").blur(function() {\n");
      out.write("\t\t\tvar name = $(\"#name\").val();\n");
      out.write("\t\t\tvar nameRegex = /^[a-zA-Z ]*$/;\n");
      out.write("\t\t\tif (name.length == 0) {\n");
      out.write("\t\t\t\t$(\"#error1\").text(\"Please Enter name\");\n");
      out.write("\t\t\t} else if (!name.match(nameRegex)) {\n");
      out.write("\t\t\t\t$(\"#error1\").text(\"Please Enter charcter only\");\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t$(\"#error1\").text(\"\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("h2 {\n");
      out.write("    color: green;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Create An Account</h2>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"card card-container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12\">\n");
      out.write("\t\t\t\t\t<form action=\"RegisterServlet\" method=\"post\"\n");
      out.write("\t\t\t\t\t\tonsubmit=\"return validate()\" class=\"form-signup\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-15 col-md-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<span id=\"reauth-email\" class=\"reauth-email\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"col-xs-15 col-sm-15 col-md-15\"> </span> <label>Enter\n");
      out.write("\t\t\t\t\t\t\t\t\tUser Name</label><br> <input type=\"text\" name=\"UserName\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Enter your Name\" required> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"error1\" style=\"color: red; font-size: 15px;\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<label>Enter Email Id</label><br> <input type=\"email\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"email\" name=\"EmailId\" placeholder=\"Enter your Email\"\n");
      out.write("\t\t\t\t\t\t\t\t\trequired>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<label>Enter Password</label><br> <input type=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"password\" name=\"password\" placeholder=\"Enter your password\"\n");
      out.write("\t\t\t\t\t\t\t\t\trequired>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<label>Confirm Password</label><br> <input type=\"password\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"confirmpassword\" name=\"confirmPassword\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Re-enter your password\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12\">\n");
      out.write(" \n");
      out.write("\t\t\t\t\t\t\t<label>Confirm Mobile  eNumber</label><br> <input type=\"number\"\n");
      out.write("\t\t\t\t\t\t\t\tid=\"mobile\" name=\"MobileNumber\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Enter your  mobile number\" required>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" id=\"button\" class=\"btn btn-lg btn-primary btn-block btn-signup\"><a href=\"login.jsp\">submit</a>></button>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
