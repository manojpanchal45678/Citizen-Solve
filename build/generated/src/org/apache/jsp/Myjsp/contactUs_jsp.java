package org.apache.jsp.Myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        /* styles.css */\n");
      out.write("body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background-color:#0c1022;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" .container {\n");
      out.write("    max-width: 800px;\n");
      out.write("    margin: 50px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    background-color:  #434551;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    border: 2px solid  #e6cb44;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("    text-align: center;\n");
      out.write("    color:  #e6cb44;\n");
      out.write("    text-shadow: 2px 2px 5px rgb(40, 40, 40);\n");
      out.write(" \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form {\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    background-color:  #434551;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form form {\n");
      out.write("    display: grid;\n");
      out.write("    grid-gap: 10px;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form input,\n");
      out.write(".contact-form textarea {\n");
      out.write("    \n");
      out.write("    padding: 10px;\n");
      out.write("    border: 1px solid  #434551;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #f7eeee ;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form button {\n");
      out.write("   \n");
      out.write("    padding: 10px;\n");
      out.write("    background-color: #4cbf4f;\n");
      out.write("    color:  #f7eeee;\n");
      out.write("    font-size: large;\n");
      out.write("    font-weight: bold;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: background-color 0.3s;\n");
      out.write("    align-content: center;\n");
      out.write("   transition: 1s;\n");
      out.write("   \n");
      out.write("\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-form button:hover {\n");
      out.write("    transition: 0.5s;\n");
      out.write("  \n");
      out.write("    box-shadow: 2px 2px 10px rgb(40, 40, 40);\n");
      out.write("    text-shadow: 2px 2px 5px rgb(40, 40, 40);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info {\n");
      out.write("    background-color:  #434551;\n");
      out.write("    color: #ffffff;\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    box-shadow: 2px 2px 10px rgb(40, 40, 40);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info h2 {\n");
      out.write("    color:#0c1022;\n");
      out.write("    margin-top: 10;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    background-color: #f7eeee ;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    height: 30px;\n");
      out.write("   \n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".contact-info p {\n");
      out.write("   margin: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-links {\n");
      out.write("   \n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-links a {\n");
      out.write("    display: inline-block; /* This ensures each link is on its own line */\n");
      out.write("        margin-right: 10px ; /* Adjust margin as needed */\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-links img {\n");
      out.write("    width: 40px;\n");
      out.write("    height: 40px;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    transition: transform 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social-links img:hover {\n");
      out.write("    transform: scale(1.2);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"container\">\n");
      out.write("        <h1>Contact Us</h1>\n");
      out.write("        <div class=\"contact-form\">\n");
      out.write("            <form action=\"#\">\n");
      out.write("                <input class=\"contactformkeandar\" type=\"text\" name=\"name\" placeholder=\"Your Name\" required>\n");
      out.write("                <input class=\"contactformkeandar\" type=\"email\" name=\"email\" placeholder=\"Your Email\" required>\n");
      out.write("                <input class=\"contactformkeandar\" type=\"text\" name=\"subject\" placeholder=\"Subject\" required>\n");
      out.write("                <textarea class=\"contactformkeandar\" name=\"message\" placeholder=\"Your Message\" required></textarea>\n");
      out.write("                <button type=\"submit\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"contact-info\">\n");
      out.write("            <h2>Government Helpline Numbers</h2>\n");
      out.write("            <p>Emergency: 911</p>\n");
      out.write("            <p>City Municipality: 123-456-7890</p>\n");
      out.write("            <p>Police Department: 987-654-3210</p>\n");
      out.write("            <h2>Office Address</h2>\n");
      out.write("            <p>123 Main Street, City, Country</p>\n");
      out.write("            <h2>Email Addresses</h2>\n");
      out.write("            <p>General Inquiries: info@govtwebsite.com</p>\n");
      out.write("            <p>Complaints: complaints@govtwebsite.com</p>\n");
      out.write("            <h2>Social Media</h2>\n");
      out.write("            <div class=\"social-links\">\n");
      out.write("                <a href=\"#\" target=\"_blank\"><img src=\"fb.png\" alt=\"Facebook\"></a>\n");
      out.write("                <a href=\"#\" target=\"_blank\"><img src=\"tw.png\" alt=\"Twitter\"></a>\n");
      out.write("                <a href=\"#\" target=\"_blank\"><img src=\"ig.png\" alt=\"Instagram\"></a>\n");
      out.write("            </div>\n");
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
