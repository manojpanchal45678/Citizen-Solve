<%-- 
    Document   : adminHomePage
    Created on : 13 Apr, 2024, 7:48:23 PM
    Author     : naveen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <style>
        *,*::before,*::after {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

body{
    background-color: #0c1022;
}

.wrapper{
    margin-top: 50px;
    color: white;
    display: flex;
    align-items: center;
    flex-direction: column;
}

.new-admin {
    margin-top: 50px;   
    margin-right: 80px;
    display: flex;
    justify-content: flex-end;
    align-items:flex-end;
    color: #0c1022;
    font-size: 20px;
    font-weight: 600;
}

.new-admin a {
    text-decoration: none;
    color: #0c1022;
    padding: 10px 20px 10px 20px;
    background-color: #e6cb44;
    border: 2px solid white;
    border-radius: 10px;
}

table{
    width: 90%;
    text-align: center;
}

tr,th{
    height: 50px;
}

th,td{
    border: 1px solid white;
    padding:20px;
    margin:0px;
}

th{
    background-color: #e6cb44;
    color: #0c1022;
    font-size: 20px;
    padding: 25px;
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
        <div class="new-admin"><a href="newAdminRegistration.jsp">New Admin</a></div>
        <div class="wrapper">
        <table >
            <thead>
                <th>Name</th>
                <th>Email</th>
                <th>Contact</th>
                <th>Address</th>
                <th>Problem</th>
                <th>Image1</th>
                <th>Image2</th>
                <th>Image3</th>
            </thead> 
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
        </table>
    </body>
</html>
