package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionThreeServlet
 */
@WebServlet("/SessionThreeServlet")
public class SessionThreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=orange>");
		out.println(getServletName()+"<br><br>");
		// 세션을 가져온다 
		HttpSession session=request.getSession(false);//기존 세션이 있으면 반환, 없으면 null 반환 
		if(session!=null) {
			session.invalidate();//세션을 무효화시킨다 
			out.println("세션을 무효화시킴(session invalidate 처리)");
		}else {
			out.println("세션이 존재하지 않습니다");
		}
		out.println("<br><a href=SessionOneServlet>SessionOneServlet으로 이동</a>");
		out.println("<br><a href=SessionTwoServlet>SessionTwoServlet으로 이동</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}








