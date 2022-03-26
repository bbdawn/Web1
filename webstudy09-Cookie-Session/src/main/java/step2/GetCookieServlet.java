package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieServlet
 */
@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=lime>");
		out.println(getServletName());
		// request로부터 쿠키 배열을 반환받아 info name의 쿠키가 있으면 value를 보여준다 
		Cookie [] cookies=request.getCookies();
		if(cookies!=null) { // cookie가 하나도 존재하지 않으면 null을 반환하므로 null이 아닐때 for loop를 실행한다 
			// cookie의 getName(), getValue() 를 이용해 info 쿠키가 존재하면 value를 화면에 보여준다 
			boolean flag=false;
			for(int i=0;i<cookies.length;i++) {
				if(cookies[i].getName().equals("info")) {
					out.println("<br>client info cookie 정보:"+cookies[i].getValue());
					flag=true;
					break;
				}
			}			
			if(flag==false)
				out.println("<br>info 쿠키가 존재하지 않습니다");
		}else {
			out.println("<br>쿠키가 존재하지 않습니다");
		}		
		out.println("<br><a href=SetCookieServlet>SetCookieServlet</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}







