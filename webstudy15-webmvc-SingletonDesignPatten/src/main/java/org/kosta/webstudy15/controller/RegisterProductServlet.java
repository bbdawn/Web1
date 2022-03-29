package org.kosta.webstudy15.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy15.model.ProductDAO;
import org.kosta.webstudy15.model.ProductVO;

/**
 * Servlet implementation class RegisterProductServlet
 */
@WebServlet("/RegisterProductServlet")
public class RegisterProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post방식일때는 http request body에 전달되므로 별도의 한글처리가 필요 
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		String maker=request.getParameter("maker");
		int price=Integer.parseInt(request.getParameter("price"));
		ProductVO vo=new ProductVO(name,maker,price);		
		try {
			ProductDAO.getInstance().register(vo);
			response.sendRedirect("register-result.jsp");
			//아래의 forward 방식으로 이동하면 사용자가 재요청시 다시 상품이 등록되므로 적합하지 않다 
			//request.getRequestDispatcher("register-result.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}





