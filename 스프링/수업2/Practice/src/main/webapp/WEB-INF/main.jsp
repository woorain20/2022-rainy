<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
	<table>
		<tr>
			<th>코드</th>
			<th>리그명</th>
			<th>국가</th>
			<th>설립년도</th>
		</tr>
		<tr>
			<td>${league.idleague}</td>
			<td>${league.league}</td>
			<td>${league.nation}</td>
			<td>${league.found}</td>
		</tr>
	</table>
</body>
</html>