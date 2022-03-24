package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBoxServlet
 */
@WebServlet("/CheckBoxServlet")
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 방식은 http request body 에 저장되어 전달되므로 별도의 한글 처리가 필요 
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println(getServletName());
		// menu=치킨&menu=맥주 : 동일한 name으로 여러개의 데이터가 전달되므로 request.getParameter(name) : String 은 적합하지 않다 
		// request.getParameterValues(name) : String []  <-- 이 메서드가 적합하다 
		String [] m=request.getParameterValues("menu");
		out.println("<br><br>주문 메뉴:");
		for(int i=0;i<m.length;i++) {
			out.println(m[i]+" ");
		}
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}













