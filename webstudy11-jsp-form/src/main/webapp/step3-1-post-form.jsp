<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request method post 방식 테스트</title>
</head>
<body>
<form action="step3-2-post-action.jsp" method="post">
<input type="text" name="userName" placeholder="이름" required="required"><br>
<input type="number" name="userAge" min="1" placeholder="나이" required="required"><br>
<button>전송</button> <%--button 타입을 지정하지 않으면 submit type이 기본으로 설정됨 --%>
</form>
<%--
	19세 이상이면 
	이름: 아이유 
	나이: 성인 30세
	
	19세 미만이면
	이름: 박보검
	나이: 미성년 17세
	
	http request,response시 숫자 정보 또한 모두 문자열(String)으로 인식되므로
	처리하는 서버에서 연산이 필요할 경우에는 Integer.parseInt()를 이용해 정수형으로 
	변경한 후 처리한다
 --%>
</body>
</html>