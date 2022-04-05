<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Scaffolds List</title>
</head>
<body>
<table>
    <thead>
    <th>Description</th>
    <th>Foreman name</th>
    </thead>
    <tbody>
    <c:forEach items="${scaffolds}" var="scaffold">
        <tr>
            <td><c:out value="${scaffold.name}"/></td>
            <td><c:out value="${scaffold.foremanName}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>