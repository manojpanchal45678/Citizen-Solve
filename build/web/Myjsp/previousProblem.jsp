<%-- 
    Document   : previousProblem
    Created on : 3 Apr, 2024, 2:20:37 PM
    Author     : naveen
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
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
    margin: 0;
    padding: 0;
    outline: 0;
}

.filter{
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    z-index: 1;
    opacity: .99;
    background-color: #0c1022;
/*    background: linear-gradient(167deg, rgba(0,0,0,0.9401709401709402) 0%, rgba(0,0,0,1) 37%, rgba(0,0,0,0.9401709401709402) 100%, rgb(33, 30, 30) 100%);*/
}

table{
    position: absolute;
    z-index: 2;
    left: 50%;
    top: 50%;
    transform: translate(-50%,-50%);
    width: 60%;
    background: rgb(0,0,0);
    background: linear-gradient(151deg, rgb(73, 70, 70) 12%, rgb(46, 44, 44) 35%, rgb(63, 61, 61) 98%);
    text-align: center;
}

th{
    background-color: #e6cb44;
    font-weight: bolder;
    font-size: 40px;
   
}

tr{
    background: linear-gradient(151deg, rgb(73, 70, 70) 12%, rgb(85, 82, 82) 35%, rgb(47, 45, 45) 98%);
    height: 100px;
    
}
td{
    color: #ffffff;
    font-weight: bolder;
}
    </style>
    </head>
    <body>
        <div class="filter"></div>
    <table >
        <thead>
            <tr>
                <th>Problem</th>
                <th>Address</th>
                <th>State</th>
            </tr>
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
                String name = String.valueOf(session.getAttribute("session"));
//                rs=st.executeQuery("select * from candidate");
                pmt = con.prepareStatement("select * from issues where name = ?");
                pmt.setString(1,name);
                rs = pmt.executeQuery();
                while(rs.next())
                {
        %>
        <tr>
            <td><%= rs.getString(5)%></td>
            <td><%= rs.getString(4)%></td>
            <td>Submitted</td>
        </tr>
         <%   
                }
            }catch(Exception ex){}
        %>
    </table>
    </body>
</html>
