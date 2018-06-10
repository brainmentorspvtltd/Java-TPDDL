<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${result}
	<form action="register" method="post">
		<input type='text' name='userid'>
		<input type='password' name='pwd'>
		<button>Register</button>
	</form>
</body>
</html>