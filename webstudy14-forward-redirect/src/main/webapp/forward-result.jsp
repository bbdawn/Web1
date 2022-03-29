<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward-result.jsp</title>
</head>
<body bgcolor="lime">
forward result page입니다
<%-- forward방식은 기존 request와 response를 유지하므로 컨트롤러에서 지정한 request정보를 이용할 수 있다.  --%>
컨트롤러가 request에 저장한 정보<%=request.getAttribute("productInfo") %>
</body>
</html>