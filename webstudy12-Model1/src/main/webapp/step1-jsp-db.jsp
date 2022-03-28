<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   import="java.sql.*"%>
<%
	String driver="oracle.jdbc.OracleDriver";
	Class.forName(driver);
	//System.out.println("db driver loading");
	String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	Connection con=DriverManager.getConnection(url,"scott","tiger");
	//System.out.println("db connect");
	String sql="SELECT COUNT(*) FROM MEMBER";
	PreparedStatement pstmt=con.prepareStatement(sql);
	ResultSet rs=pstmt.executeQuery();
	int count=0;
	if(rs.next()){
		count=rs.getInt(1);
	}
	rs.close();
	pstmt.close();
	con.close();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp와 db 연동</title>
</head>
<body>
JSP와 데이터베이스 연동테스트 <br><br>
전체 회원수 <%=count %> 명 
</body>
</html>




