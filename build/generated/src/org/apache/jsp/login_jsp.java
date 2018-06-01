package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/seccionlogin/seccion1.jsp");
    _jspx_dependants.add("/seccionlogin/seccion2.jsp");
    _jspx_dependants.add("/seccionlogin/seccion3.jsp");
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
      out.write(" ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ACCESO A USUARIO</title>\n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("                    <a href=\"\" class=\"navbar-brand\">\n");
      out.write("                        <small>\n");
      out.write("                            <i class=\"fa fa-book\"></i>\n");
      out.write("                            Biblioteca H&L\n");
      out.write("                        </small>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write('\n');
      out.write(' ');
      out.write("<body>\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("    <div class=\"row vertical-offset-100\">\n");
      out.write("    \t<div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("    \t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t  \t<div class=\"panel-heading\">\n");
      out.write("\t\t\t    \t<h3 class=\"panel-title\">Inicio de Sesión</h3>\n");
      out.write("\t\t\t \t</div>\n");
      out.write("\t\t\t  \t<div class=\"panel-body\">\n");
      out.write("\t\t\t    \t<form accept-charset=\"UTF-8\" role=\"form\" action=\"validar.jsp\" method=\"POST\">\n");
      out.write("                    <fieldset>\n");
      out.write("\t\t\t    \t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t    <input class=\"form-control\" placeholder=\"Usuario\" name=\"f_nombre\" type=\"text\">\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t\t<div class=\"form-group\">\n");
      out.write("\t\t\t    \t\t\t<input class=\"form-control\" placeholder=\"Contraseña\" name=\"f_clave\" type=\"password\" value=\"\">\n");
      out.write("\t\t\t    \t\t</div>\n");
      out.write("\t\t\t    \t\t\n");
      out.write("                            <input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" value=\"Enviar\">\n");
      out.write("                                        \n");
      out.write("                                               \n");
      out.write("\t\t\t    \t</fieldset>\n");
      out.write("\t\t\t      \t</form>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("                </div>");
      out.write('\n');
      out.write(' ');
      out.write("<div class=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"footer-inner\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-content\">\n");
      out.write("\t\t\t\t\t\t<span class=\"bigger-120\">\n");
      out.write("\t\t\t\t\t\t\tHéctor Navarro - Luis Sánchez &copy; 2017-2018\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t&nbsp; &nbsp;\n");
      out.write("\t\t\t\t\t\t<span class=\"action-buttons\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-twitter-square light-blue bigger-150\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-facebook-square text-primary bigger-150\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"ace-icon fa fa-rss-square orange bigger-150\"></i>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    </body>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write('\n');
      out.write(' ');
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
      out.write("                    <link rel=\"icon\" type=\"image/ico\" href=\"./images/icon.ico\" />\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
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
