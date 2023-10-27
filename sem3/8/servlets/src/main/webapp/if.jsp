<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<c:if test="${degree >= 25}">
    <p>Its damn hot!!!!</p>
</c:if>
</body>
</html>
