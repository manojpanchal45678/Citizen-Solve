<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
        /* Your existing CSS styles */
    </style>
</head>
<body>
    <button class="button1">Add new admin</button>
    <table>
        <thead>
            <th>Address</th>
            <th>Problem</th>
            <th>Details</th>
        </thead>
        <%  
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
        %>
        <tr>
            <td class="address"><%= rs.getString(4)%></td>
            <td><%= rs.getString(5)%></td>
            <td><button onclick="getAdd('<%= rs.getString(5)%>')">view</button></td>
        </tr>
        <%  
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
        %>
    </table>
    
    <script>
        function getAdd(eventName) {
            console.log(event);
            let eve = event;
            <%HttpSession s = request.getSession();%>
            s.setItem("problemSession",event);
            <%
            //s.setAttribute("pronlemSession", event);
            %>
                    console.log("${problemSession}");
        }
    </script>
</body>
</html>
