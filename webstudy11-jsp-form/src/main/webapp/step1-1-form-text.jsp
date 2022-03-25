<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step1-1-form-text</title>
</head>
<body>
<%-- html form과 jsp 연동 --%>
<form action="step1-2-form-action.jsp" method="get">
<input type="text" name="userId" placeholder="아이디" required="required"><br>
<input type="text" name="userName" placeholder="이름" required="required"><br>
<button type="submit">전송</button>
<button type="reset">리셋</button>
</form>
</body>
</html>