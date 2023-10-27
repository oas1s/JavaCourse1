<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</head>
<body>
<c:choose>
    <c:when test="${degree >25}"> Its damn hot</c:when>
    <c:when test="${degree <= -20}"> Its damn cold</c:when>
    <c:otherwise>Its ok</c:otherwise>
</c:choose>
</body>
</html>
