<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<h1>All Expenses</h1>
<table>
    <thead>
    <th>Expenses</th>
    <th>Vendor</th>
    <th>Amount</th>
    </thead>

    <tbody>
    <c:forEach var="expense" items="${expensesFromController}">
        <tr>
            <td>
                <h3>${expense.id}</h3>
            </td>
            <td>
                <h3>${expense.expenses}</h3>
            </td>
            <td>
                <h3>${expense.vendor}</h3>
            </td>
            <td>
                <h3>${expense.amount}</h3>
            </td>
        </tr>
    </c:forEach>
    </tbody
</table>
<h1>Add an expense:</h1>
<h5>Description must not be blank</h5>

<form action="/expenses" method="post">

    <p>Expense name:</p>
    <input type="text" name="expense" id="name"> <br>
    <p>Vendor:</p>
    <input type="text" name="vendor" id="vendor"> <br>
    <p>Amount:</p>
    <input type="text" name="amount" id="amount"> <br>
    <p>Description:</p>
    <input type="message" name="description" id="desc"> <br>

    <input type="submit" value="Submit">



</form>


</body>
</html>