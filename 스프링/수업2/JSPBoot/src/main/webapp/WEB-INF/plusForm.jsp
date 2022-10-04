<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>plusForm.jsp</title>
</head>
<body>
	<a href="/">Home</a>
	<!-- 지금은 자바스크립트를 활용하지만 예전에는 이 방식을 활용 -->
	<!-- tomcat을 거쳐야 브라우저에 뜸 그렇지 않으면 함수가 뜸 -->
	<!-- 
		get -> 주소창에 데이터가 노출됨 
		post -> 주소창에 데이터가 노출되지 않음(확인 방법은 존재함. 패킷을 통해 확인할 수 있고, 이를 방지하기 위해 https를 사용). 보안상 위험성이 있는 데이터를 다룰 때는 필히 post 방식을 사용
	-->
	<!--form method="get" action="plus">
		value1: <input type="text" name="value1" autocomplete="off"><br/>
		value2: <input type="text" name="value2" autocomplete="off"><br/>
		<input type="submit" value="확인" style="width:235px">
	</form -->
	<form method="post" action="plus">
		value1: <input type="text" name="value1" autocomplete="off"><br/>
		value2: <input type="text" name="value2" autocomplete="off"><br/>
		<input type="submit" value="확인" style="width:235px">
	</form>
</body>
</html>