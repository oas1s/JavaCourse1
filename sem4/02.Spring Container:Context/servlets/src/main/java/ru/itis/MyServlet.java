package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
//        Animal animal = applicationContext.getBean(Animal.class);
////        resp.getWriter().write(animal.makeSound());
        SingleOperationCalculator singleOperationCalculator = applicationContext.getBean(SingleOperationCalculator.class);
        Double d = singleOperationCalculator.performOperation(1.0,1.0);
        resp.getWriter().write(d.toString());
    }
}
