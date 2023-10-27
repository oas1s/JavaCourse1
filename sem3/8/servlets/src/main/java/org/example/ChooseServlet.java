package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/choose")
public class ChooseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer degree = Integer.valueOf(req.getParameter("degree"));
        req.setAttribute("degree",degree);
        req.getRequestDispatcher("/choose.jsp").forward(req,resp);
    }
}
