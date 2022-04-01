package org.kosta.webstudy17.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdateFormServlet
 */
@WebServlet("/UpdateFormServlet")
public class UpdateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 여부를 확인
		HttpSession session=request.getSession(false); //getSession(false) : 기존 세션이 있으면 반환, 없으면 null반환
		String url=null;
		if(session==null||session.getAttribute("mvo")==null) {
			url="index.jsp";
		}else {//로그인 상태이면
			url="update-form.jsp";
		}
		response.sendRedirect(url);
	}

}
