
<!DOCTYPE html>
<html>
<head>
    <title>Input Form</title>
    <!-- Add the Font Awesome CSS link here if needed -->
    <style>
        /* CSS styles for the form */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #0c1022;
        }

        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background-color: #434551;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border: 2px solid #e6cb44;
        }

        h2 {
            margin-top: 0;
            text-align: center;
            color: #e1dede;
        }

        form {
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #e1dede;
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        textarea {
            width: 100%;
            padding: 20px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            background-color: #333;
            color: #ffffff;
            font-size: 18px;
        }

        input[type="file"] {
            display: none;
        }
        
        .imageDiv{
            display: flex;
            
        }

        .label {
            display: inline-block;
            color: #0c1022;
            background-color: #e6cb44;
            text-align: center;
            padding: 10px;
            font-size: 15px;
            letter-spacing: 1.5px;
            height: 20px;
            width: 160px;
            margin-top: 10px;
            margin-bottom: 21px;
            border-radius: 5px;
        }
        
        .extra{
            margin-right: 35px;
        }

        .chooseFile {
            display: flex;
            align-items: center;
            justify-content: center;
        }

        input[type=file]::file-selector-button:hover {
            background: #ffe70e;
        }

        input[type="submit"] {
            background-color: #60ba3a;
            color: #ffffff;
            padding-bottom: 3px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 18px;
            transition: background-color 0.3s;
            width: 100%;
            height: 40px;
            font-weight: bolder;
        }

        input[type="submit"]:hover {
            background-color: #8ade66;
            text-shadow: 2px 2px 5px #434551;
            box-shadow: 2px 2px 5px #443455;
        }
        h2{
            color:#ffe70e ;
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="/Minor2/DataServlet" method="post" enctype="multipart/form-data">
            <h2> Report a Problem</h2>
            <!-- Name -->
            <label for="name"><i class="fa fa-user"></i> Name:</label>
            <input type="text" id="name" name="name" placeholder="Enter your name" required>
            
            <!-- Email -->
            <label for="email"><i class="fas fa-envelope"></i> Email:</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>
            

            <!-- Contact Number -->
            <label for="contact-number"><i class="fas fa-phone"></i> Contact Number:</label>
            <input type="text" id="contact-number" name="contact-number" placeholder="Enter your contact number" required>

            <!-- Address -->
            <label for="address"><i class="fas fa-map-marker-alt"></i> Address:</label>
            <input type="text" id="address" name="address" placeholder="Enter your address" required>
            
            <!-- Problem Description -->
            <label for="problemDescription"><i class="fas fa-comment"></i> Problem Description:</label>
            <textarea id="problemDescription" name="problemDescription" rows="5" placeholder="Enter problem description" required></textarea>
            
            <div class="imageDiv">
            <!-- Image 1 -->
            <label for="image1" class="label extra">Image 1:</label>
            <div class="chooseFile">
                <input type="file" id="image1" name="image1">
            </div>

            <!-- Image 2 -->
            <label for="image2" class="label extra">Image 2:</label>
            <div class="chooseFile">
                <input type="file" id="image2" name="image2">
            </div>

            <!-- Image 3 -->
            <label for="image3" class="label">Image 3:</label>
            <div class="chooseFile">
                <input type="file" id="image3" name="image3">
            </div>
            </div>
            <!-- Submit Button -->
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
