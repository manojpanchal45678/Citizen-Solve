package javaServlet;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
//import java.sql.*;
@MultipartConfig
public class DataServlet extends HttpServlet {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/minor2";
    private static final String USER = "root";
    private static final String PASS = "root";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        PreparedStatement stmt = null;
        
        // Getting form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact-number");
        String problem_description = request.getParameter("problemDescription");
        Part image1 = request.getPart("image1");
        Part image2 = request.getPart("image2");
        Part image3 = request.getPart("image3");

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER).newInstance();
            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // Prepare SQL statement
            String sql = "INSERT INTO issues (name, email, contact, address, problem_description, image1, image2, image3) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3,contact);
            stmt.setString(4, address);
            stmt.setString(5, problem_description);
            stmt.setBinaryStream(6, image1.getInputStream());
            stmt.setBinaryStream(7, image2.getInputStream());
            stmt.setBinaryStream(8, image3.getInputStream());
            // Execute SQL statement
            
            int i = stmt.executeUpdate();
            if(i==1)
            {
                response.sendRedirect("Myjsp/problemSubmited.jsp");
            }
            // Close resources
            stmt.close();
            conn.close();
            //response.sendRedirect("success.jsp"); // Redirect to success page
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp"); // Redirect to error page
        }
    }
}
