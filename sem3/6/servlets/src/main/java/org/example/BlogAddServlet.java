package org.example;

import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/blogAdd")
public class BlogAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Sign Up</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form method=\"post\" action=\"/servlets/blogAdd\">\n" +
                "    <input type=\"text\" placeholder=\"blog\" name=\"message\">\n" +
                "    <input type=\"submit\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    @SneakyThrows
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("message");
        String user = (String) req.getSession().getAttribute("name");
        Connection connection = ConnectionContainer.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO blogs(user_id,message) VALUES (?,?);");
        preparedStatement.setString(1,user);
        preparedStatement.setString(2,message);
        preparedStatement.executeUpdate();
    }
}
