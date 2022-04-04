package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestPopupServlet
 */
@WebServlet("/TestPopupServlet")
public class TestPopupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DAO 를 이용해 id 중복확인여부를 판단한다고 가정 
		String id=request.getParameter("id");
		System.out.println("model과 연동해 "+id+" id 중복여부를 판단");
		request.getRequestDispatcher("step4-popup.jsp").forward(request, response);
	}
}
