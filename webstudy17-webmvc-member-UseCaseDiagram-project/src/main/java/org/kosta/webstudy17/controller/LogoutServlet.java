package org.kosta.webstudy17.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//getSession() : 기존 세션이 있으면 기존 세션 반환하고, 없으면 새로 생성
		//getSession(false) : 기존 세션이 있으면 기존 세션 반환하고, 없으면 null을 반환
		//로그아웃시에는 기존 세션이 없으면 새로 생성할 이유가 없으므로 getSession(false)를 이용한다 
		HttpSession session=request.getSession(false);
		if(session!=null) {
			session.invalidate();
		}
		response.sendRedirect("index.jsp");
	}

}
