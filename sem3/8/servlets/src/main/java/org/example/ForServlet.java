package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/for")
public class ForServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = new ArrayList<>();
        userList.add(User.builder().name("Azat").age(23).sex("male").build());
        userList.add(User.builder().name("Petya").age(27).sex("male").build());
        userList.add(User.builder().name("Lubov").age(20).sex("female").build());
        req.setAttribute("users",userList);
        req.getRequestDispatcher("/for.jsp").forward(req,resp);
    }
}
