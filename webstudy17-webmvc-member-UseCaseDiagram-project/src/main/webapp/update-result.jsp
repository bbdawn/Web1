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
		회원 정보가 수정되었습니다 <br><br>
		<%-- 아래 정보는 session의 회원정보를 이용해 보여준다  --%>
		<%
			MemberVO vo=(MemberVO)session.getAttribute("mvo");
		%>
		아이디 : <%=vo.getId() %>    <br>
		이름 : <%=vo.getName() %><br>
		주소 : <%=vo.getAddress() %>
	</div>
</body>
</html>











