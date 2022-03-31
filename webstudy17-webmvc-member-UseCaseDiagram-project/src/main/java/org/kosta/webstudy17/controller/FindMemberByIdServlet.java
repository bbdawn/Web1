package org.kosta.webstudy17.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.webstudy17.model.MemberDAO;
import org.kosta.webstudy17.model.MemberVO;

/**
 * Servlet implementation class FindMemberByIdServlet
 */
@WebServlet("/FindMemberByIdServlet")
public class FindMemberByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("memberId");
		try {
			MemberVO vo=MemberDAO.getInstance().findMemberById(id);
			String viewName=null;
			if(vo==null) {
				viewName="findbyid-fail.jsp";
			}else {
				viewName="findbyid-ok.jsp";
				request.setAttribute("memberVO", vo);
			}
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}












