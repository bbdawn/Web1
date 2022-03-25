<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<String> list=new ArrayList<String>();
	list.add("비빔밥");
	list.add("짜장면");
	list.add("햄버거");
%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step6-1-checkbox-form</title>
</head>
<body>
<%--
		step1. 체크박스 메뉴항목을 하나 이상 체크하지 않으면 alert() 으로 메뉴를 선택하세요 보여주고 전송시키지 않는다 ( javascript ) 
				javascript onsubmit event 
				document.getElementsByName(name) -> array 
				checked : true or false  
		
		step2. 메뉴를 하나 이상 선택했을 경우 서버로 전송 step6-2-checkbox-action.jsp에서 
				테이블 형식으로 NO , Menu 를 보여준다 
 --%>
 <script type="text/javascript">
 	function checkForm() {
		let menuList=document.getElementsByName("menu");
		let flag=false;
		for(let i=0;i<menuList.length;i++){
			if(menuList[i].checked){
				flag=true;
				break;
			}
		}
		if(flag==false){
			alert("메뉴를 선택하세요!");
			return flag; // false 를 리턴하면 전송되지 않는다 
		}
	}
 </script>
<form action="step6-2-checkbox-action.jsp" onsubmit="return checkForm()"><%-- checkForm() function에서 false를 리턴하면 전송되지 않는다  --%>
<%
	for(int i=0;i<list.size();i++){
%>
	<input type="checkbox" name="menu" value="<%=list.get(i)%>"><%=list.get(i) %> <br>
<%
	}
%>	
<button type="submit">주문</button>
</form>
</body>
</html>









