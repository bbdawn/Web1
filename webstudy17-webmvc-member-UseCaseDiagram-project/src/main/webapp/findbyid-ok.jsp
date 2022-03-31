<%@page import="org.kosta.webstudy17.model.MemberVO"%>
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
		검색 결과 <br><br>
		<%
				MemberVO vo=(MemberVO)request.getAttribute("memberVO");
		%>
		회원 아이디 : <%=vo.getId() %>   <br>
		회원 이름 : <%=vo.getName() %> <br>
		회원 주소 : <%=vo.getAddress() %>
	</div>
</body>
</html>









