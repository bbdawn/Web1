<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step7-1-location-test</title>
</head>
<body>
<form action="step7-2-action.jsp">
<input type="text" name="userName" required="required" placeholder="이름"><br>
<input type="number" name="userAge" required="required" placeholder="나이" min="1"><br>
<button type="submit">구매하기</button>
</form>
<%--											 step7-2-action.jsp
		step7-1-location-test --submit-->  19세 이상이면
												 아이유님 주류 구매 가능하십니다 
												 
											19세 미만이면 
												 javascript alert 으로 아이유님 미성년이므로 주류 구매 불가능하십니다
												 alert 확인 누르면
												 다시 step7-1-location-test로 이동된다 
 --%>
</body>
</html>













