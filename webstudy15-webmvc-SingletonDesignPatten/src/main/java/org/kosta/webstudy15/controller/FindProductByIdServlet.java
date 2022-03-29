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
 * Servlet implementation class FindProductByIdServlet
 */
@WebServlet("/FindProductByIdServlet")
public class FindProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//client가 보낸 상품아이디를 받는다 
		String id=request.getParameter("productId");
		// Model과 연동 		
		try {
			ProductVO vo=ProductDAO.getInstance().findProductById(id);
			if(vo==null) {
				request.getRequestDispatcher("findbyid-fail.jsp").forward(request, response);
			}else {
				request.setAttribute("product", vo);
				request.getRequestDispatcher("findbyid-success.jsp").forward(request, response);
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}


















