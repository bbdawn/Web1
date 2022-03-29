package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;

/**
 * Web MVC 의 Controller 역할을 하는 서블릿 
 */
@WebServlet("/AllMemberCountServlet")
public class AllMemberCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(getServletName()+" doGet 실행");
		// Model 과 연동 
		MemberDAO dao=new MemberDAO();
		try {
			// 전체 회원수를 반환받는다 
			int count=dao.getAllMemberCount();
			// Model과 연동한 정보를 View가 사용하게 하도록 request 객체에 저장한다 
			request.setAttribute("totalCount", count);
			// client에게 응답하는 역할을 하는 view (jsp ) 로 제어를 이동시킨다 
			// forward 이동방식은 기존의 request와 response를 유지시킨 채 서버상에서 제어를 이동한다 
			request.getRequestDispatcher("member-count.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










