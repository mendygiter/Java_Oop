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

<p>   Add a book to your shelf</p>
<p><a href="welcome">Back to the shelves</a></p>
<form:form action="/newbook" method="POST" modelAttribute="book">
    <p>
        <form:label path="title">Title:</form:label>
        <form:input type="text" path="title"/>
        <form:errors path="title"/> 
    </p>
    <p>
        <form:label path="author">Author::</form:label>
        <form:input type="text" path="author"/>
        <form:errors path="author"/> 
    </p>
    <p>
        <form:label path="thoughts">My Thoughts::</form:label>
        <form:input type="text" path="thoughts"/>
        <form:errors path="thoughts"/> 
    </p>
    
    <input type="submit" value="Submit">
</form:form>
</body>
</html>