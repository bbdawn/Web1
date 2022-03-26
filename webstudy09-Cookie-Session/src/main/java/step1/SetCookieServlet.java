package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieServlet
 */
@WebServlet("/SetCookieServlet")
public class SetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println(getServletName());
		//쿠키 생성 : cookie 는 공란을 허용하지 않으므로 replace()를 이용해 - 으로 변경해서 보낸다 
		Cookie cookie=new Cookie("info",new Date().toString().replace(" ", "-"));		
		//쿠키 유효시간을 설정 ( 만약 쿠키 유효시간을 설정하지 않으면 브라우저 실행시에만 쿠키가 유효 ) 
		cookie.setMaxAge(30);//30초동안 유효 
		response.addCookie(cookie);//응답시에 쿠키를 클라이언트 측으로 전송 
		out.println("<br>info cookie를 client측에 전달");
		out.println("<br><a href=GetCookieServlet>GetCookieServlet에서 확인</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}








