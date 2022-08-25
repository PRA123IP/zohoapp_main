<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead_info</title>
</head>
<body>
<pre>
Lead Id: ${lead.id}
firstname: ${lead.firstName}
lastName: ${lead.lastName}
source: ${lead.source}
email: ${lead.email}
mobile: ${lead.mobile}
</pre>
<form action ="convert" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="convert"/>
</form>
</body>
</html>