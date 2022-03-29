<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model2 MVC</title>
</head>
<body>
<H4>Model2 MVC</H4>
<%--
			회원수 조회 
			index.jsp   ---request--> Controller					<--> Model 			<--> Database 
										  AllMemberCountServlet 		   MemberDAO	
										  	|
										  	| forward 방식으로 이동 
										  View 
										  	  member-count.jsp 
						 <--response-- 				  	  	
										  	
 --%>
<ul>
	<%--  전체회원수를 조회하기 위해 Controller로 요청을 한다  --%>
	<li><a href="AllMemberCountServlet">전체 회원수보기</a></li>
	<li><a href="findbyid-form.jsp">회원검색폼</a></li>
</ul>
<img src="images/Model2MVC-1.png" width="400"><br>
<img src="images/Model2MVC-2.png" width="400"><br>
</body>
</html>



















