package javaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MyClasses.RegistrationU;
import MyClasses.UserInfo;
import MyClasses.UserName;
import static javaServlet.Registration.count;
import javax.servlet.http.HttpSession;
    
public class Login extends HttpServlet {
static int count=0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con = null;
        Statement st = null;
        PreparedStatement pmt = null;
        ResultSet rs = null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>VoterLogin</title>");
            out.println("</head>");
            out.println("<body>");
            HttpSession s = request.getSession();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor2", "root", "root");
            String u = request.getParameter("name");
            String p =request.getParameter("pass");
            String cid = request.getParameter("user");
            
            
            UserName r = new UserName(u);
            request.setAttribute("use", r);
            pmt = con.prepareStatement("select * from registration where name=? and password=? and cid=?");
            pmt.setString(1, u);
            pmt.setString(2, p);
            pmt.setString(3, cid);
            rs=pmt.executeQuery();
            if(rs.next())
            {   
                request.setAttribute("user",u);
                s.setAttribute("session", u);
                response.sendRedirect("Myjsp/profile.jsp");
 //               RequestDispatcher rd=request.getRequestDispatcher("Myjsp/profile.jsp");
 //              rd.forward(request, response);//Myjsp/profile.jsp
            }
            else
            {
                response.sendRedirect("myHtml/loginAgain.html");
            }
               pmt.close();
               rs.close();
               con.close();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

