import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AdminHome2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String eventName = request.getParameter("eventName");
        HttpSession session = request.getSession();
        session.setAttribute("problemSession", eventName);
        response.getWriter().write("Session attribute set successfully");
    }
}
