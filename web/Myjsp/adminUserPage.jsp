<%-- 
    Document   : adminUserPage
    Created on : 9 Apr, 2024, 10:21:54 PM
    Author     : naveen
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        *{
    background:#0c1022;

}

p{
    color: rgb(217, 221, 225);
}

body{
    /* position: relative; */
}

th{
    
    background-color: #e6cb44;
    color:#0c1022;
    font-size: 20px;
}

table{
    position: absolute;
    z-index: 2;
    left: 50%;
    top: 30%;
    transform: translate(-50%,-50%);
    width: 60%;
    background: #0c1022;
    background: linear-gradient(151deg, rgb(73, 70, 70) 12%, rgb(46, 44, 44) 35%, rgb(63, 61, 61) 98%);
    text-align: center;
}

tr,th{
    height: 50px;
}

.button1{
    color: #0c1022;
    background-color:  #e6cb44;
    border: 0;
    height: 40px;
    width: 150px;
    font-size: larger;
    position: absolute;
    top: 20px;
    right: 25px;
    transition: .8s;
    
}

.button1:hover{
    box-shadow: 1.5px 1.5px 5px rgb(241, 221, 3);
    transition: .8s ;
   
}
    </style>
    </head>
    <body>
        <table>
    <thead>
        <th>Name</th>
        <th>Email</th>
        <th>Contact</th>
        <th>Address</th>
        <th>"${problemSession}"</th>
    </thead>
     <%
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
     %>
     <tr>
         <td><%= rs.getString(1)%></td>
         <td><%= rs.getString(2)%></td>
         <td><%= rs.getString(3)%></td>
         <td><%= rs.getString(4)%></td>
         <td><%= rs.getString(5)%></td>
     </tr>
     <%   
                }
            }catch(Exception ex){}
        %>
   </table>
    </body>
</html>
