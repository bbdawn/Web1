package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Model : DAO 연동은 생략 - 오후에 해봅시다 
		// db의 member table에  id : java , passsword : abcd , name : 아이유 , address : 오리 가 저장되어 있다고 가정 
		
		// client가 보낸 id와 password를 받아온다 
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String viewUrl=null;
		if(id.equals("java")&&password.equals("abcd")) {// 아이디와 패스워드가 일치하면 로그인 처리 
			HttpSession session=request.getSession();
			session.setAttribute("mvo", new MemberVO(id,password,"아이유","오리"));
			viewUrl="session-test5-mvc-login-ok.jsp";
		}else {
			viewUrl="session-test5-mvc-login-fail.jsp";
		}
		response.sendRedirect(viewUrl);
	}
}








