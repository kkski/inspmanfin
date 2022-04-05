<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Inspectors list</title>
</head>
<body>
<table>
    <thead>
    <th>First name</th>
    <th>Last name</th>
    <th>Email</th>
    </thead>
    <tbody>
    <c:forEach items="${inspectors}" var="inspector">
        <tr>
            <td><c:out value="${inspector.firstName}"/></td>
            <td><c:out value="${inspector.lastName}"/></td>
            <td><c:out value="${inspector.email}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>