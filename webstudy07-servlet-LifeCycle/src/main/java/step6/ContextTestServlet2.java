package step6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextTestServlet2
 */
public class ContextTestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=lime>");
		out.println(getServletName());
		// init(ServletConfig) 메서드가 웹컨테이너에 의해 실행될 때 ServletConfig를 전달받기 때문에 이 ServletConfig 객체에 저장된 
		// ServletContext 주소값을 반환 받을 수 있다 
		ServletContext context=this.getServletConfig().getServletContext();		
		// ServletContext 의 정보는 웹어플리케이션 내의 모든 서블릿 jsp 에서 활용할 수 있다 
		String adminEmail=context.getInitParameter("adminEmail");
		out.println("<br><br>ServletContext의 init param 정보:"+adminEmail);
		// ContextTestServlet1 이 ServletContext에 저장한 정보를 반환받는다 
		out.println("<br><br>ContextTestServlet1이 저장한 정보:"+context.getAttribute("nick"));
		out.println("<br><br><a href='ContextTestServlet1'>ContextTestServlet1로</a> ");
		out.println("<br><br><a href='test.jsp'>test.jsp로</a> ");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}






