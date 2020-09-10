	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 
you can edit action --> 
	<form action="addAthlete" method="post">
	<table border="1">
	<tr>
	 <td>Name: </td> <td><input type="text" name="name"/> </td><br/>
	 </tr>
	 <tr>
	<td colspan="2"> Male:<input type="radio" name="gender" value="male"/>
	 
	 Female:<input type="radio" name="gender" value="female"/><br/></td>
	 </tr>
	 <tr>
	 <td colspan="2">
	 <select name="category">
	 	<option>Running</option>
	 	<option>High Jump</option>
	 	<option>Hurdles</option>
	 	<option>Relay</option>
	 	<option>Javelin Throw</option>
	 	<option>Shot put</option>
	 </select></td>
	 
	 </tr>
	 <tr>
	 
	 <td>mail : </td><td><input type="text" name="mail"/> <br/></td>
	 </tr>
	 <tr>
	 <td>mobile :</td> <td><input type="text" name="mobile"/> <br/></td>
	 </tr>
	 <td colspan="2">
	<input type="submit" value="Submit" />
	</td>
	</table>
	</form><br/>
	<a href="/athlete/welcome">home</a>
</body>
</html>