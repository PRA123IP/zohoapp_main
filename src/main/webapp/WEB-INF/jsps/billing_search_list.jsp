<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>billing_info</title>
</head>
<body>
<h2>Billing_info</h2>
<table>
<tr>
<td>id</td>
<td>First Name</td>
<td>last name</td>
<td>email</td>
<td>mobile</td>
<td>product</td>
<td>amount</td>
<td>delete</td>
</tr>
<c:forEach items="${billing}" var="billing">
<tr>
<td>${billing.id}</td>
<td> <a href="billgenerated?id=${billing.id}">${billing.firstName}</a></td>
<td>${billing.lastName}</td>
<td>${billing.email}</td>
<td>${billing.mobile}</td>
<td>${billing.product}</td>
<td>${billing.amount}</td>
<td><a href="delete?id=${billing.id}">delete</a></td>
</tr></c:forEach>

</table>

</body>
</html>