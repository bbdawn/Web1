<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
test jsp 에서 ServletContext 에 접근해 정보를 반환받는다 <br><br>
<%=application.getAttribute("commonInfo") %><br><br>
<a href="LifeCycleServlet">LifeCycleServlet</a>
</body>
</html>