<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp session test1</title>
</head>
<body>
<h4>session-test1</h4>
<%--
		web container에 의해 jsp -> java 생성, session 생성 코드가 삽입이 되어 있다 
		jsp 는 기본적으로 session을 사용할 수 있도록 구성되어 있다 
 --%>
session id : <%=session.getId() %> <br><br>
<%--
		같은 원리로 ServletConfig와 ServletContext 또한 사용할 수 있도록 구성되어 있다 	
 --%>
ServletConfig : <%=config %><br><br>
ServletContext : <%=application %><br><br>
<%--
		jsp 에서 기본적으로 제공하는 세션을 이용해 회원정보를 저장한다 
 --%>
<%
		session.setAttribute("memberVO", new MemberVO("java","아이유","오리"));
%>
세션에 회원정보를 할당 <br><br>
<a href="session-test2.jsp">session2에서 확인</a>

</body>
</html>









