<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyid-form</title>
</head>
<body>
<%--
			Model2 MVC 회원검색 
			
			client  --request--> Controller						<--> Model 							<-->  Database 
								    FindMemberByIdServlet   		   MemberDAO , MemberVO 	
										|
										|	forward 방식으로 이동 
										| 
										|
									View 	
										
									findbyid-success.jsp : 검색된 회원정보 제공 
									or
									findbyid-fail.jsp 	: alert 후 index로 이동 
										
 --%>
<form method="get" action="FindMemberByIdServlet">
<input type="text" name="memberId" placeholder="아이디" required="required">
<button type="submit">검색</button>
</form>
</body>
</html>















