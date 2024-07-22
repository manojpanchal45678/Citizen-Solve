/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author naveen
 */
public class AddNewAdmin extends HttpServlet {
    public static int count = 0;
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
        Connection con=null;
        PreparedStatement pmt=null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String name = request.getParameter("name");
            String fname = request.getParameter("father");
            String address = request.getParameter("address");
            String  pass = request.getParameter("password");
            String ag = request.getParameter("age");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor2", "root", "root");
                pmt = con.prepareStatement("Insert into addnewadmin(name,father,address,password,aid) values(?,?,?,?,?)");
                   count++;
                   
            String aid ="user"+count+name.charAt(0)+ag;
                RegistrationU r= new RegistrationU(aid);
                request.setAttribute("reg",r);
                pmt.setString(1, name);
                pmt.setString(2, fname);
                pmt.setString(3,address);
                pmt.setString(4, pass);
                pmt.setString(5,aid);
                
                int i = pmt.executeUpdate(); 
                if(i==1)
                {
                    RequestDispatcher rd= request.getRequestDispatcher("Myjsp/newAdminId.jsp"); 
                    rd.forward(request,response);
                }
                 else
                 {
                   RequestDispatcher rd= request.getRequestDispatcher("Myjsp/unsuccessNewAdminRegistration.jsp"); 
                    rd.forward(request,response);
                 }  
                 pmt.close();
                 con.close();
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(AddNewAdmin.class.getName()).log(Level.SEVERE, null, ex);
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
