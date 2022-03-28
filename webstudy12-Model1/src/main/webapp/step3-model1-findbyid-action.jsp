<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색결과</title>
</head>
<body>
<%--
			현 jsp 에서  MemberDAO의 findMemberById(String id) 메서드를 호출해서 
			MemberVO 객체가 반환되면 회원이 존재하는 것으로 판단해서 응답하고 
			null 이 반환되면 회원이 존재하지 않는 것으로 판단해 응답하면 된다 
 --%>

<a href="index.jsp">홈으로</a> <br><br>
<%
        //client가 전송한 아이디를 반환받는다 
        String id=request.getParameter("memberId");
		MemberDAO dao=new MemberDAO();		
		MemberVO vo=dao.findMemberById(id);
		if(vo!=null){
%>

 	<%=id %> 아이디에 대한 회원 검색 결과 <br>
 	이름 : <%=vo.getName() %>   주소 :  <%=vo.getAddress() %>
 
 <%
		}else{
		// javascript alert으로 보여준 후 index.jsp로 이동시킨다 	
 %>
 	<script type="text/javascript">
 		alert("<%=id %> 아이디에 대한 회원 정보가 존재하지 않습니다");
 		location.href="index.jsp";
 	</script> 
     
 <%
		}
 %>   
</body>
</html>



















