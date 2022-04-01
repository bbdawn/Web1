<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>check-id-ok.jsp 사용가능</title>
</head>
<body bgcolor="yellow">
<%
	String id=request.getParameter("id");
%>
<%=id %>아이디 사용가능
<br><br>
<button type="button" onclick="closePopup()">확인</button>
<script type="text/javascript">
	//본 창의 hidden checkFlag에 인증 아이디를 value로 저장한다
	opener.document.getElementById("checkFlag").value="<%=id%>";
	function closePopup(){
		self.close();
	}
</script>
</body>
</html>