<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyid-success</title>
</head>
<body>
<%-- forward 이동방식은 기존 request,response를 유지하므로 아래와 같이 id를 출력할 수 있다 --%>
<%=request.getParameter("memberId") %> 아이디에 대한 회원검색결과 <br>
<%-- 컨트롤러가 저장한 회원정보를 request로부터 getAttribute() 해서 아래 정보를 제공한다  --%>
<%
		MemberVO vo=(MemberVO)request.getAttribute("memberVO");//Object type으로 반환하므로 Object down casting을 한다 
%>
이름 : <%=vo.getName() %>    <br>
주소 : <%=vo.getAddress() %>     <br>
</body>
</html>












