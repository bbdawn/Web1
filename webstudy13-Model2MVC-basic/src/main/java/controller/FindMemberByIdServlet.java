package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;

/**
 * Servlet implementation class FindMemberByIdServlet
 */
@WebServlet("/FindMemberByIdServlet")
public class FindMemberByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 	client 로부터 검색할 회원의 아이디를 받아온다 
		 	Model : MemberDAO 의 findMemberById(id) 메서드를 호출한다 
		 	리턴한 결과가 null이면 회원이 존재하지 않는 것으로 판단해서 findbyid-fail.jsp로 응답하도록 제어를 이동한다 
		 	리턴한 결과가 null이 아니면 회원이 존재하므로 request에 회원정보를 저장한 후 
		 	findbyid-success.jsp가 응답하도록 이동시킨다 
		 */
		String id=request.getParameter("memberId");
		MemberDAO dao=new MemberDAO();
		try {
			MemberVO vo=dao.findMemberById(id);
			if(vo==null) {//vo가 null이면 회원정보가 없음 -> fail 로 응답 
				request.getRequestDispatcher("findbyid-fail.jsp").forward(request, response);
			}else { // vo가 null이 아니면 존재하므로 request에 회원객체 공유 후 success 로 응답 
				request.setAttribute("memberVO", vo);
				request.getRequestDispatcher("findbyid-success.jsp").forward(request, response);
			}			
		} catch (SQLException e) {		
			e.printStackTrace();
		}
	}
}




















