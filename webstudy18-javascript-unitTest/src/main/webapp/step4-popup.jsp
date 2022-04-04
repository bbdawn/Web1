<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step4-popup.jsp</title>
</head>
<%
	 String id=request.getParameter("id");
%>
<body bgcolor="yellow">
	팝업창입니다<br><br>
	아이디 <%=id %><br><br>
	<button type="button" onclick="closePopup()">확인</button>
<script type="text/javascript">
// opener 객체 : popup을 띄운 본 창을 가르키는 객체 
/*
 // 본 창의 아이디 텍스트박스 요소에 접근해 값을 변경하고 포커스를 준다 
	opener.document.getElementById("id").value="";
	opener.document.getElementById("id").focus();
*/	
    //본창의 hidden 요소 값을 변경 	
	opener.document.getElementById("testHidden").value="<%=id%>";
	function closePopup() {
		self.close();//자신(팝업)의 창을 닫는다 
	}
</script>	
</body>
</html>













