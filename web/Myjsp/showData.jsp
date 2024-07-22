<%-- 
    Document   : showData
    Created on : 13 Apr, 2024, 7:35:43 PM
    Author     : naveen
--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Display Data</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4; /* Set your desired background color */
        }

        h2 {
            text-align: center;
            margin-top: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #4CAF50; /* Header background color */
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2; /* Even row background color */
        }

        tr:hover {
            background-color: #ddd; /* Hover row background color */
        }

        img {
            max-width: 100px; /* Set your desired image width */
            max-height: 100px; /* Set your desired image height */
            display: block;
            margin: auto;
        }
    </style>
</head>
<body>
    <h2>Display Data</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
                <th>Address</th>
                <th>Problem Description</th>
                <th>Image 1</th>
                <th>Image 2</th>
                <th>Image 3</th>
            </tr>
        </thead>
        <tbody>
            <% // Java code for fetching data from database
               
                
                java.sql.Connection conn = null;
                java.sql.Statement stmt = null;
                java.sql.ResultSet rs = null;
                try {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/minor2", "root", "root");
                    
                    
                    stmt = conn.createStatement();
                    String sql = "SELECT * FROM issues";
                    rs = stmt.executeQuery(sql);
                    
                    
                    while (rs.next()) {
                        
                        String name = rs.getString("name");
                        String email = rs.getString("email");
                        String contact = rs.getString("contact");
                        String address = rs.getString("address");
                        String problem_description = rs.getString("problem_description");
                       
                       
                        byte[] image1Bytes = rs.getBytes("image1");
                        byte[] image2Bytes = rs.getBytes("image2");
                        byte[] image3Bytes = rs.getBytes("image3");
                        
                        
                        String image1Base64 = java.util.Base64.getEncoder().encodeToString(image1Bytes);
                        String image2Base64 = java.util.Base64.getEncoder().encodeToString(image2Bytes);
                        String image3Base64 = java.util.Base64.getEncoder().encodeToString(image3Bytes);
                        
                        
                        out.println("<tr>");
                        out.println("<td>" + name + "</td>");
                        out.println("<td>" + email + "</td>");
                        out.println("<td>" + contact + "</td>");
                        out.println("<td>" + address + "</td>");
                        out.println("<td>" + problem_description + "</td>");
                        
                        out.println("<td><img src=\"data:image/jpeg;base64," + image1Base64 + "\" alt=\"Image 1\"></td>");
                        out.println("<td><img src=\"data:image/jpeg;base64," + image2Base64 + "\" alt=\"Image 2\"></td>");
                        out.println("<td><img src=\"data:image/jpeg;base64," + image3Base64 + "\" alt=\"Image 3\"></td>");
                        out.println("</tr>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    
                    try { if (rs != null) rs.close(); } catch (Exception e) { /* ignored */ }
                    try { if (stmt != null) stmt.close(); } catch (Exception e) { /* ignored */ }
                    try { if (conn != null) conn.close(); } catch (Exception e) { /* ignored */ }
                }
            
            %>
        </tbody>
    </table>
</body>
</html>
