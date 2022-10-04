<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Daegu Metro</title>
</head>
<body>
	<div id="header">
		<h1>Daegu Metro</h1>
		<p>info num: ${count }</p>
		<div>
			<a href="/metro">홈</a>
			<a href="/seoul">서울지하철노선</a>
			<a href="/seoulstation">서울지하철역</a>
		</div>
	</div>
	<div id="info">
		<table>
			<tr>
				<th>no</th>
				<th>라인</th>
				<th>기점</th>
				<th>종점</th>
				<th>역</th>
			</tr>
		</table>
		<c:forEach items="${list}" var="dm">
			<table>
				<tr>
					<td>${dm.id }</td>
					<td>${dm.line }</td>
					<td>${dm.startStaion }</td>
					<td>${dm.lastStaion }</td>
					<td>${dm.stationNum }</td>
				</tr>
			</table>
		</c:forEach>
	</div>
	<div id="page">
		<c:forEach items="${pageList}" var="page">
			<a href="seoul?page=${page }">${page+1 }</a>
		</c:forEach>
	</div>
	<div>
		<form method="post" action="write2">
			라인: <input type="text" name="line" autocomplete="off">
			기점: <input type="text" name="startStaion" autocomplete="off">
			종점: <input type="text" name="lastStaion" autocomplete="off">
			역: <input type="text" name="stationNum" autocomplete="off">
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