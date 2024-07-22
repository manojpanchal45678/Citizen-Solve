package javaServlet;
import MyClasses.RegistrationU;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistrationUser extends HttpServlet {
    static int count =0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Connection con=null;
        PreparedStatement pmt=null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String name = request.getParameter("name");
            String fname = request.getParameter("father");
            String address = request.getParameter("address");
            String pass = request.getParameter("password");
            String ag = request.getParameter("age");
            int cage = Integer.parseInt(ag);
            
                 
            
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root", "root");
                pmt = con.prepareStatement("Insert into registration(name,father,address,password,cid) values(?,?,?,?,?)");
                if(cage>=18)
               {
                count++;
                String cid ="user"+count+name.charAt(0)+ag;
                RegistrationU r= new RegistrationU(cid);
                request.setAttribute("reg",r);
                pmt.setString(1, name);
                pmt.setString(2, fname);
                pmt.setString(3, address);
                pmt.setString(4, pass);
                pmt.setString(5, cid);
                int i = pmt.executeUpdate(); 
                if(i==1)
                {
                    RequestDispatcher rd= request.getRequestDispatcher("Myjsp/userId.jsp"); 
                    rd.forward(request,response);
                }
                 else
                 {
                   RequestDispatcher rd= request.getRequestDispatcher("myHtml/Unsuccess.html"); 
                    rd.forward(request,response);
                 }  
                 pmt.close();
                 con.close();
               } 
               else
                 {                
                       response.sendRedirect("myHtml/Unsuccess.html");
                       }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(RegistrationUser.class.getName()).log(Level.SEVERE, null, ex);
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
        return "Short description";}
}

