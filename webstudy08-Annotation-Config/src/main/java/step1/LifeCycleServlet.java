package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * web module 3.1 버전이므로 아래처럼 어노테이션 기반 설정이 가능 
 * 
 * 2.5 버전 web.xml 에서 설정한 load on startup 을 어노테이션으로 설정 :
 * 웹어플리케이션이 시작될 때 해당 서블릿 객체 생성 -> init() 까지 실행되도록 -> 미리 서블릿을 초기화하여 클라이언트 요청시 신속한 서비스를 위해 설정 
 * 
 * @WebInitParam : ServletConfig의 init-param 을 설정 
 */
@WebServlet(urlPatterns="/LifeCycleServlet",loadOnStartup=1,initParams = {@WebInitParam(name="springconfig",value="springmvc.xml")})
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
    public LifeCycleServlet() {
        super();
        System.out.println(getClass().getName()+" 객체 생성");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("init()");
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println(getServletName()+" service()->doGet()");
		//ServletConfig에 저장된 init parameter를 받아온다
		String info=getServletConfig().getInitParameter("springconfig");
		out.println("<br>ServletConfig init paramter:"+info);
		//ServletContextListener의 contextInitialized 메서드에서 ServletContext에 할당한 정보를 받아온다 
		//ServletContext는 web application 내의 모든 웹프로그램(servlet, jsp) 이 사용할 수 있는 공유자원이므로 test.jsp에서도 확인해본다 
		String commonInfo=(String) getServletConfig().getServletContext().getAttribute("commonInfo");
		out.println("<br>ServletContext info:"+commonInfo);
		out.println("<br><a href=test.jsp>test jsp로 이동</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	@Override
		public void destroy() {
			System.out.println("destroy()");
		}
}




