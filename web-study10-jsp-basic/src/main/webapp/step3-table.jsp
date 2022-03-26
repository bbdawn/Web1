<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	 ArrayList<String> list=new ArrayList<String>();
	 list.add("맥주");
	 list.add("치킨");
	 list.add("족발");
	 list.add("소주");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp로 table 만들기</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
<table>
	<thead>
		<tr>
			<th>순번</th><th>메뉴</th>
		</tr>
	</thead>
	<tbody>
	<%
		for(int i=0;i<list.size();i++){
	%>
		<tr>
			<td><%=i+1 %></td><td><%=list.get(i) %></td>
		</tr>
	<%
		}
	%>	
	</tbody>
</table>
</body>
</html>







