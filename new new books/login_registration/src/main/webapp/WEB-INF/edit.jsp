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

<p>Change your entry</p>
<p><a href="/books">Back to the shelves</a></p>
<form:form action="/editbook" method="post" modelAttribute="oneBook">
    <p>
        <form:label path="title">Title:</form:label>
        <form:input type="text" path="title"/>
    </p>
    <p>
        <form:label path="author">Author::</form:label>
        <form:input type="text" path="author"/>
    </p>
    <p>
        <form:label path="thoughts">My Thoughts::</form:label>
        <form:input type="text" path="thoughts"/>
    </p>
    <input type="submit" value = "Edit">
</form:form>
</body>
</html>