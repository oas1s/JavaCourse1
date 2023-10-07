package org.example;

import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/signIn")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Sign Up</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/servlets/signIn\" method=\"post\">\n" +
                "    <input name=\"name\" type=\"text\" placeholder=\"name\">\n" +
                "    <input name=\"password\" type=\"password\" placeholder=\"password\">\n" +
                "    <input type=\"submit\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    @SneakyThrows
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        log(name + " " + password);
        Connection connection = ConnectionContainer.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("SELECT * FROM users WHERE name = ?");
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        if (resultSet.getString("password").equals(password)){
            req.getSession().setAttribute("name",name);
        } else {
            resp.sendRedirect("http://localhost:8080/signIn");
        }
    }
}
