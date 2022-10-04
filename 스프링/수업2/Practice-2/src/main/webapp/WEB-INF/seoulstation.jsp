<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seoul Station</title>
</head>
<body>
	<div id="header">
		<h1>Seoul Station</h1>
		<p>info num: ${count }</p>
		<div>
			<a href="/metro">홈</a>
			<a href="/seoul">서울지하철노선</a>
			<a href="/daegu">대구지하철노선</a>
		</div>
	</div>
	<div id="info">
		<table>
			<tr>
				<th>no</th>
				<th>역</th>
				<th>라인</th>
				<th>환승라인</th>
				<th>인접역</th>
			</tr>
		</table>
		<c:forEach items="${list}" var="ss">
			<table>
				<tr>
					<td>${ss.id }</td>
					<td>${ss.station }</td>
					<td>${ss.line }</td>
					<td>${ss.crossLine }</td>
					<td>${ss.adjacency }</td>
				</tr>
			</table>
		</c:forEach>
	</div>
	<div id="page">
		<c:forEach items="${pageList}" var="page">
			<a href="seoulstation?page=${page }">${page+1 }</a>
		</c:forEach>
	</div>
	<div>
		<form method="post" action="write3">
			역: <input type="text" name="station" autocomplete="off">
			라인: <input type="text" name="line" autocomplete="off">
			환승라인: <input type="text" name="crossLine" autocomplete="off">
			인접역: <input type="text" name="adjacency" autocomplete="off">
			<input type="submit" value="등록">
		</form>
	</div>
</body>
</html>
<style>
	table{
		border: 1px dotted black;
	}
	th{
		width: 150px;
		height: 50px;
		text-align: center;
	}
	td{
		width: 150px;
		height: 50px;
		text-align: center;
	}
	a{
		text-decoration: none;
	}
</style>