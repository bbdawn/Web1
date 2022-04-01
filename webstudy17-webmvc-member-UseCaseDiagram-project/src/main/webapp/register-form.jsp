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
		<h4><a href="index.jsp">WebMVC 회원관리</a></h4>
		<form action="RegisterMemberServlet" method="post" onsubmit="return checkRegForm()">
		<input type="text" name="id" id="id" placeholder="아이디" required="required">
		<%--hidden이용 : 중복확인하지 않으면 공란, 중복확인하면 인증받은 아이디 정보를 value저장 --%>
		<input type="hidden" id="checkFlag" value="">
		<button type="button" onclick="checkId()">중복확인</button>
		<br>
		<input type="password" id="password"  name="password" placeholder="패스워드" required="required"><br>
		<input type="password" id="confirmPassword" placeholder="패스워드확인" required="required"><br>
		<input type="text" name="name" placeholder="이름" required="required"><br>
		<input type="text" name="address" placeholder="주소" required="required"><br>
		<button type="submit">가입하기</button>
		</form>
		<script type="text/javascript">
		function checkRegForm() {
			// id password 의 value와 id confirmPassword 요소의 value가 일치하지 않으면 alert 후 return false를 해준다 
			if(document.getElementById("password").value!=document.getElementById("confirmPassword").value){
				alert("패스워드와 확인란이 일치하지 않습니다");
				return false;
			}
			// hidden checkFlag value와  input text id value를 비교해 같지 않으면 중복확인 되지 않은 것으로 판단 
			if(document.getElementById("checkFlag").value!=document.getElementById("id").value){
				alert("인증받은 아이디가 아닙니다 \n아이디 중복확인하세요");
				return false;
			}
		}
			
			function checkId() {
				let mId=document.getElementById("id").value;
				if(mId==""){
					alert("아이디를 입력하세요");
				}else{
					window.open("CheckIdServlet?id="+mId,"mypopup","width=250,height=150,top=150,left=400");
				}
			}
			
			
		</script>
		<%--
				step1. 패스워드와 패스워드확인의 일치여부를 체크해서 일치하지 않으면 
						alert으로 패스워드와 확인란이 일치하지 않습니다 메세지 보여주고
						서버로 전송시키지 않는다 
						일치하면 서버로 전송해 회원 가입을 시킨다 
						
				step2. 아이디 중복확인을 구현한다 ( javascript 수업 진행 후 구현 예정 ) 		
		 --%>
	</div>
</body>
</html>













