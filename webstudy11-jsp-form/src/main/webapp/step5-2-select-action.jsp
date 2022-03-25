<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-2-select-action.jsp</title>
</head>
<body>
<%--
			form 에서 전달한 line 정보가  1호선에서 4호선 이하일 경우 
			코레일 2호선 
			과 같이 응답하고 
			5호선 ~ 9호선 
			도시철도 8호선 
			와 같이 나오도록 구현한다 
 --%>
 <%
 		int line=Integer.parseInt(request.getParameter("line"));
 		String subway=null;
 		if(line>=1&&line<=4)
 			subway="코레일";
 		else
 			subway="도시철도";
 %>
 <%=subway %> <%=line %>호선 
</body>
</html>












