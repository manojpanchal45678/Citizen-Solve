<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Successful</title>
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
        
        #check-icon {
            font-size: 48px;
            color: #4CAF50;
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
        <div id="check-icon">&#10004;</div>
        <div id="message">
            Congratulations!
        </div>
        <p>Your Problem has been registered.</p>
        <div style="margin-top: 20px;"><a id="redirect-link" href="profile.jsp">OK</a></div>
    </div>
</body>
</html>
