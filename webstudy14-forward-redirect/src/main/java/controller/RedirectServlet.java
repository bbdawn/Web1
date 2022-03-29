package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Controller 에서 View로 제어를 redirect 방식으로 이동시켜 본다 
		System.out.println(getServletName()+" doGet() 메서드 실행");
		
		//reponse 즉 응답시 클라이언트 브라우저에게 이동할 url을 지정한다 , 즉 클라이언트 브라우저에게 이동시키는 방식 
		response.sendRedirect("redirect-result.jsp");
	}
}
