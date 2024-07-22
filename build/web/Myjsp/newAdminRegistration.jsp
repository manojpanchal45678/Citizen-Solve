<%-- 
    Document   : newAdminRegistration
    Created on : 14 Apr, 2024, 1:17:25 PM
    Author     : naveen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>JSP Page</title>
                <style>
            
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body {
    width: 100%;
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    letter-spacing: 1px;
    background-color: #0c1022;
}

.login_form_container {
    position: relative;
    width: 1000px;
    height: 700px;
    max-width: 600px;
    max-height: 800px;
    background: #040717;
    border-radius: 50px 5px;
    border:2px solid yellow;
    display: flex;
    align-items: center;
    justify-content: center;
    overflow: hidden;
    margin-top: 20px;
}



.login_form {
    position: absolute;
    content: '';
    border-radius: 50px 5px;
    inset: 5px;
    padding: 50px 40px;
    z-index: 10;
    color: white;
    padding: 80px;
}

h2 {
    font-size: 40px;
    font-weight: 500;
    text-align: center;
}

.input_group {
    margin-top: 40px;
    position: relative;
    display: flex;
    align-items: center;
    justify-content: start;
}

.input_text {
    width: 95%;
    height: 30px;
    background: transparent;
    border: none;
    outline: none;
    border-bottom: 1px solid white;
    font-size: 18px;
    padding-left: 10px;
    color: white;
}

.input_textchange {
    width: 95%;
    height: 30px;
    background: transparent;
    border: none;
    outline: none;
    border-bottom: 1px solid white;
    font-size: 15px;
    padding-left: 10px;
    color: white;
}

.reset {
    display: flex;
    padding: 40px;
    width: 95%;
    height: 30px;
    background: transparent;
    color: #00ccff64;
}

::placeholder {
    font-size: 15px;
    color: white;
    letter-spacing: 1px;
}

.fa {
    font-size: 25px;
}

.fotter {
    margin-top: 30px;
    display: flex;
    justify-content: space between;
    color: white;
}

.fotter a:hover {
    text-decoration: underline;
}

.fotter p:hover {
    text-decoration: underline;
}

.fotter a {
    text-decoration: none;
    cursor: pointer;
    font-size: 18px;
    color: white;
}

.fotter p {
    text-decoration: none;
    cursor: pointer;
    font-size: 18px;
    color: white;
}

.glowIcon {
    text-shadow: 0 0 10px #8f90c6;
}

input[type="file"] {
    display: none;
}

label#filee {
    color: white;
    background-color: #0c1022;
    height: 40px;
    width: 200px;
    font-size: 18px;
    cursor: pointer;
    border: 1px solid white;
    display: flex;
    justify-content: center;
    align-items: center;
    border-radius: 5px;
    margin-top: 20px;
    margin-left: 120px;
    margin-bottom: 10px;
box-sizing: border-box;
 transition: 0.3s;
}
label#filee:hover {
    background-color: white;
    color: #0c1022;
}
.button_group{
    margin-top: 30px;
}
.reset-button {
    width: 430px;
    height: 40px;
    background-color: #0c1022;
    color: white;
    font-size: 18px;
    border: 1px solid white;
    border-radius: 5px;
    cursor: pointer;
    margin: 10px 0;
    transition: 0.3s;
}


.reset-button:hover {
    background-color: #e6cb44;
    color: #0c1022;
}



/* Add media query for responsiveness */
@media (max-width: 768px) {
    .login_form_container {
        width: 90%;
        margin: 10px;
    }
    
    .login_form {
        padding: 40px;
    }
    
    .input_group {
        margin-top: 15px;
    }
    
    .input_text {
        font-size: 14px;
    }
}
/* Add media query for responsiveness */
@media (max-width: 768px) {
    .file-label {
        width: 100%; /* Make the label 100% wide to match the container width */
        text-align: center; /* Center the label text */
        margin: 10px 0; /* Adjust margin as needed */
    }
}
        </style>
    </head>
    <body>
        <div class="login_form_container">
            <div class="login_form">
                <h2>Add New Admin</h2>
                <form action="/Minor2/AddNewAdmin" method="POST">
                    <div class="input_group">
                        <i class="fa fa-user"></i>
                        <input type="text" placeholder="Name" name="name" class="input_text" autocomplete="off" required="required" />
                    </div>
                    <div class="input_group">
                        <i class="fa fa-male"></i>
                        <input type="text" placeholder="Father-Name" name="father" class="input_textchange" autocomplete="off" required="required" />
                    </div>

                    <div class="input_group">
                        <i class="fa fa-home"></i>
                        <input type="text" placeholder="Address" name="address" class="input_textchange" autocomplete="off" required="required" />
                    </div>

                    <div class="input_group">
                        <i class="fa fa-unlock-alt"></i>
                        <input type="text" placeholder="Password" name="password" class="input_textchange" autocomplete="off" required="required"/>
                    </div>
                    <div class="input_group">
                        <i class="fa fa-birthday-cake"></i>
                        <input type="number" placeholder="Age" name="age" class="input_textchange" autocomplete="off" required="required" />
                    </div>
<!--                     <div class="file">
                        <input type="file" id="file" class="file-input">
                        <label id="filee" for="file" class="file-label">Upload Party Symbol</label>
                    </div> -->
                    <div class="button_group" id="login_button">
                        <input type="reset" value="Reset" class="reset-button">
                        <input type="submit" value="Submit" class="reset-button">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
