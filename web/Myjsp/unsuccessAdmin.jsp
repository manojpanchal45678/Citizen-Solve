<%-- 
    Document   : unsuccess
    Created on : 7 Apr, 2024, 4:35:24 PM
    Author     : naveen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
                    body {
            font-family: Arial, sans-serif;
            background-color: #0c1022;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        
        #popup {
            display: flex;
            flex-direction: column;
            align-items: center;
            width: 300px;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            text-align: center;
            position: relative;
        }
        
        #popup.active {
            display: block;
            animation: fadeIn 0.5s;
        }
        
        #icon {
            font-size: 48px;
            color: #4CAF50; /* Change the color for correct or wrong input */
        }
        
        #message {
            font-weight: bold;
            margin: 20px 0;
        }
        
        #redirect-link {
            display: inline-block;
            background-color: #007BFF;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        
        #redirect-link:hover {
            background-color: #0056b3;
        }
        
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(-20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
        </style>
    </head>
    <body>
 <div id="popup" class="active">
        <div id="icon">&#10060;</div> <!-- Replace this with an "X" symbol or any other symbol you prefer -->
        <div id="message">
            Your admin id and password are wrong
        </div>
        
        <div style="margin-top: 20px;"><a id="redirect-link" href="adminLogin.jsp">OK</a></div>
    </div>
    </body>
</html>
