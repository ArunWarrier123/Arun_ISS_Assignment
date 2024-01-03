<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="regForm" method="post" style="display: flex; flex-direction: column; justify-content: flex-start; width: fit-content">
		<div>
			Username : <input type="text" name="username">
		</div>
		<div>
			Email : <input type="text" name="email">
		</div>
		<div>
			Password: <input type="password" name="password">
		</div>
		<input type="submit" value="Register">
	</form>
	
		<a href="login.jsp">Already have an Account? Login</a>

</body>
</html>