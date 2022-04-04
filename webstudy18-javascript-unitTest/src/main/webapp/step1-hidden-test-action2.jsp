<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step1-hidden-test-action2.jsp</title>
</head>
<body>
<%-- hidden 으로 전송된 게시글 no 를 이용해 db의 정보를 삭제할 수 있다 --%>
<%=request.getParameter("no") %>번 게시글을 삭제합니다 
</body>
</html>