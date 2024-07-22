package org.apache.jsp.Myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inputForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Input Form</title>\n");
      out.write("    <!-- Add the Font Awesome CSS link here if needed -->\n");
      out.write("    <style>\n");
      out.write("        /* CSS styles for the form */\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #0c1022;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #434551;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            border: 2px solid #e6cb44;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            margin-top: 0;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #e1dede;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            color: #e1dede;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"email\"],\n");
      out.write("        textarea {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 20px;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            background-color: #333;\n");
      out.write("            color: #ffffff;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"file\"] {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .label {\n");
      out.write("            display: inline-block;\n");
      out.write("            color: #0c1022;\n");
      out.write("            background-color: #e6cb44;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px;\n");
      out.write("            font-size: 15px;\n");
      out.write("            letter-spacing: 1.5px;\n");
      out.write("            height: 20px;\n");
      out.write("            width: 200px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            margin-bottom: 21px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .chooseFile {\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=file]::file-selector-button:hover {\n");
      out.write("            background: #ffe70e;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            background-color: #60ba3a;\n");
      out.write("            color: #ffffff;\n");
      out.write("            padding-bottom: 3px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 18px;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 40px;\n");
      out.write("            font-weight: bolder;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #8ade66;\n");
      out.write("            text-shadow: 2px 2px 5px #434551;\n");
      out.write("            box-shadow: 2px 2px 5px #443455;\n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            color:#ffe70e ;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form action=\"/Minor2/DataServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <h2> Report a Problem</h2>\n");
      out.write("            <!-- Name -->\n");
      out.write("            <label for=\"name\"><i class=\"fa fa-user\"></i> Name:</label>\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Enter your name\" required>\n");
      out.write("            \n");
      out.write("            <!-- Email -->\n");
      out.write("            <label for=\"email\"><i class=\"fas fa-envelope\"></i> Email:</label>\n");
      out.write("            <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Enter your email\" required>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <!-- Contact Number -->\n");
      out.write("            <label for=\"contact-number\"><i class=\"fas fa-phone\"></i> Contact Number:</label>\n");
      out.write("            <input type=\"text\" id=\"contact-number\" name=\"contact-number\" placeholder=\"Enter your contact number\" required>\n");
      out.write("\n");
      out.write("            <!-- Address -->\n");
      out.write("            <label for=\"address\"><i class=\"fas fa-map-marker-alt\"></i> Address:</label>\n");
      out.write("            <input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Enter your address\" required>\n");
      out.write("            \n");
      out.write("            <!-- Problem Description -->\n");
      out.write("            <label for=\"problemDescription\"><i class=\"fas fa-comment\"></i> Problem Description:</label>\n");
      out.write("            <textarea id=\"problemDescription\" name=\"problemDescription\" rows=\"5\" placeholder=\"Enter problem description\" required></textarea>\n");
      out.write("            \n");
      out.write("            <div class=\"imageDiv\">\n");
      out.write("            <!-- Image 1 -->\n");
      out.write("            <label for=\"image1\" class=\"label\">Image 1:</label>\n");
      out.write("            <div class=\"chooseFile\">\n");
      out.write("                <input type=\"file\" id=\"image1\" name=\"image1\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Image 2 -->\n");
      out.write("            <label for=\"image2\" class=\"label\">Image 2:</label>\n");
      out.write("            <div class=\"chooseFile\">\n");
      out.write("                <input type=\"file\" id=\"image2\" name=\"image2\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Image 3 -->\n");
      out.write("            <label for=\"image3\" class=\"label\">Image 3:</label>\n");
      out.write("            <div class=\"chooseFile\">\n");
      out.write("                <input type=\"file\" id=\"image3\" name=\"image3\">\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Submit Button -->\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
