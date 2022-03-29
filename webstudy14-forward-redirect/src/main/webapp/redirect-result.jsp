<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect-result.jsp</title>
</head>
<body bgcolor="yellow">
redirect result page 입니다 
<%-- redirect는 서버와 클라이언트 브라우저에게 url을 지정해 이동시키는 방식이므로 
	기존 request와 response는 유지되지 않고 "새로운" request와 response가 생성되므로
	컨트롤러에서 request엣 저장된 정보를 활용할 수 없다!! --%>
</body>
</html>