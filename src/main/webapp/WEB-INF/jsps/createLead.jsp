<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>createLead</title>
</head>
<body>
<h2>New create | Lead </h2>
<hr>
<form action="leadsave" method="post">
<pre>
FirstName<input type="text" name="firstName"/>
LastName<input type="text" name="lastName"/>
source
<select name="source" id="cars">
    <option value="newpaper">new paper</option>
    <option value="facebook">face book</option>
    <option value="youtube">youtube</option>
    <option value="tv">tv</option>
  </select>
email<input type="text" name="email"/>
mobile<input type="text" name="mobile"/>
<input type="submit" value="submit"/>
</pre>
</form>
</body>
</html>