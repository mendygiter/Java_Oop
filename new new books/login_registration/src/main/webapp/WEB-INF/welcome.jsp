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

<h3>Welcome, <c:out value="${user.userName}"></c:out>!</h3>
<p>Books from everyone's shelves:</p>

<p><a href="/logout">logout</a></p>
<p><a href="/new">Create new book</a></p>



<table>
    <thead>
    <th>Id</th>
    <th>Title</th>
    <th>Author Name</th>
    <th>Posted By</th>
    </thead>

    <tbody>
    <c:forEach var = "book" items = "${allBooks}" >
        <tr>
            <td>
                <h3>${book.id}</h3>
            </td>
            <td>
                <h3><a href="/show/${book.id}">${book.title}</a></h3>
            </td>
            <td>
                <h3>${book.author}</h3>
            </td>
            <td>
                <h3>${book.postedBy.getUserName()}</h3>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>