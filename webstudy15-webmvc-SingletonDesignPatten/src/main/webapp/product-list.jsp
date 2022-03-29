<%@page import="org.kosta.webstudy15.model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>product list</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
<a href="index.jsp">Home</a><br><br>

<%
		//컨트롤러가 공유한 리스트를 반환 
		@SuppressWarnings("unchecked") 
		ArrayList<ProductVO> list=(ArrayList<ProductVO>)request.getAttribute("list");
%>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>MAKER</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody>
		<%
			for(int i=0;i<list.size();i++){
		%>
			<tr>
				<td><%=list.get(i).getId() %></td>
				<td><%=list.get(i).getName() %></td>
				<td><%=list.get(i).getMaker() %></td>
				<td><%=list.get(i).getPrice() %></td>
			</tr>
		<%
			}
		%>	
		</tbody>
	</table>
</body>
</html>






