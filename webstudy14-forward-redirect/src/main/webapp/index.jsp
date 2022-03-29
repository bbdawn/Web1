<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward와 redirect 이동방식</title>
</head>
<body>
	<h4>Model2 MVC forward와 redirect 이동방식</h4>
	<%--
	forward 이동방식 테스트
		index.jsp -- ForwardServlet
							|
							| forward 방식으로 이동시켜본다
						forward-result.jsp
	
	
	redirect 이동방식 테스트
	
			index.jsp --- RedirectServlet
								|
								|  redirect 방식으로 이동시켜본다 
								| 
							 redirect-result.jsp	
			
	 --%>
	<ul>
		<li><a href="ForwardServlet">forward test</a></li>
		<li><a href="RedirectServlet">redirect test</a></li>
	</ul>
	<img src="images/forward-redirect-이동방식.png">
</body>
</html>









