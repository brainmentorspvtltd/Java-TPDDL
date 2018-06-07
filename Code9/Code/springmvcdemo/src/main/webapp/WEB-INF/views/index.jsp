<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${result}</h1>
<form action="register" method="post">
<input type='text' name='userid' placeholder='type userid here'>
<input type='text' name='pwd' placeholder='type Password here'>
<button type='submit'>Register</button>
</form>
</body>
</html>