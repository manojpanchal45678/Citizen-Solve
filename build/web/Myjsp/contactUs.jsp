<%-- 
    Document   : contactUs
    Created on : 13 Apr, 2024, 11:42:30 PM
    Author     : naveen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        /* styles.css */
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color:#0c1022;
}

 .container {
    max-width: 800px;
    margin: 50px auto;
    padding: 20px;
    background-color:  #434551;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    border: 2px solid  #e6cb44;
    
}

h1 {
    text-align: center;
    color:  #e6cb44;
    text-shadow: 2px 2px 5px rgb(40, 40, 40);
 
    
}

.contact-form {
    margin-bottom: 20px;
    background-color:  #434551;
    
}

.contact-form form {
    display: grid;
    grid-gap: 10px;
 
}

.contact-form input,
.contact-form textarea {
    
    padding: 10px;
    border: 1px solid  #434551;
    border-radius: 5px;
    background-color: #f7eeee ;
    
}

.contact-form button {
   
    padding: 10px;
    background-color: #4cbf4f;
    color:  #f7eeee;
    font-size: large;
    font-weight: bold;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s;
    align-content: center;
   transition: 1s;
   

    
}

.contact-form button:hover {
    transition: 0.5s;
  
    box-shadow: 2px 2px 10px rgb(40, 40, 40);
    text-shadow: 2px 2px 5px rgb(40, 40, 40);
}

.contact-info {
    background-color:  #434551;
    color: #ffffff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 2px 2px 10px rgb(40, 40, 40);
}

.contact-info h2 {
    color:#0c1022;
    margin-top: 10;
    margin-bottom: 10px;
    background-color: #f7eeee ;
    border-radius: 5px;
    height: 30px;
   
   text-align: center;
}

.contact-info p {
   margin: 15px;
}

.social-links {
   
    text-align: center;
}

.social-links a {
    display: inline-block; /* This ensures each link is on its own line */
        margin-right: 10px ; /* Adjust margin as needed */
    
}

.social-links img {
    width: 40px;
    height: 40px;
    border-radius: 50%;
    transition: transform 0.3s;
}

.social-links img:hover {
    transform: scale(1.2);
}


    </style>
    </head>
    <body>
         <div class="container">
        <h1>Contact Us</h1>
        <div class="contact-form">
            <form action="#">
                <input class="contactformkeandar" type="text" name="name" placeholder="Your Name" required>
                <input class="contactformkeandar" type="email" name="email" placeholder="Your Email" required>
                <input class="contactformkeandar" type="text" name="subject" placeholder="Subject" required>
                <textarea class="contactformkeandar" name="message" placeholder="Your Message" required></textarea>
                <button type="submit">Submit</button>
            </form>
        </div>
        <div class="contact-info">
            <h2>Government Helpline Numbers</h2>
            <p>Emergency: 911</p>
            <p>City Municipality: 123-456-7890</p>
            <p>Police Department: 987-654-3210</p>
            <h2>Office Address</h2>
            <p>123 Main Street, City, Country</p>
            <h2>Email Addresses</h2>
            <p>General Inquiries: info@govtwebsite.com</p>
            <p>Complaints: complaints@govtwebsite.com</p>
            <h2>Social Media</h2>
            <div class="social-links">
                <a href="#" target="_blank"><img src="fb.png" alt="Facebook"></a>
                <a href="#" target="_blank"><img src="tw.png" alt="Twitter"></a>
                <a href="#" target="_blank"><img src="ig.png" alt="Instagram"></a>
            </div>
        </div>
    </div>
    </body>
</html>
