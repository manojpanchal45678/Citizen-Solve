package org.apache.jsp.Myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class adminHome2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <style>\n");
      out.write("        /* Your existing CSS styles */\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <button class=\"button1\">Add new admin</button>\n");
      out.write("    <table>\n");
      out.write("        <thead>\n");
      out.write("            <th>Address</th>\n");
      out.write("            <th>Problem</th>\n");
      out.write("            <th>Details</th>\n");
      out.write("        </thead>\n");
      out.write("        ");
  
            Connection con = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor2", "root" ,"root");
                String query = "SELECT * FROM submitproblem";
                pstmt = con.prepareStatement(query);
                rs = pstmt.executeQuery();
                
                while(rs.next()) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td class=\"address\">");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("            <td><button onclick=\"getAdd('");
      out.print( rs.getString(5));
      out.write("')\">view</button></td>\n");
      out.write("        </tr>\n");
      out.write("        ");
  
                }
            } catch(SQLException | ClassNotFoundException ex){
                out.print(ex);
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (pstmt != null) pstmt.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {
                    out.print(ex);
                }
            }
            
            String probSes = (String) session.getAttribute("problemSession");
            if(probSes == null || probSes.equals("")) {
//               response.sendRedirect("adminLogin.jsp");
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        function getAdd(eventName) {\n");
      out.write("            var xhr = new XMLHttpRequest();\n");
      out.write("            xhr.open(\"POST\", \"/Minor2/AdminHome2\", true);\n");
      out.write("            xhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("            xhr.onreadystatechange = function() {\n");
      out.write("                if (xhr.readyState === 4 && xhr.status === 200) {\n");
      out.write("                    console.log(xhr.responseText);\n");
      out.write("                    // Redirect or do something else after setting session attribute\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            xhr.send(\"eventName=\" + encodeURIComponent(eventName));\n");
      out.write("            console.log(eventName);\n");
      out.write("        }\n");
      out.write("    </script>\n");
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
