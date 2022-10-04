<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userform.jsp</title>
</head>
<body>
	<a href="/">Home</a>
	<form method="post" action="regist">
		name: <input type="text" name="name" autocomplete="off"><br/>
		email: <input type="text" name="email" autocomplete="off"><br/>
		age: <input type="text" name="age" autocomplete="off"><br/>
		<input type="submit" value="확인" style="width:230px">
	</form>
</body>
</html>