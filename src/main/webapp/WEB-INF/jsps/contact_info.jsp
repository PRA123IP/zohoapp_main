<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact_info</title>
</head>
<body>
<h2>contact_info</h2>
<pre>
First Name: ${contact.firstName}
Last Name : ${contact.lastName}
Email     : ${contact.email}
Mobile    : ${contact.mobile}
</pre>
</body>
</html>