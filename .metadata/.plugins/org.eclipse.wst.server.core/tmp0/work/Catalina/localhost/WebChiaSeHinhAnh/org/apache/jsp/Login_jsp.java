/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2023-03-28 03:14:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1651733799535L));
    _jspx_dependants.put("jar:file:/D:/Tai%20lieu%20hoc%20ki%202%20nam%203/CSDL_NC/git/DUAN_NHOM3_CSDLNC/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WebChiaSeHinhAnh/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
  }

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\"\r\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.104.2\">\r\n");
      out.write("<link rel=\"icon\" href=\"img/Logo.png\" type=\"image/x-icon\">\r\n");
      out.write("<title>PIXEL</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"canonical\"\r\n");
      out.write("	href=\"https://getbootstrap.com/docs/5.2/examples/sign-in/\">\r\n");
      out.write("<link href=\"assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"css/signin.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"text-center\" style=\"background-color: #ffffff\">\r\n");
      out.write("\r\n");
      out.write("	<main class=\"form-signin w-100 m-auto\"\r\n");
      out.write("		style=\"background-color: #f8f9fa; border-radius: 10px\">\r\n");
      out.write("		<form action=\"LoginControl\" method=\"post\">\r\n");
      out.write("					\r\n");
      out.write("			<img class=\"mb-4\" src=\"img/Logo.png\" alt=\"\" width=\"72\" height=\"57\">\r\n");
      out.write("			<h1 class=\"h3 mb-3 fw-normal\">Đăng nhập</h1>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"form-floating\">\r\n");
      out.write("				<input name=\"email\" type=\"email\" class=\"form-control\"\r\n");
      out.write("					id=\"floatingInput\" placeholder=\"Username\"> <label\r\n");
      out.write("					for=\"floatingInput\">Email</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"form-floating\">\r\n");
      out.write("				<input name=\"password\" type=\"password\" class=\"form-control\"\r\n");
      out.write("					id=\"floatingPassword\" placeholder=\"Password\"> <label\r\n");
      out.write("					for=\"floatingPassword\">Password</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mess}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("			<div style=\"display: flex; justify-content: flex-start;\"\r\n");
      out.write("				class=\"checkbox mb-3\">\r\n");
      out.write("				<label> <input type=\"checkbox\" value=\"remember-me\">\r\n");
      out.write("					Remember me\r\n");
      out.write("				</label>\r\n");
      out.write("			</div>\r\n");
      out.write("			<button class=\"w-100 btn btn-lg btn-primary\" type=\"submit\">Đăng\r\n");
      out.write("				nhập</button>\r\n");
      out.write("			<p>\r\n");
      out.write("				Bạn chưa có tài khoảng? <a href=\"signup.jsp\">Đăng ký</a>\r\n");
      out.write("			</p>\r\n");
      out.write("		</form>\r\n");
      out.write("	</main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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