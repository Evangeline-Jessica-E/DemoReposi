<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Add">
		a:<input type="text" name="a"> <br>
		b:<input type="text" name="b"> <br>
		<input type="Submit">
	</form>
	<% if(request.getAttribute("sum") != null) { %>
	<% int sum = (int)request.getAttribute("sum"); %>
	<h2>The sum of num1 and num2 is <%= sum %> </h2>
	<% } %>
</body>
</html>
