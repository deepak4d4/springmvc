<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>You are welcome</h1>
<h1>${Header}</h1>
<h1>your user name is ${user.userName}</h1>
<h1>your email is ${user.email}</h1>
<h1>your password is ${user.password} which is not secure</h1>
</body>
</html>