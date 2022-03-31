<%@page import="java.util.ArrayList"%>
<%@page import="org.kosta.webstudy17.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findbyaddress-result.jsp</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
	<div class="container">
		<h4>
			<a href="index.jsp">WebMVC 회원관리</a>
		</h4>
		<%-- 회원명은 session에서, 주소명은 request에서 --%>
		<%
			MemberVO mvo=(MemberVO)session.getAttribute("mvo");
		%>
		<%=mvo.getName() %>님 <%=request.getParameter("address") %>에 사는 회원리스트입니다 <br><br>
		<table>
			<thead>
				<tr>
					<th>ID</th><th>NAME</th>
				</tr>
			</thead>
			<tbody>
		<%
			@SuppressWarnings("unchecked")
			ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("list");
			for(MemberVO vo:list){
		%>
				<tr>
					<td><%=vo.getId() %></td>
					<td><%=vo.getName() %></td>
				</tr>
		<%
			}
		%>		
			</tbody>
		</table>

	</div>
</body>
</html>