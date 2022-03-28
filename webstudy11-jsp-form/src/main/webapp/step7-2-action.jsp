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
<%=name%>님 즐거운 성인영화 관람되세요 
<%
		}else{
%>
<script type="text/javascript">
// javascript에 jsp를 적용할 때는 문자열로 생각하고 코딩하면 된다 
	alert("<%=name%>님 <%=age%>세 미성년이므로 관람불가합니다 ");
	//미성년 컨텐트를 제공하는 페이지로 이동시킨다 
	//child jsp 로 입력받은 name을 전달하고자 할 때는 query string 방식을 이용하면 된다 
	location.href="step7-3-child-view.jsp?name=<%=name%>";
</script>
<%
		}
%>
</body>
</html>





















