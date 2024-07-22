
package javaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author naveen
 */
public class SubmitProblem extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con = null;
        PreparedStatement pmt = null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SubmitProblem</title>");            
            out.println("</head>");
            out.println("<body>");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor2", "root","root");
            
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("contact-number");
            String location = request.getParameter("location");
            String problem = request.getParameter("problem-description");
            
            pmt = con.prepareStatement("Insert into submitproblem(name,email,contect,location,problem) values(?,?,?,?,?)"); 
            
            pmt.setString(1,name);
            pmt.setString(2,email);
            pmt.setString(3,phone);
            pmt.setString(4,location);
            pmt.setString(5,problem);
            out.println("<h1>Servlet SubmitProblem at "+name+" "+email+" "+phone+" "+location+" "+problem);
            int i = pmt.executeUpdate();
            
            if(i==1) {
                
              response.sendRedirect("Myjsp/problemSubmited.jsp");
            } else {
               response.sendRedirect("Myjsp/problemNotSubmit.jsp");
            }
            
            pmt.close();
            con.close();
            
            
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(SubmitProblem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
