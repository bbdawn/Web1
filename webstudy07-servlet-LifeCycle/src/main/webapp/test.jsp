<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test jsp</title>
</head>
<body>
<%--  ServletContext의 init param을 받아본다     --%>
관리자 이메일 : <%=application.getInitParameter("adminEmail") %> <br><br>
<%-- ContextTestServlet1 이 ServletContext에 저장한 정보를 받아온다         --%>
<%=application.getAttribute("nick") %>
<br><br>
<a href="ContextTestServlet1">ContextTestServlet1</a>
<br><br>

<%--  jsp 주석 : jsp 는 이후에 자세히 공부할 예정입니다. 지금은 서블릿 계층구조를 이해하기 위해 테스트해봅니다   --%>
<% for(int i=0;i<20;i++){ %>
<h3>jsp test 입니다</h3>
<% } %>
</body>
</html>






