<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"  %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>help page</h1>

<h3>helping.........</h3>

<%
/*  String name =(String) request.getAttribute("name");
Integer rollNo= (Integer) request.getAttribute("rollNo");
LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */

%>

<h1>Hello my name is :<%--  <%=name %> --%> ${name}</h1>
<h1>Hello my rollNo is : <%-- <%=rollNo %> --%>${rollNo}</h1>
<h1> date and Time is :<%-- <%=time %> --%>${time}</h1>



<hr>
<h1> List of marks is :<%-- <%=time %> --%>${marks}</h1>
<c:forEach var="item" items="${marks}">
    <h1>${item }</h1>

  

</c:forEach>

</body>
</html>