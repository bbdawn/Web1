package org.kosta.webstudy17.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.webstudy17.model.MemberDAO;
import org.kosta.webstudy17.model.MemberVO;

/**
 * Servlet implementation class FindMemberListByAddressServlet
 */
@WebServlet("/FindMemberListByAddressServlet")
public class FindMemberListByAddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인한 사용자만 서비스 받을 수 있으므로 먼저 로그인 여부를 확인한다
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null) {
			System.out.println("**비로그인 상태임**");
			response.sendRedirect("index.jsp");
			return; //메서드 실행을 중단(더이상 실행이 안됨)
		}
		
	 String address=request.getParameter("address");
	 try {
	 	ArrayList<MemberVO> list=MemberDAO.getInstance().findMemberByAddress(address);
	 	request.setAttribute("list", list);
	 	request.getRequestDispatcher("findbyaddress-result.jsp").forward(request, response);
	 }catch (Exception e) {
		e.printStackTrace();
	}	
	}
}
