package org.kosta.webstudy17.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.webstudy17.model.MemberDAO;
import org.kosta.webstudy17.model.MemberVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		try {
			MemberVO vo=MemberDAO.getInstance().login(id, password);
			if(vo==null) {
				response.sendRedirect("login-fail.jsp");
			}else {
				HttpSession session=request.getSession();
				//세션에 인증된 회원번호를 할당한다
				session.setAttribute("mvo", vo);
				response.sendRedirect("index.jsp");
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
