<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ include file="menu.jsp" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact_all_list</title>
</head>
<body>
<h2>contact_all_list</h2>
<table border='1'>
<tr>
<td>firstname</td>
<td>lastname</td>
<td>email</td>
<td>mobile</td>
<td>Billing</td>

<td>delete</td>
</tr>
<c:forEach items="${contact}" var="contact">
<tr>
<td><a href="contactinfo?id=${contact.id}">${contact.firstName}</a></td>
<td>${contact.lastName}</td>
<td>${contact.email}</td>
<td>${contact.mobile}</td>
<td><a href="generatebiling?id=${contact.id}">create billing</a></td>

<td><a href="delete2?id=${contact.id}">delete</a></td></tr>
</c:forEach>
</table>
</body>
</html>