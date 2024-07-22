package org.apache.jsp.Myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;

public final class adminUserPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        *{\n");
      out.write("    background:#0c1022;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("p{\n");
      out.write("    color: rgb(217, 221, 225);\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("    /* position: relative; */\n");
      out.write("}\n");
      out.write("\n");
      out.write("th{\n");
      out.write("    \n");
      out.write("    background-color: #e6cb44;\n");
      out.write("    color:#0c1022;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table{\n");
      out.write("    position: absolute;\n");
      out.write("    z-index: 2;\n");
      out.write("    left: 50%;\n");
      out.write("    top: 30%;\n");
      out.write("    transform: translate(-50%,-50%);\n");
      out.write("    width: 60%;\n");
      out.write("    background: #0c1022;\n");
      out.write("    background: linear-gradient(151deg, rgb(73, 70, 70) 12%, rgb(46, 44, 44) 35%, rgb(63, 61, 61) 98%);\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr,th{\n");
      out.write("    height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1{\n");
      out.write("    color: #0c1022;\n");
      out.write("    background-color:  #e6cb44;\n");
      out.write("    border: 0;\n");
      out.write("    height: 40px;\n");
      out.write("    width: 150px;\n");
      out.write("    font-size: larger;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 20px;\n");
      out.write("    right: 25px;\n");
      out.write("    transition: .8s;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1:hover{\n");
      out.write("    box-shadow: 1.5px 1.5px 5px rgb(241, 221, 3);\n");
      out.write("    transition: .8s ;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("    <thead>\n");
      out.write("        <th>Name</th>\n");
      out.write("        <th>Email</th>\n");
      out.write("        <th>Contact</th>\n");
      out.write("        <th>Address</th>\n");
      out.write("        ");

        String prob = request.getParameter("{event.target.name}");
        
      out.write("\n");
      out.write("        <th>\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"</th>\n");
      out.write("    </thead>\n");
      out.write("     ");

            int count=0;
            Connection con = null;
            Statement st = null;
            PreparedStatement pmt = null;
            ResultSet rs = null;
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor2", "root" ,"root");
                st=con.createStatement();
                String problem = String.valueOf(session.getAttribute("problemSession"));
//                rs=st.executeQuery("select * from candidate");
                pmt = con.prepareStatement("select * from submitproblem where problem = ?");
                 pmt.setString(5,problem);
                rs = pmt.executeQuery();
                while(rs.next())
                {           
     
      out.write("\n");
      out.write("     <tr>\n");
      out.write("         <td>");
      out.print( rs.getString(1));
      out.write("</td>\n");
      out.write("         <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("         <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("         <td>");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("         <td>");
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("     </tr>\n");
      out.write("     ");
   
                }
            }catch(Exception ex){}
        
      out.write("\n");
      out.write("   </table>\n");
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
