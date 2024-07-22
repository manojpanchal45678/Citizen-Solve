package org.apache.jsp.Myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class previousProblem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("        *{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    outline: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".filter{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    z-index: 1;\n");
      out.write("    opacity: .7;\n");
      out.write("    background-color: #0c1022;\n");
      out.write("    background: linear-gradient(167deg, rgba(0,0,0,0.9401709401709402) 0%, rgba(0,0,0,1) 37%, rgba(0,0,0,0.9401709401709402) 100%, rgb(33, 30, 30) 100%);\n");
      out.write("}\n");
      out.write("\n");
      out.write("table{\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: 2;\n");
      out.write("    left: 50%;\n");
      out.write("    top: 50%;\n");
      out.write("    transform: translate(-50%,-50%);\n");
      out.write("    width: 60%;\n");
      out.write("    background: rgb(0,0,0);\n");
      out.write("    background: linear-gradient(151deg, rgb(73, 70, 70) 12%, rgb(46, 44, 44) 35%, rgb(63, 61, 61) 98%);\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th{\n");
      out.write("    background-color: #e6cb44;\n");
      out.write("    font-weight: bolder;\n");
      out.write("    font-size: 40px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("tr{\n");
      out.write("    background: linear-gradient(151deg, rgb(73, 70, 70) 12%, rgb(85, 82, 82) 35%, rgb(47, 45, 45) 98%);\n");
      out.write("    height: 100px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("td{\n");
      out.write("    color: #ffffff;\n");
      out.write("    font-weight: bolder;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"filter\"></div>\n");
      out.write("    <table >\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Problem </th>\n");
      out.write("                <th>State</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tr>\n");
      out.write("            <td>Railway Line \n");
      out.write("                Solution kshetra ke liye yeh likha ja sakta hai:\n");
      out.write("               </td>\n");
      out.write("            <td>Submitted</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Road Colapse</td>\n");
      out.write("            <td>Verified</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Light Problem</td>\n");
      out.write("            <td>Resolved</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Bank Problem</td>\n");
      out.write("            <td>In Progress</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
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
