<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/main.js"></script>
</head>
<body>
<form:form action="/newninja" method="post" modelAttribute="ninja">
    <p>
        <form:label path="dojo">Dojo:</form:label>
        <form:select path="dojo">
            <c:forEach var = "dojo" items = "${allDojos}">
                 <form:option value="${dojo.id}">${dojo.name}</form:option>

                    </c:forEach>


        </form:select>
    </p>
    <p>
        <form:label path="firstName">First name:</form:label>
        <form:input type="text" path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last name:</form:label>
        <form:input type="text" path="lastName"/>
    </p>
    <p>
        <form:label path="age">Age:</form:label>
        <form:input type="number" path="age"/>
    </p>
    <input type="submit" value="Submit"/>


</form:form>


</body>
</html>