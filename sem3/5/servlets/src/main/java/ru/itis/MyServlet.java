package ru.itis;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = (String) req.getParameter("name");
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("name",name);
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>Request sent</html>");
//        resp.addCookie(new Cookie("somename","asd"));
//        List<Cookie> cookieList = new ArrayList<>(List.of(req.getCookies()));
//        cookieList.get(0).
    }
}
