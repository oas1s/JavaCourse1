<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello from import jsp
<c:url var="hello" value="hello.jsp">
    <c:param name="name" value="Azat"></c:param>
</c:url>
<c:import url="${hello}">

</c:import>
</body>
</html>
