<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/15/2023
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/account/store" method="post" modelAttribute="account">
    <form:input type="text" path="userName"/>
    <form:input type="text" path="password"/>

    <button type="submit">Gửi</button>

</form:form>

</body>
</html>
