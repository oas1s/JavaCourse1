package org.example;

import lombok.SneakyThrows;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.io.File;
import java.io.FileWriter;

@WebListener
public class MyListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    @SneakyThrows
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
        String attributeName = httpSessionBindingEvent.getName();
        System.out.println(attributeName);
        Boolean currentValue = (Boolean) httpSessionBindingEvent.getSession().getAttribute("active");
        System.out.println(currentValue);
        if (attributeName.equals("active") && currentValue.equals(true)){
            FileWriter fileWriter = new FileWriter(new File("/Users/moncou/Desktop/JavaCourse1/sem3/9/servlets/users.txt"));
            fileWriter.write("User " + httpSessionBindingEvent.getSession().getAttribute("name") + " added");
            fileWriter.close();
        }
    }
}
