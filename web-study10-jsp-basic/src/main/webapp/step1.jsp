<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step1 jsp basic</title>
</head>
<body>
	<!--  html 주석 : client 측에 노출  -->
	<%-- jsp 주석 : client 측에 노출x  --%>
	jsp basic study
	<br>
	<br>
	<%
	// 자바 코드 영역이므로 기존의 자바 주석을 이용한다 
	// scriptlet 영역은 service 메서드 내에 자바 코드로 반영된다 
	for (int i = 1; i <= 5; i++) {
	%>
		<font color="green" size="5">맥주<%=i%>잔</font><br>	
	<%
	}
	%>
	<%!
		//인스턴스 변수 선언 
		int count;
	%>
	접속수 <%=++count %> 
	<br><br>
	현재 시간 <%=new Date().toString() %>
</body>
</html>






