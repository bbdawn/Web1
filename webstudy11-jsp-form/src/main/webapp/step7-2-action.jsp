<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step7-2-action</title>
</head>
<body>
<%
		String name=request.getParameter("userName");
		int age=Integer.parseInt(request.getParameter("userAge"));
		if(age>=19){
%>
<%=name%>님 주류 구매 가능하십니다
<%
		}else{
%>
<script type="text/javascript">
	alert("<%=name%>님 미성년이므로 주류 구매 불가능하십니다 ");
	location.href="step7-1-location-test.jsp";
</script>
<%
		}
%>
</body>
</html>










