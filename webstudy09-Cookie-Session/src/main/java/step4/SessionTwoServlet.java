package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberVO;

/**
 * Servlet implementation class SessionTwoServlet
 */
@WebServlet("/SessionTwoServlet")
public class SessionTwoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=lime>");
		out.println(getServletName());
		// 기존 세션이 있으면 기존 세션을 반환 , 없으면 null 을 반환 
		HttpSession session=request.getSession(false);
		if(session!=null) {
			//세션에 저장된 MemberVO 객체를 반환받아 회원아이디와 이름을 화면에 출력한다 
			MemberVO vo=(MemberVO)session.getAttribute("mvo");//Object type으로 리턴되므로 Object down casting을 한다 
			if(vo!=null) {
				out.println("<br>세션에 저장된 회원아이디:"+vo.getId());
				out.println("<br>세션에 저장된 회원이름:"+vo.getName());
			}else {
				out.println("<br>세션에 회원객체가 존재하지 않습니다");
			}
		}else {
			out.println("<br>세션이 존재하지 않습니다");
		}
		out.println("<br><a href=SessionOneServlet>SessionOneServlet으로 이동</a>");
		out.println("<br><a href=SessionThreeServlet>SessionThreeServlet으로 이동</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}














