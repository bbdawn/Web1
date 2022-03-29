<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수 view</title>
</head>
<body>
<a href="index.jsp">Home</a><br><br>
<%-- Web MVC 의 View : 클라이언트에게 응답하는 역할을 전담 
	   Controller에서 공유한 회원수 정보를 반환받아 화면으로 제공한다 	
 --%>
회원수 <%=request.getAttribute("totalCount") %>명 
</body>
</html>









