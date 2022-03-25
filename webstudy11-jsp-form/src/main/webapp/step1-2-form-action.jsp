<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step1-2-form-action</title>
</head>
<body>
<%--
	클라이언트가 전송한 아이디와 이름을 서버에서 받아와 화면에 응답한다
 --%>
 <% //tomcat/work에 생성되는 java class를 확인하면 _jspService(request,response)메서드 내에
 	//아래 코드가 삽입되므로 request 객체를 바로 이용할 수 있다
 	String id=request.getParameter("userId");
 	String name=request.getParameter("userName");
 %>
 고객 아이디 : <%=id %>       <br>
 고객 이름 : <%=name %>    
</body>
</html>