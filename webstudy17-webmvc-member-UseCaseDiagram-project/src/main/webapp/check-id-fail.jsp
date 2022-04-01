<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>check-id-fail.jsp 사용불가</title>
</head>
<body bgcolor="orange">
<%
	String id=request.getParameter("id");
%>
<%=id %> 아이디 중복되어 사용불가 <br><br>
<button type="button" onclick="closePopup()">확인</button>
<script type="text/javascript">
	opener.document.getElementById("id").value="";
	opener.document.getElementById("id").focus();
	opener.document.getElementById("checkFlag").value="";
	function closePopup(){
		self.close();
	}
</script>
</body>
</html>