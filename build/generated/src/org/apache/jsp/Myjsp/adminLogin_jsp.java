package org.apache.jsp.Myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                  *{ \n");
      out.write("    margin: 0; \n");
      out.write("    padding: 0; \n");
      out.write("    box-sizing: border-box; \n");
      out.write("  } \n");
      out.write("\n");
      out.write("\n");
      out.write("  body{ \n");
      out.write("      width: 100%; \n");
      out.write("      height: 100%; \n");
      out.write("      display: flex; \n");
      out.write("      justify-content: center; \n");
      out.write("      align-items: center; \n");
      out.write("      letter-spacing: 1px; \n");
      out.write("      background-color: #0c1022; \n");
      out.write("  } \n");
      out.write("\n");
      out.write("\n");
      out.write("  .login_form_container{ \n");
      out.write("      position: relative; \n");
      out.write("      width: 400px; \n");
      out.write("      height: 500px; \n");
      out.write("      max-width: 400px; \n");
      out.write("      max-height: 550px; \n");
      out.write("      background: #040717;  \n");
      out.write("      border-radius: 50px 5px; \n");
      out.write("      border: 2px solid yellow;\n");
      out.write("      display: flex; \n");
      out.write("      align-items: center; \n");
      out.write("      justify-content: center; \n");
      out.write("      overflow: hidden; \n");
      out.write("      margin-top: 70px; \n");
      out.write("  } \n");
      out.write("\n");
      out.write("\n");
      out.write("  .login_form{ \n");
      out.write("      position: absolute; \n");
      out.write("      content: '';  \n");
      out.write("      border-radius: 50px 5px; \n");
      out.write("      inset: 5px; \n");
      out.write("      padding: 50px 40px; \n");
      out.write("      z-index: 10; \n");
      out.write("      color: white; \n");
      out.write("   \n");
      out.write("  }  \n");
      out.write("  h2{ \n");
      out.write("      font-size: 40px; \n");
      out.write("      font-weight: 600; \n");
      out.write("      text-align: center; \n");
      out.write("  } \n");
      out.write("  .input_group{ \n");
      out.write("      margin-top: 40px; \n");
      out.write("      position:relative; \n");
      out.write("      display:flex;\n");
      out.write("      align-items: center; \n");
      out.write("      justify-content: start; \n");
      out.write("  } \n");
      out.write("  .input_text{ \n");
      out.write("      width: 95%; \n");
      out.write("      height: 30px; \n");
      out.write("      background: transparent; \n");
      out.write("      border: none; \n");
      out.write("      outline: none; \n");
      out.write("      border-bottom: 1px solid white; \n");
      out.write("      font-size: 18px;\n");
      out.write("      padding-left: 10px; \n");
      out.write("      color: white; \n");
      out.write("   \n");
      out.write("  } \n");
      out.write("  ::placeholder{ \n");
      out.write("      font-size: 15px; \n");
      out.write("      color:white; \n");
      out.write("      letter-spacing: 1px; \n");
      out.write("   \n");
      out.write("  } \n");
      out.write("  .fa{ \n");
      out.write("      font-size: 20px; \n");
      out.write("   \n");
      out.write("  } \n");
      out.write("  \n");
      out.write("  #login_button{ \n");
      out.write("      position: relative; \n");
      out.write("      width: 300px; \n");
      out.write("      height: 40px; \n");
      out.write("      transition: 1s; \n");
      out.write("      margin-top: 70px; \n");
      out.write("   \n");
      out.write("  } \n");
      out.write("  \n");
      out.write(" /* Add these styles for the submit button */\n");
      out.write("#login_button input[type=\"submit\"] {\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100%;\n");
      out.write("    text-decoration: none;\n");
      out.write("    z-index: 10;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 22px;\n");
      out.write("    letter-spacing: 2px;\n");
      out.write("    border: 1px solid white;\n");
      out.write("   \n");
      out.write("    background-color: #0c1022;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    color: white; /* Text color for the button */\n");
      out.write("    background-color: #0c1022; /* Background color for the button */\n");
      out.write("    transition: 0.3s; /* Add a smooth transition effect */\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  #login_button input[type=\"submit\"]:hover {\n");
      out.write("    background-color: #e6cb44; /* Change background color on hover */\n");
      out.write("    color: #0c1022; /* Change text color on hover */\n");
      out.write("    box-shadow: 0 0 10px #e6cb44; /* Add a box-shadow on hover */\n");
      out.write("  }\n");
      out.write(".reg a {\n");
      out.write("    text-decoration: none;\n");
      out.write("    position: relative; \n");
      out.write("      width: 300px; \n");
      out.write("      height: 40px; \n");
      out.write("      transition: 1s; \n");
      out.write("      margin-top: 40px; \n");
      out.write("      position:relative; \n");
      out.write("      display:flex; \n");
      out.write("      align-items: center; \n");
      out.write("      justify-content: start; \n");
      out.write("      font-size: 22px;\n");
      out.write("      border: 1px solid white;\n");
      out.write("      background-color: #0c1022;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    color: white;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  .reg a:hover {\n");
      out.write("    background-color: #e6cb44; /* Change background color on hover */\n");
      out.write("    color: #0c1022; /* Change text color on hover */\n");
      out.write("    box-shadow: 0 0 10px #e6cb44; /* Add a box-shadow on hover */\n");
      out.write("  }\n");
      out.write("  /* .reg{\n");
      out.write("    width: 100px;\n");
      out.write("    height: 20px;\n");
      out.write("    border: 1px solid black;\n");
      out.write("    color: white; */\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("  .fotter { \n");
      out.write("      margin-top: 30px; \n");
      out.write("      display: flex; \n");
      out.write("      justify-content: space-between; \n");
      out.write("      color: white;\n");
      out.write("\n");
      out.write("  } \n");
      out.write("\n");
      out.write("  .fotter a:hover{\n");
      out.write("    text-decoration: underline;\n");
      out.write("   \n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .fotter p:hover{\n");
      out.write("    text-decoration: underline;\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  .fotter a{ \n");
      out.write("      text-decoration: none; \n");
      out.write("      cursor: pointer; \n");
      out.write("      font-size: 14px; \n");
      out.write("      color: white;\n");
      out.write("  } \n");
      out.write("\n");
      out.write("  .fotter p{ \n");
      out.write("    text-decoration: none; \n");
      out.write("    cursor: pointer; \n");
      out.write("    font-size: 14px; \n");
      out.write("    color: white;\n");
      out.write("} \n");
      out.write("\n");
      out.write("  .glowIcon { \n");
      out.write("      text-shadow: 0 0 10px #8f90c6; \n");
      out.write("   \n");
      out.write("  }\n");
      out.write("\n");
      out.write("  /* Default styles for larger screens */\n");
      out.write("/* ... Your existing CSS code ... */\n");
      out.write("\n");
      out.write("/* Media query for screens smaller than 600px */\n");
      out.write("@media (max-width: 300px) {\n");
      out.write("    body {\n");
      out.write("      flex-direction: column; /* Stack elements vertically on smaller screens */\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("    .login_form_container {\n");
      out.write("      width: 90%; /* Make the container wider on smaller screens */\n");
      out.write("      height: auto; /* Allow the container to expand vertically as needed */\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("    .login_form {\n");
      out.write("      padding: 30px 20px; /* Adjust padding for smaller screens */\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("    .input_group {\n");
      out.write("      margin-top: 20px; /* Reduce the margin on smaller screens */\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("    #login_button {\n");
      out.write("      width: 100%; /* Make the button take full width on smaller screens */\n");
      out.write("    }\n");
      out.write("  }         \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div class=\"login_form_container\">\n");
      out.write("    <div class=\"login_form\">\n");
      out.write("      <form action=\"/Minor2/AdminLogin\" method=\"Post\">\n");
      out.write("        <h2>Admin Login</h2>\n");
      out.write("        <div class=\"input_group\">\n");
      out.write("          <i class=\"fa fa-user\"></i>\n");
      out.write("          <input type=\"text\" placeholder=\"Name\" name=\"name\" class=\"input_text\" required=\"\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input_group\">\n");
      out.write("          <i class=\"fa fa-unlock-alt\"></i>\n");
      out.write("          <input type=\"text\" placeholder=\" Admin Id\" name=\"admin\" class=\"input_text\" required=\"\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input_group\">\n");
      out.write("          <i class=\"fa fa-unlock-alt\"></i>\n");
      out.write("          <input type=\"password\" placeholder=\"Password\" name=\"pass\" class=\"input_text\" required=\"\" />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"button_group\" id=\"login_button\">\n");
      out.write("          <input type=\"submit\">\n");
      out.write("          <label for=\"submit\"></label>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
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
