<%@page import="org.kosta.webstudy17.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WebMVC 회원관리</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
	<div class="container">
		<h4>WebMVC 회원관리</h4>
		
		<form action="FindMemberByIdServlet" method="get">
		<input type="text" name="memberId" placeholder="아이디" required="required">
		<button type="submit">회원검색</button>
		</form>
		<br><br>
		<%
			//로그인 성공시 컨트롤러에서 세션에 mvo를 저장하는 것을 이용해 로그인 유무를 판단한다
			MemberVO mvo=(MemberVO)session.getAttribute("mvo");
			if(mvo==null){
		%>
		<%-- 비로그인 상태일 경우에는 아래의 로그인 폼을 제공한다 --%>
		<form action="LoginServlet" method="post">
		<input type="text" name="id" placeholder="아이디" required="required"> <br>
		<input type="text" name="password" placeholder="패스워드" required="required"><br>
		<button type="submit">로그인</button>
		</form>
		<br><br>
		<a href="register-form.jsp">회원가입</a>
		<%
			}else{
		%>
		<%-- 로그인 상태일 경우에는 아래의 요소를 제공한다 --%>
		<%=mvo.getName() %>님 <br> 
		
		<%-- 
			 로그인과 로그아웃은 post방식을 권장한다. 
			 아래의 로그아웃 링크를 눌렀을 때 post방식으로 요청하게 만들기 위해  
			 href속성에 #을 부여하고, onclick속성을 이용해 javascript function으로 submit하도록 한다
			 
		--%>
		<a href="#" onclick="logout()">로그아웃</a>
		<form action="LogoutServlet" method="post" id="LogoutForm">
		
		</form>
		<script type="text/javascript">
			function logout(){
				//alert("logout click");
				document.getElementById("LogoutForm").submit();
			}
		</script>
		<br><br>
		<%-- 주소로 회원 검색 --%>
		<form method="get" action="FindMemberListByAddressServlet">
			<input type="text" name="address" placeholder="주소" required="required">
			<button type="submit">검색</button>
		</form>
		<br><br>
		<a href="UpdateFormServlet">회원정보수정</a>
		<%
			}
		%>
	</div>
</body>
</html>






