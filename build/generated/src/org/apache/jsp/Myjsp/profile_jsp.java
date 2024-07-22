package org.apache.jsp.Myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import MyClasses.UserName;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write(".header{\n");
      out.write("        width: 100%;\n");
      out.write("        height: 100vh;\n");
      out.write("        opacity: 1990%;\n");
      out.write("        background-repeat:no-repeat;\n");
      out.write("        background-size: cover;\n");
      out.write("        background-attachment: fixed;\n");
      out.write("        background-color: #0c1022;\n");
      out.write("        text-align: center;\n");
      out.write("}\n");
      out.write(".hadding{\n");
      out.write("    margin: auto;\n");
      out.write("    padding-top: 35px ;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write(".contener{\n");
      out.write("    margin-top: 25px;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".box{\n");
      out.write("    padding :50px;\n");
      out.write("    background-color: white;\n");
      out.write("    border: 4px solid yellow;\n");
      out.write("    display: inline-block;\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 70px;\n");
      out.write("    height: 150px;\n");
      out.write("    width: 200px;\n");
      out.write("    border-radius: 50px;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("img{\n");
      out.write("height: 150px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1 class=\"hadding\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${session}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("        <div class=\"contener\">\n");
      out.write("            \n");
      out.write("            <a href=\"submitProblem.html\"><div class=\"box\"><img src=\"download-removebg-preview.png\"alt=\"Flowers in Chania\">Submit a Problem</div></a>\n");
      out.write("            <a href=\"previousProblem.html\"><div class=\"box\"><img src=\"5994710-removebg-preview.png\">My Previous Problem</div></a>\n");
      out.write("            <a href=\"contectUs.html\"><div class=\"box\"><img src=\"stock-photo-contact-concept-image-text-related-symbols-removebg-preview.png\"alt=\"Flowers in Chania\">Contact Us</div></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
