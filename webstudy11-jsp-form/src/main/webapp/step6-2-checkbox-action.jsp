<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step6-2-checkbox-action</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
	<%-- 
			동일한 name으로 여러개의 데이터가 전송되므로  request.getParameterValues(name) : String [] 을 이용한다 
 --%>
	<%
	String menu[] = request.getParameterValues("menu");
	%>
	<table>
		<thead>
			<tr>
				<th>NO</th>
				<th>Menu</th>
			</tr>
		</thead>
		<tbody>
			<%
				for(int i=0;i<menu.length;i++){
			%>
			<tr>
				<td><%=i+1%></td>
				<td><%=menu[i] %></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>






