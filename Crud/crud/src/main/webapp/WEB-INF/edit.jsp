<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isErrorPage="true" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%--<form:form action="/edit/${travel.id}" method="post" modelAttribute="travel">--%>
<%--    <input type="hidden" name="_method" id="put">--%>

<%--    <p>Expense name:</p>--%>
<%--    <form:input type="text" path="expense" id="name"/> <br>--%>
<%--    <p>Vendor:</p>--%>
<%--    <form:input type="text" path="vendor" id="vendor"/> <br>--%>
<%--    <p>Amount:</p>--%>
<%--    <form:input type="text" path="amount" id="amount"/> <br>--%>
<%--    <p>Description:</p>--%>
<%--    <form:input type="message" path="description" id="desc"/> <br>--%>

<%--    <input type="submit" value="Edit Submit">--%>



<%--</form:form>--%>


<h1>Edit Expense</h1><a href="/edit/">Go back</a>
<br>
<div>
    <h1>Expense</h1>
    <form:form action="/edit/${expense.id}" method="post" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">

    <div>
        <form:label path="expenses">Expense Name: </form:label><br />
        <form:errors path="expenses" class="text-danger"/>
        <form:input style="width:250px;" path="expenses"/>
    </div>

    <div>
        <form:label path="vendor">Vendor: </form:label><br />
        <form:errors path="vendor" class="text-danger"/>
        <form:input style="width:250px;" path="vendor"/>
    </div>

    <div>
        <form:label path="amount">Amount: </form:label><br />
        <form:errors path="amount" class="text-danger"/>
        <form:input style="width:250px;" type="double" path="amount"/>
    </div>

    <div>
        <form:label path="description">Description: </form:label><br />
        <form:errors path="description" class="text-danger"/>
        <form:textarea style="width:250px;" rows="3" path="description"/>
    </div>

    <div>
        <input type="submit" value="Submit"/>
    </div>



    </form:form>
</body>
</html>