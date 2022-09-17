<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <h1>welcome ${name }</h1>
<h2> your email id is ${email}</h2>
<h2> your password is ${password }</h2>
 --%>
 
 <h1>welcome ${user.name }</h1>
<h2> your email id is ${user.email}</h2>
<h2> your password is ${user.password }</h2>

</body>
</html>