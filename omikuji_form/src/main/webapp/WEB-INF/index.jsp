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
	 <h1>Send an Omikuji!</h1>
        <form action="/omikuji"  method="post">
            <p>Pick any number from 5 to 25</p>
            <input type="number" min="5" max="25" value="5">
            <br>
            <p>Enter the name of any city:</p>
            <input type="text" id="city" name="city"> <br>
            <p>Enter the name of any real person:</p>
            <input type="text" id="person" name="person"> <br>
            <p>Enter the proffesional endouver or hobby:</p>
            <input type="text" name="hobby" id="hobby"> <br>
            <p>Enter any type of living thing:</p> <br>
            <input type="text" name="thing" id="thing">
            <p>Say something nice to someone:</p> <br>
            <textarea name="message" id="nice" cols="20" rows="5"></textarea> <br>

            <p>Send and show a friend</p>

            <input type="submit" value="Submit">
        </form>
    <!--    <select class="1-100"></select>-->
</body>
</html>