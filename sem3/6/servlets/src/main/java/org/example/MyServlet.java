package org.example;

import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/some")
public class MyServlet extends HttpServlet {
    @Override
    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/servlets/some\" method=\"post\">\n" +
                "    <input name=\"name\" type=\"text\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    @SneakyThrows
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5432/itis",
                        "postgres","azat");
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE name = '" + name + "';");
//        while (resultSet.next()){
//            log(resultSet.getString("name"));
//            log(resultSet.getString("surname"));
//        }
        PreparedStatement preparedStatement =
                connection.prepareStatement("SELECT * FROM users WHERE name = ?");
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            log(resultSet.getString("surname"));
        }
        connection.close();
    }
}
