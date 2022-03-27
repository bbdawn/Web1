package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  ServletContext 를 테스트하는 예제 
 *  ServletContext 정보는 웹 어플리케이션 내의 모든 서블릿과 jsp가 접근해 사용할 수 있는 공유자원이다 
 *  ServletContext의 context param 을 ContextTestServlet1 , ContextTestServlet2 , test.jsp 에서 각각 접근해 사용해본다 
 *  또한 ContextTestServlet1 에서 ServletContext에 할당한 정보를 ContextTestServlet2, test.jsp 에서 사용해 봄으로써 
 *  ServletContext가 공유자원임을 확인한다 
 */
public class ContextTestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println(getServletName());
		// init(ServletConfig) 메서드가 웹컨테이너에 의해 실행될 때 ServletConfig를 전달받기 때문에 이 ServletConfig 객체에 저장된 
		// ServletContext 주소값을 반환 받을 수 있다 
		ServletContext context=this.getServletConfig().getServletContext();
		String adminEmail=context.getInitParameter("adminEmail");
		out.println("<br><br>ServletContext의 init param 정보:"+adminEmail);
		out.println("<br><br><a href='ContextTestServlet2'>ContextTestServlet2로</a> ");
		//ServletContext에 정보를 할당해본다. 이 할당한 정보는 다른 서블릿과 jsp가 사용할 수 있다 
		context.setAttribute("nick", "ServletContext에 저장된 정보: 아이유");		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}






