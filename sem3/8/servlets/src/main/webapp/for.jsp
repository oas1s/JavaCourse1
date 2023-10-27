<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<ul>
    <c:forEach items="${users}" var="user">
        <li>
                ${user.name}
        </li>
    </c:forEach>
</ul>

<table>
    <tr>
        <th>Item</th>
        <th>Index</th>
        <th>Count</th>
        <th>First</th>
        <th>Last</th>
    </tr>
    <c:forEach items="${users}" varStatus="status" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${status.index}</td>
            <td>${status.count}</td>
            <td>${status.first}</td>
            <td>${status.last}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
