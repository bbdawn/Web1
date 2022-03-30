<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session-test2.jsp</title>
</head>
<body bgcolor="lime">
	<h4>session-test2</h4>
	<%--
			session-test2.jsp 에서는 session에 저장한 회원객체가 존재하지 않으면  현 세션에서는 회원정보가 존재하지 않습니다 메세지 출력
			session에 회원객체가 존재하면 세션에 저장된 회원 이름을 출력 
			
			만약 
			session-test1.jsp 를 거쳐서 현 페이지로 오지 않거나 
			세션 time out 내 재접속이 없거나 session-test3.jsp(session.invalidate()) 를 거쳐서 현 jsp 에 접속하는 경우에는 
			jsp 에 내장된 getSession() 이 실행되어 기존 세션이 없는 것으로 판단하여 새로운 세션을 생성하여 사용하게 된다 
 --%>
 session id : <%=session.getId() %> <br><br>
	<%
	MemberVO vo = (MemberVO) session.getAttribute("memberVO");
	if (vo == null) {
	%>
		현 세션에서는 회원정보가 존재하지 않습니다 
	<%
	} else {
	%>
		세션에 저장된 회원이름 : <%=vo.getName() %>
	<%
	}
	%>
	<br><br>
	<a href="session-test1.jsp">session1으로 이동</a>
	<br><br>
	<a href="session-test3.jsp">session3로 이동</a>

</body>
</html>













