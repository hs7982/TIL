<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과</h1>
	<h1>== JSP 방식 == </h1> 
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String email = request.getParameter("email"); 
%>
	<h1>id= <%= id %></h1>
	<h1>pw= <%= pw %></h1>
	<h1>name= <%= name %></h1>
	<h1>email= <%= email %></h1>
	
	<hr>
	http://localhost:8080/app/register/save?id=?&pw=
	<h1>== EL 방식 == </h1>
	<h1>id= ${ param.id } </h1>
	<h1>pw= ${ param.pw } </h1>
	<h1>name= ${ param.name } </h1>
	<h1>email= ${ param.email } </h1>
</body>
</html>
