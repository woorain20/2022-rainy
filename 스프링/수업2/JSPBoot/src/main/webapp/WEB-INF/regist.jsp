<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>regist.jsp</title>
</head>
<body>
	<a href="/userform">UserFrom</a>
	<h2>${user.name}님 회원 가입을 축하합니다.</h2>
	<h1>name: ${user.name}</h1>
	<h1>email: ${user.email}</h1>
	<h1>age: ${user.age}</h1>
</body>
</html>