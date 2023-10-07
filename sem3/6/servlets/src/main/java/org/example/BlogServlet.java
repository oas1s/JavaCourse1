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
import java.sql.ResultSet;

@WebServlet("/blog")
public class BlogServlet  extends HttpServlet {
    @Override
    @SneakyThrows
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Sign Up</title>\n" +
                "</head>\n" +
                "<body>\n");
        Connection connection =
                ConnectionContainer.getConnection();
        String user = (String) req.getSession().getAttribute("name");
        PreparedStatement preparedStatement=
                connection.prepareStatement("SELECT * FROM blogs WHERE user_id = ?");
        preparedStatement.setString(1,user);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            resp.getWriter().println("<p>" + resultSet.getString("message") + "</p>");
        }
        resp.getWriter().println("</body>\n" +
                "</html>");
    }
}
