<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing create</title>
</head>
<body>
<h2>Billing create | Billing </h2>
<hr>
<form action="billingsave" method="post">
<pre>
FirstName<input type="text" name="firstName" value="${contact.firstName}" readonly/>
LastName<input type="text" name="lastName" value="${contact.lastName}" readonly/>

email<input type="text" name="email" value="${contact.email}" readonly/>
mobile<input type="text" name="mobile" value="${contact.mobile}" readonly/>
product<input type="text" name="product"/>
amount<input type="text" name="amount"/>
<input type="submit" value="submit"/>
</pre>
</form>
</body>
</html>