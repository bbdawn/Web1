<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session-test5-mvc-login-ok.jsp</title>
</head>
<body>
<%
		MemberVO vo=(MemberVO)session.getAttribute("mvo");
%>	<%=vo.getName() %>님 로그인 되었습니다 
</body>
</html>



