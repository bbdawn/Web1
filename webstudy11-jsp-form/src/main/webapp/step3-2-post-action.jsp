<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step3-2-post-action.jsp</title>
</head>
<body>
<%
	//post방식은 request body 영역에 저장되어 전송되므로 별도의 한글처리가 필요하다
	request.setCharacterEncoding("UTF-8");
	String name=request.getParameter("userName");
	//정수형으로 변환
	int age=Integer.parseInt(request.getParameter("userAge"));
	String info=null;
	//if else 구문
	if(age>=19){
		info="성인";
	}else{
		info="미성년";
	}
%>
이름 : <%=name %><br>
나이 : <%=info %><%=age %>세
</body>
</html>