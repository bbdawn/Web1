package org.kosta.webstudy15.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy15.model.ProductDAO;
import org.kosta.webstudy15.model.ProductVO;

/**
 * Servlet implementation class AllProductListServlet
 */
@WebServlet("/AllProductListServlet")
public class AllProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		try {
			ArrayList<ProductVO> list=ProductDAO.getInstance().getAllProductList();
			request.setAttribute("list", list);// view(jsp)에서 출력할 수 있도록 list를 request에 저장 
			request.getRequestDispatcher("product-list.jsp").forward(request, response);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}









