<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 목록</title>
</head>
<body>
	<h1>방명록</h1>
	<br/>
	방명록 전체 수: ${count }
	<br/>
	<br/>

	<c:forEach items="${list }" var="g">
		<table>
			<tr>
				<td>순번: ${g.id }</td>
				<td>작성자: ${g.name }</td>
			</tr>
			<tr>
				<td colspan=2>내용: ${g.content }</td>
			</tr>
			<tr>
				<td colspan=2>등록: ${g.regdate }</td>
			</tr>
		</table>
		<br/>
	</c:forEach>
	<c:forEach items="${pageList}" var="page">
		<a href="list?page=${page }">${page+1 }</a>
	</c:forEach><br/>
	<form method="post" action="write">
		name: <input type="text" name="name" autocomplete="off"><br/>
		<textarea name="content" rows="6" cols="60"></textarea><br/>
		<input type="submit" value="등록">
	</form>
</body>
</html>
<style>
	a{
		text-decoration: none;
	}
</style>