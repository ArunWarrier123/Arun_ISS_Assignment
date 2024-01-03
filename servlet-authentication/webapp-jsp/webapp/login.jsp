<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="loginForm" method="post"
		style="display: flex; flex-direction: column; justify-content: flex-start; width: fit-content">
		
		<div>
			Email : <input type="text" name="email">
		</div>
		<div>
			Password: <input type="password" name="password">
		</div>
		<input type="submit" value="Login">
	</form>
	
	<a href="register.jsp">New User? Create an Account</a>
</body>
</html>