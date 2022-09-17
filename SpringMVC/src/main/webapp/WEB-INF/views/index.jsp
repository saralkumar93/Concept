<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<h2>home page</h2>
<h2>this is home page</h2>
<%
String name=(String) request.getAttribute("name");
Integer id =(Integer)request.getAttribute("id");
List<String> friends =(List<String>) request.getAttribute("f");


%>

<h1>Name is <%=name %></h1>
<h3>Id is : <%=id %></h3>

<%
for (String s:friends){
	%>
	
	<h1><%=s%></h1> 
<%
}
%>
</body>
</html>