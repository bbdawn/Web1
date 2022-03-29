<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>webmvc</title>
</head>
<body>
<h4>Web MVC 상품관리</h4>
<%--
		index.jsp --- FindProductByIdServlet -- ProductDAO ------------- Database
													   findProductById(id) : ProductVO
							 |
							 | forward 
						findbyid-success.jsp
						검색 상품 정보를 제공 
						or
						findbyid-fail.jsp 	 	
						alert() 상품이 존재하지 않습니다! 
						location.href 를 이용해서 index.jsp로 보낸다 					    	
		
 --%>
<form action="FindProductByIdServlet" method="get">
	<input type="number" name="productId" placeholder="상품아이디" required="required" min="1">
	<button type="submit">검색</button>
</form>
<br><br>
<%--
		index ---  AllProductListServlet ----  ProductDAO ------------------------- Database 
													getAllProductList(): ArrayList<ProductVO>	
							|
							| forward 
							|
						product-list.jsp 		
						아이디 내림차순으로 보여준다 						

 --%>
<a href="AllProductListServlet">전체상품목록</a>
<br><br>
<%--
				index ---- RegisterProductServlet --- ProductDAO --------  DB 
							 doPost() 						register(ProductVO)
							 |
							 | redirect : 재동작 방지 
							 |
							 register-result.jsp 

 --%>
<form action="RegisterProductServlet" method="post">
<input type="text" name="name" required="required" placeholder="상품명"><br>
<input type="text" name="maker" required="required" placeholder="제조사"><br>
<input type="number" name="price" required="required" placeholder="가격" min="1"><br>
<button type="submit">등록</button>
</form>
</body>
</html>



















