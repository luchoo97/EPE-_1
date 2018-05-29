package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      out.write("<!-- bootstrap & fontawesome -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/font-awesome/4.5.0/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- page specific plugin styles -->\n");
      out.write("\n");
      out.write("\t\t<!-- text fonts -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/fonts.googleapis.com.css\" />\n");
      out.write("\n");
      out.write("\t\t<!-- ace styles -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace.min.css\" class=\"ace-main-stylesheet\" id=\"main-ace-style\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 9]>\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"assets/css/ace-part2.min.css\" class=\"ace-main-stylesheet\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace-skins.min.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/ace-rtl.min.css\" />\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 9]>\n");
      out.write("\t\t  <link rel=\"stylesheet\" href=\"assets/css/ace-ie.min.css\" />\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t\t<!-- inline styles related to this page -->\n");
      out.write("\n");
      out.write("\t\t<!-- ace settings handler -->\n");
      out.write("\t\t<script src=\"assets/js/ace-extra.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->\n");
      out.write("\n");
      out.write("\t\t<!--[if lte IE 8]>\n");
      out.write("\t\t<script src=\"assets/js/html5shiv.min.js\"></script>\n");
      out.write("\t\t<script src=\"assets/js/respond.min.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body class=\"no-skin\">\n");
      out.write("        <div id=\"navbar\" class=\"navbar navbar-default          ace-save-state\">\n");
      out.write("            <div class=\"navbar-container ace-save-state\" id=\"navbar-container\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle menu-toggler pull-left\" id=\"menu-toggler\" data-target=\"#sidebar\">\n");
      out.write("                    <span class=\"sr-only\">Toggle sidebar</span>\n");
      out.write("\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                \n");
      out.write("                <div class=\"navbar-header pull-left\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"navbar-brand\">\n");
      out.write("                        <small>\n");
      out.write("                            <i class=\"fa fa-book\"></i>\n");
      out.write("                            Biblioteca H&L\n");
      out.write("                        </small>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("        <form action=\"validar.jsp\" method=\"POST\">\n");
      out.write("            <table border=\"1\" aling=\"center\">\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Uusuario:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"f_nombre\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Contraseña:</td>\n");
      out.write("                        <td><input type=\"password\" name=\"f_clave\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Enviar\" /></td>\n");
      out.write("                \n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("                </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
