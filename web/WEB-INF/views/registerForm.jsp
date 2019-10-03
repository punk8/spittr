<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: chenshipeng
  Date: 2019-10-02
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">

</head>
<body>
    <h1>Register</h1>
    <form method="post" th:th:object="${spitter}" enctype="multipart/form-data">
        First Name:<input type="text" name="firstName"/><br/>
        Last Name:<input type="text" name="lastName"/><br/>
        Username:<input type="text" name="username"/><br/>
        Password:<input type="password" name="password"/><br/>

        <label>Profile Picture</label>
        <input type="file" name="profilePicture" accept="image/jpeg,image/png,image/gif"/><br/>

        <input type="submit" value="Register"/>
    </form>
</body>
</html>
