<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step1-hidden-test-action.jsp</title>
</head>
<body>
	<%
	String command = request.getParameter("command");
	if (command.equals("Register")) {
	%>
	<%=request.getParameter("userId")%>
	아이디에 대한 정보를 등록
	<%
	} else if (command.equals("Delete")) {
	%>
	<%=request.getParameter("userId")%>아이디의 정보를 삭제
	<%
	}
	%>
</body>
</html>