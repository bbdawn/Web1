<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select onchange event 연습</title>
</head>
<body>
<script type="text/javascript">
	function sendLine() {
		if(document.getElementById("line").value!=""){// value가 공란이 아닐 때 서버로 전송 
			document.getElementById("subwayForm").submit();//javascript로 form 을 전송 
		}
	}
</script>
<form action="step5-2-select-action.jsp" onchange="sendLine()" id="subwayForm"><%-- javascript로 form을 제어하기 위해 id를 부여 --%>
	<select id="line" name="line" required="required">
		<option value="">-호선-</option>
		<%
			for(int i=1;i<=9;i++){
		%>
		<option value="<%=i%>"><%=i%>호선</option>
		<%
			}
		%>
	</select>	
</form>


<%--
		step5-1-select-form 의 전송 버튼 없이 지하철 호선을 선택하면 즉시 서버로 전송되도록 
		javascript onchange event 이용해 구현해본다 
		step5-3-unitTest.html 에서 간단히 onchange 단위 테스트를 해본 후 적용해보자 
 --%>
 
</body>
</html>