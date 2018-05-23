<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Page</title>
</head>
<body>
<%! int counter = 0 ;  // Instance variable %>
<%

counter++;
%>
<h1>No of Times Page Visited <%=counter %> </h1>
</body>
</html>