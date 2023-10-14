<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Title</title>
    </head>
    <body>
        <% Integer integerr = 0;
        for(int i = 0; i <5; i++) {
            integerr += i;
            out.println(integerr);
         }
         %>
        <h1><%="Hello world " + integerr%></h1>
    </body>
</html>