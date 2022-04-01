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
		<%-- session에 있는 회원정보를 이용해 아래 수정폼에 기존 정보를 제공한다 --%>
		<%
			MemberVO vo=(MemberVO)session.getAttribute("mvo");
		%>
		<form action="UpdateMemberServlet" method="post">
		<input type="text" name="id" value="<%=vo.getId() %>"  required="required" readonly="readonly"><br>
		<input type="password" name="password" value="<%=vo.getPassword() %>"  required="required"><br>
		<input type="text" name="name" value="<%=vo.getName() %>"  required="required"><br>
		<input type="text" name="address" value="<%=vo.getAddress()%>"  required="required"><br>
		<button type="submit">수정하기</button>
		</form>
	</div>
</body>
</html>













