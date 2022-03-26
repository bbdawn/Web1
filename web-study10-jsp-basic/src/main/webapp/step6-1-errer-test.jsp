<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="step6-error.jsp" %>
 
<%--
	지시자 태그 영역에 errorPage="step6-error.jsp"을 설정해서 현 페이지에서 에러가 발생하면
	지정한 경로의 페이지가 클라이언트에게 제공되도록 한다
 --%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step6-error-test</title>
</head>
<body>
<%
	String name="아이유";

	//테스트를 위해 고의로 예외를 발생시키기 위해 null을 할당한다
	name=null;
%>



이름은 <%=name.length() %>자로 구성되어있습니다
</body>
</html>