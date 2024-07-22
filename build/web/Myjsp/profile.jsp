<%-- 
    Document   : profile
    Created on : 19 Mar, 2024, 3:08:30 PM
    Author     : naveen
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="MyClasses.UserName"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
    margin: 0;
}

body{
    background-color: #0c1022;
    
}
.userImg{
    height: 150px;
    width: 150px;
    border-radius: 50px;
    display: flex;
    align-item:center;
}
.header{
        width: 100%;
        height: 100vh;
        opacity: 1990%;
        background-repeat:no-repeat;
        background-size: cover;
        background-attachment: fixed;
        text-align: center;
}
.hadding{
    margin: auto;
    padding-top: 10px ;
    color: white;
}
.contener{
    margin-top: 25px;
    align-items: center;
}
.box{
    padding :50px;
    background-color: white;
    border: 4px solid #e6cd44;
    display: inline-block;
    text-align: center;
    margin: 70px;
    height: 150px;
    width: 200px;
    border-radius: 50px;
    color: black;
}


.contener-img{
height: 150px;
  width: 100%;
}

.userImg{
    display: flex;
    padding-left: 665px;
    margin-top: 50px;
}

.userImg img{
    height: 150px;
    width: 150px;
    border-radius: 100%;
}

        </style>
    </head>
    <body>
        <div class="userImg">
        <img src="photo_6118532181803515170_x.jpg" alt=""/>
    </div>
        <div class="header">
            <h1 class="hadding">${session}</h1>
        <div class="contener">
            
            <a href="inputForm.jsp"><div class="box"><img class="contener-img" src="download-removebg-preview.png"alt="Flowers in Chania">Submit a Problem</div></a>
            <a href="previousProblem.jsp"><div class="box"><img class="contener-img" src="5994710-removebg-preview.png">My Previous Problem</div></a>
            <a href="contactUs.jsp"><div class="box"><img class="contener-img" src="stock-photo-contact-concept-image-text-related-symbols-removebg-preview.png"alt="Flowers in Chania">Contact Us</div></a>
        </div>
    </div>
    </body>
</html>
