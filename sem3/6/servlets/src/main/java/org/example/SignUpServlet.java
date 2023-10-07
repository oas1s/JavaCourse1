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

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Sign Up</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/servlets/signUp\" method=\"post\">\n" +
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
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/itis",
                "postgres","azat");
        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO users(name,password) " +
                        "VALUES (?,?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,password);
        preparedStatement.executeUpdate();
        connection.close();
    }
}
