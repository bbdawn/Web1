package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 * 웹 버전 2.5 로 프로젝트를 생성했으므로 WEB-INF/web.xml 에 url-pattern이 설정되어 있다 
 */
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LifeCycleServlet() {
        super();
        System.out.println("LifeCycleServlet 객체 생성");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init()");
    }
	/**
	 * 웹 컨테이너가 service() 메서드를 호출하면 내부적으로 요청방식에 따라 doGet() or doPost() 호출되어 실행된다  
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()->doGet()");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println(getServletName());
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
}





