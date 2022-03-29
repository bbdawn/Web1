<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyid-fail</title>
</head>
<body>
<script type="text/javascript">
// forward 방식으로 이동되었으므로 기존 request와 response 가 유지되므로 아래와 같이 아이디를 출력할 수 있다 
	alert("<%=request.getParameter("memberId")%>아이디에 대한 회원이 존재하지 않습니다");
	location.href="index.jsp";
</script>
</body>
</html>











