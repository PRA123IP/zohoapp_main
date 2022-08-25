<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file="menu.jsp" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list_all_lead</title>
</head>
<body>
<h2>list_all_lead</h2>
<table border='1'>
<tr>

<td>first Name</td>
<td>Last Name</td>
<td>source</td>
<td>email</td>
<td>mobile</td>
</tr>
<c:forEach items="${lead}" var="lead">
<tr>

<td><a href="leadinfo?id=${lead.id}">${lead.firstName}</a></td>
<td>${lead.lastName}</td>
<td>${lead.source}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>

</tr>
</c:forEach>

</table>
</body>
</html>