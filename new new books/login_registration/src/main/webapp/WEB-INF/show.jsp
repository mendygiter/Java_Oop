<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Login And Registration</title>
</head>
<body>

<h3>Welcome</h3>


<p><a href="/books">Back to the shelves</a></p>

<h3>${oneBook.title}</h3>
<h3>${user.userName} read ${oneBook.title} by ${oneBook.author} </h3>
<h3> Here are ${user.userName} thoughts:</h3>

<h3>${oneBook.thoughts}</h3>

<a href="/edit/${oneBook.id}">Edit</a>

</body>
</html>