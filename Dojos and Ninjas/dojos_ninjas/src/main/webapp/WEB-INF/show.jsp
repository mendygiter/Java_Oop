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
<h1>${oneDojo.name} Location Ninjas</h1>
<table>
    <thead>
    <th>First Name </th>
    <th> Last Name</th>
    <th> Age</th>
    </thead>
    <tbody>
    <c:forEach var = "ninja" items = "${oneDojo.ninjas}">
        <tr>
            <td>
                <h3>${ninja.firstName}</h3>
            </td>
            <td>
                <h3>${ninja.lastName}</h3>
            </td>
            <td>
                <h3>${ninja.age}</h3>
            </td>

        </tr>
    </c:forEach>
    </tbody
</table>
</body>
</html>