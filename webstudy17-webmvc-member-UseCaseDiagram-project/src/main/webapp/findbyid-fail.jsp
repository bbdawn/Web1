<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WebMVC 회원관리</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
	<div class="container">
		<h4><a href="index.jsp">WebMVC 회원관리</a></h4>
		<%=request.getParameter("memberId") %> 아이디에 대한 회원 정보가 존재하지 않습니다 
	</div>
</body>
</html>