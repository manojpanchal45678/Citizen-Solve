<%-- 
    Document   : adminHome3
    Created on : 13 Apr, 2024, 2:40:01 PM
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
/*     position: relative; */
}

th{
    background-color: #e6cb44;
    color:#0c1022;
    font-size: 20px;
    padding: 20px 50px;
}

table{
    padding-top: 20%;
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
    color: white;
}

thead th{
    color: black;
}


.viewBtn{
    background-color: #e6cb44;
    border: 2px solid white;
    color: #0c1022;
    cursor: pointer;
    width: 100px;
    height: 30px;
    border-radius: 5px;
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
.table2{
    display: none;
}
.table1.active{
    display: none;
}
.table2.active{
    display: flex;
}

.button1:hover{
    box-shadow: 1.5px 1.5px 5px rgb(241, 221, 3);
    transition: .8s ;
   
}
    </style>
    </head>
    <body>
          <button class="button1">Add new admin</button>
   <table class="table1">
    <thead>
        <th>Address</th>
        <th>Problem</th>
        <th>Details</th>
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
                rs=st.executeQuery("select * from submitproblem");
                while(rs.next())
                {
        %>
    <tr>
        <td class="address"><%= rs.getString(4)%></td>
        <td><%= rs.getString(5)%></td>
        <td><button class="viewBtn" name="<%= rs.getString(5)%>" onclick="getAdd(event.target.name)">view</button></td>
    </tr>
    <%  
                }
            }catch(Exception ex){
            out.print(ex);}
            String probSes = (String)session.getAttribute("problemSession");
            if(probSes == "")
            {
               response.sendRedirect("adminLogin.jsp");
            }
            
     %>
   </table>
    <table class="table2">
    <thead>
        <th>Name</th>
        <th>Email</th>
        <th>Contact</th>
        <th>Address</th>
        <th>Problem</th>
    </thead>
    </table>
       <script>
//       const address = document.getElementsByClassName({rs.getString(5)})
        function getAdd(event){
            console.log(event);
            let tableOne = document.querySelector(".table1");
            let tableTwo = document.querySelector(".table2");
            tableOne.classList.add("active");
            tableTwo.classList.add("active");
            
        }
   </script>
    </body>
</html>
