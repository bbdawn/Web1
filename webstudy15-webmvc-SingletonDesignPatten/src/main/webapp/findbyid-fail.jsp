<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyid-fail.jsp</title>
</head>
<body>
<script type="text/javascript">
	alert("<%=request.getParameter("productId")%>아이디 상품이 존재하지 않습니다");
	location.href="index.jsp";
</script>
</body>
</html>