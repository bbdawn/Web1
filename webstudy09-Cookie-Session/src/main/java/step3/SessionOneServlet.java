package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberVO;

@WebServlet("/SessionOneServlet")
public class SessionOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println(getServletName());
		//기존 세션이 있으면 기존 세션을 반환, 없으면 새로 생성 
		HttpSession session=request.getSession();
		out.println("<br>session id:"+session.getId()+"<br><br>");
		//세션에 MemberVO 객체를 저장한다 
		session.setAttribute("mvo", new MemberVO("java","abcd","아이유","종로"));
		out.println("세션에 회원정보를 저장<br><br>");
		out.println("<a href=SessionTwoServlet>SessionTwoServlet으로 이동</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}















