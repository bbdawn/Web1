<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hidden tag test</title>
</head>
<body>
	<%--
		hidden tag : 사용자 화면에 보이지 않는 폼 요소 
		서버로 특정 정보를 전송할 때 사용 
		ex1)한 페이지에 폼이 여러개 존재할 경우 어떤 서비스를 요청하는 지에 대한 정보를 전송할 때 사용할 수 있음
		ex2)게시글 삭제시에 hidden을 이용해 게시글번호(PK)를 함께 전송할 수 있음 
		
		자바스크립트로 특정 정보를 저장해 제어할 때 사용 -> step2-hidden-test.jsp  연습해본다 
		ex) 회원가입시 아이디 중복확인 여부를 hidden에 저장 , 
		    중복확인을 하지 않은 상태이면 공란 "" , 중복확인을 했으면 인증받은 아이디를 저장 
 --%>
	<form action="step1-hidden-test-action.jsp">
		<input type="text" name="userId" placeholder="아이디" required="required">
		<input type="hidden" name="command" value="Register">
		<button>전송테스트1</button>
	</form>
	<hr>
	<form action="step1-hidden-test-action.jsp">
		<input type="text" name="userId" placeholder="아이디" required="required">
		<input type="hidden" name="command" value="Delete">
		<button>전송테스트2</button>
	</form>
	<hr>
	<table border="1">
		<%
			for(int i=10;i>0;i--){		
		%>
		<tr>
		<td><%=i%></td>
			<td>불금</td>
			<td>
				<form action="step1-hidden-test-action2.jsp">
					<input type="hidden" name="no" value="<%=i%>">
					<button type="submit">삭제</button>
				</form>
			</td>
		</tr>		
		<%} %>
	
	</table>
</body>
</html>













