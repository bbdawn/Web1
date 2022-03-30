<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session-test3.jsp</title>
</head>
<body bgcolor="orange">
<h4>session-test3</h4>
session id : <%=session.getId() %> <br><br>

  <%
	session.invalidate();//세션 무효화 처리
	%>
	세션 무효화 처리
	<%-- 
		세션을 무효화 했기 때문에 getAttribute() 할 수 없다 
	<%=session.getAttribute("memberVO") %>
	 --%>
	<br>
	<br>
	<a href="session-test1.jsp">session1</a>
	<br>
	<a href="session-test2.jsp">session2</a>
	<br>
</body>
</html>