<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step2-hidden-test.jsp</title>
</head>
<body>
<%-- 
		자바스크립트로 특정 정보를 저장해 제어할 때 사용
		ex) 회원가입시 아이디 중복확인 여부를 hidden에 저장 , 
		    중복확인을 하지 않은 상태이면 공란 "" , 중복확인을 했으면 인증받은 아이디를 저장 
 --%>
 <form action="step2-hidden-test-action.jsp" onsubmit="return checkForm()">
 	 <input type="text" id="memberId" name="id" placeholder="아이디" required="required">
 	<input type="hidden" id="checkFlag" value=""><%-- 아이디 중복확인 여부를 저장, 중복확인을 하면 공란 대신 확인한 아이디를 저장 --%>
 	<button type="submit">가입</button>
 </form>
 <hr>
 <%-- hidden checkFlag value를 변경시켜본다  --%>
 <button type="button" onclick="changeFlag()">hidden값 변경</button> 
 <script type="text/javascript">
 	//checkFlag가 공란이면 전송하지 않게 한다 
 	function checkForm() {
 		//hidden checkFlag의 값(중복확인한 인증받은 아이디 정보) 와 id text 입력값을 비교해 다르면 중복확인 하지 않은 것으로 간주한다 
		if(document.getElementById("checkFlag").value!=document.getElementById("memberId").value){
			alert("아이디 중복확인하세요!");
			return false;
		}
	}
 	function changeFlag() {
 		//사용자가 입력한 아이디 정보를 hidden checkFlag value로 할당한다 
 		let mId=document.getElementById("memberId").value;
 		if(mId==""){
 			alert("아이디를 입력하세요");
 		}else{
			document.getElementById("checkFlag").value=mId;
			alert("hidden checkFlag값 변경");
 		}
	}
 </script>
</body>
</html>
















