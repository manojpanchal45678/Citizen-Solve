package org.apache.jsp.Myjsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Display Data</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f4f4f4; /* Set your desired background color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: left;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #4CAF50; /* Header background color */\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2; /* Even row background color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:hover {\n");
      out.write("            background-color: #ddd; /* Hover row background color */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        img {\n");
      out.write("            max-width: 100px; /* Set your desired image width */\n");
      out.write("            max-height: 100px; /* Set your desired image height */\n");
      out.write("            display: block;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Display Data</h2>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Contact</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Problem Description</th>\n");
      out.write("                <th>Image 1</th>\n");
      out.write("                <th>Image 2</th>\n");
      out.write("                <th>Image 3</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");
 // Java code for fetching data from database
               
                
                java.sql.Connection conn = null;
                java.sql.Statement stmt = null;
                java.sql.ResultSet rs = null;
                try {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/minor2", "root", "root");
                    
                    
                    stmt = conn.createStatement();
                    String sql = "SELECT * FROM issues";
                    rs = stmt.executeQuery(sql);
                    
                    
                    while (rs.next()) {
                        
                        String name = rs.getString("name");
                        String email = rs.getString("email");
                        String contact = rs.getString("contact");
                        String address = rs.getString("address");
                        String problem_description = rs.getString("problem_description");
                       
                       
                        byte[] image1Bytes = rs.getBytes("image1");
                        byte[] image2Bytes = rs.getBytes("image2");
                        byte[] image3Bytes = rs.getBytes("image3");
                        
                        
                        String image1Base64 = java.util.Base64.getEncoder().encodeToString(image1Bytes);
                        String image2Base64 = java.util.Base64.getEncoder().encodeToString(image2Bytes);
                        String image3Base64 = java.util.Base64.getEncoder().encodeToString(image3Bytes);
                        
                        
                        out.println("<tr>");
                        out.println("<td>" + name + "</td>");
                        out.println("<td>" + email + "</td>");
                        out.println("<td>" + contact + "</td>");
                        out.println("<td>" + address + "</td>");
                        out.println("<td>" + problem_description + "</td>");
                        
                        out.println("<td><img src=\"data:image/jpeg;base64," + image1Base64 + "\" alt=\"Image 1\"></td>");
                        out.println("<td><img src=\"data:image/jpeg;base64," + image2Base64 + "\" alt=\"Image 2\"></td>");
                        out.println("<td><img src=\"data:image/jpeg;base64," + image3Base64 + "\" alt=\"Image 3\"></td>");
                        out.println("</tr>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    
                    try { if (rs != null) rs.close(); } catch (Exception e) { /* ignored */ }
                    try { if (stmt != null) stmt.close(); } catch (Exception e) { /* ignored */ }
                    try { if (conn != null) conn.close(); } catch (Exception e) { /* ignored */ }
                }
            
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
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
