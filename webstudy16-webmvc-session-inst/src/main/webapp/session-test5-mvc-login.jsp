<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session-test5-mvc-login.jsp</title>
</head>
<body>
<form action="LoginServlet" method="post">
<input type="text" name="id" placeholder="아이디" required="required"><br>
<input type="password" name="password" placeholder="패스워드" required="required"><br>
<button type="submit">로그인</button>
</form>
</body>
</html>