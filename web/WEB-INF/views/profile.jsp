<%--
  Created by IntelliJ IDEA.
  User: chenshipeng
  Date: 2019-10-02
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>

</head>
<body>
    <h1>
        Your Profile
    </h1>
    <c:out value="${spitter.username}"/><br/>
    <c:out value="${spitter.firstName}"/>
    <c:out value="${spitter.lastName}"/>
</body>
</html>
