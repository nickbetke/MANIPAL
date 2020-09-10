<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Athletes</h3>
	<table border="1">
	<tr>
		<th>Name</th>
		<th>Gender</th>
		<th>Category</th>
		<th>mail</th>
		<th>mobile</th>
	</tr>
	<c:forEach var="athlete" items="${Athletes}">
	<tr>
		<td>${athlete.name}</td>
		<td>${athlete.gender}</td>
		<td>${athlete.category}</td>
		<td>${athlete.mail}</td>
		<td>${athlete.mobile}</td>
	</tr>	

	</c:forEach><br/>
	<a href="/athlete/welcome">home</a>
</table>





</body>
</html>