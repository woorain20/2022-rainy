<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Metro</title>
</head>
<body>
	<div id="header">
		<h1>Metro Infomation</h1>
		<p>info num: ${count }</p>
		<div>
			<a href="/seoul">서울지하철노선</a>
			<a href="/daegu">대구지하철노선</a>
			<a href="/seoulstation">서울지하철역</a>
		</div>
	</div>
	<div id="info">
		<table>
			<tr>
				<th>no</th>
				<th>지역</th>
				<th>라인</th>
			</tr>
		</table>
		<c:forEach items="${list}" var="ma">
			<table>
				<tr>
					<td>${ma.id }</td>
					<td>${ma.region }</td>
					<td>${ma.line }</td>
				</tr>
			</table>
		</c:forEach>
	</div>
	<div id="page">
		<c:forEach items="${pageList}" var="page">
			<a href="metro?page=${page }">${page+1 }</a>
		</c:forEach>
	</div>
	<div>
		<form method="post" action="write">
			지역: <input type="text" name="region" autocomplete="off">
			라인: <input type="text" name="line" autocomplete="off">
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