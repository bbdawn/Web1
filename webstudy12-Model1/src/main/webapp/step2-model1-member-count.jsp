<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model1 설계방식 회원수보기</title>
</head>
<body>
<%
	//step1과 비교해보면 jsp에서 java 개발 부분이 현저히 줄어든다 
	MemberDAO dao=new MemberDAO();
	int count=dao.getAllMemberCount();    
%>

<h4>Model 1 Architecture</h4>
회원수 <%=count %>명 
</body>
</html>