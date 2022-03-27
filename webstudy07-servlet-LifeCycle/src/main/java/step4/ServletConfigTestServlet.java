package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletConfig 를 테스트하는 예제 
 * web.xml 에 설정한 ServletConfig 의 init param 정보를 받아오는 예제 
 */
public class ServletConfigTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println(this.getServletConfig().getServletName());
		String frameworkInfo=this.getServletConfig().getInitParameter("contextConfigLocation");
		out.println("ServletConfig로부터 프레임워크 설정파일 정보를 얻어옴:"+frameworkInfo);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}




