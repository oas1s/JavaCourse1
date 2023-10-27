<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<c:forTokens items="${names}" delims="," var="name">
    ${name}
</c:forTokens>
</body>
</html>
