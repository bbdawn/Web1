package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
	web application 설정 파일 web.xml 에 <load-on-startup>1</load-on-startup> 설정을 추가하여
    web application 시작 시점에 해당 서블릿 객체 생성 및 init 실행을 미리하도록 했다 
    만약 load on startup 설정을 하지 않는 다면 첫번째 클라이언트 요청시점에 서블릿 객체 생성 , init() 이 실행된다 
 */
public class LoadOnStartUpTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoadOnStartUpTestServlet() {
        super();
        System.out.println("LoadOnStartUpTestServlet 객체생성");
    }
    @Override
    public void init() throws ServletException {
    	System.out.println("LoadOnStartUpTestServlet init()을 통한 초기화작업");
    }    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println(getServletName());
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	public void destroy() {
		System.out.println("LoadOnStartUpTestServlet destroy()");
	}
}
