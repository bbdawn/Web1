<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select option test</title>
</head>
<body>
<form action="step5-2-select-action.jsp"><%-- request method 기본 get 방식 --%>
	<select name="line" required="required">
		<option value="">-호선-</option>
		<%
			for(int i=1;i<=9;i++){
		%>
		<option value="<%=i%>"><%=i%>호선</option>
		<%
			}
		%>
	</select>
	<button type="submit">전송</button>
</form>
<%--
			for loop 를 이용해 1호선 ~ 9호선까지 옵션을 생성한다 
			화면상에서는 1호선으로 제공되고 서버로 전송되는 데이터는 1 이 될 수 있도록 jsp를 구현 해본다 
 --%>
</body>
</html>






