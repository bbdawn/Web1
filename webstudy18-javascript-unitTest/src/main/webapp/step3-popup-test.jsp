<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>javascript popup test</title>
</head>
<body>
<form>
	<input type="text" name="id" id="id" required="required" placeholder="아이디">
	<button type="button" onclick="openPopup()">팝업 띄우기</button>
	<input type="hidden" id="testHidden" value="">
	<button type="button" onclick="showValue()">히든값확인</button>
</form>
<script type="text/javascript">
	function openPopup() {
		// Controller(Servlet)으로 요청해서 아이디 사용 가능여부를 판단한 후 popup을 띄워야 한다
		/*
			step3 --- TestPopupServlet <--> DAO  
							|
						step4-popup.jsp 	
		*/
		let mId=document.getElementById("id").value;
		if(mId==""){
			alert("아이디를 입력하세요");
		}else{	
			//query string 방식으로 사용자가 입력한 아이디를 서버로 전달한다 
			window.open("TestPopupServlet?id="+mId,"mypopup","width=250,height=150,top=150,left=400");
		}
	}
	function showValue() {
		alert(document.getElementById("testHidden").value);
	}
</script>
</body>
</html>


















