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
 * Servlet implementation class UpdateMemberServlet
 */
@WebServlet("/UpdateMemberServlet")
public class UpdateMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 체크
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null) {
			response.sendRedirect("index.jsp");
			return; //doPost 메서드 실행을 중단시키기
		}
		//post 방식일때는 별도의 한글처리가 필요
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		MemberVO vo=new MemberVO(id,password,name,address);
		try {
			MemberDAO.getInstance().updateMember(vo);// db 의 회원정보를 수정 
			if(session!=null) {
				//session에 저장된 회원정보를 업데이트한다
				//request.session.ServletContext : map과 같이 중복된 key(name)로 할당하면 value가 업데이트된다
				session.setAttribute("mvo", vo);//session에 저장된 회원정보를 업데이트한다 
			}
			response.sendRedirect("update-result.jsp");
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}











