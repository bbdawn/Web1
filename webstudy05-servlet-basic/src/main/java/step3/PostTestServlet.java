package step3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostTestServlet
 */
@WebServlet("/PostTestServlet")
public class PostTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//post 요청 방식은 전송 데이터가 http request body에 저장되므로 별도의 한글 처리를 해야한다
		request.setCharacterEncoding("utf-8");
		
		
		// client에게 응답하기 위한 문서 타입을 지정(한글 처리 포함)
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=orange>");
		out.println(getServletName()); //step3.PostTestServlet : 서블릿 이름을 반환한다
		
		
		//client가 보낸 nickname 정보를 받아온다
		//<input type="text" name="nickname" placeholder="별명" required="required"> 여기서 name부분을 getParameter("") 이 안에 넣어주기
		String nickname=request.getParameter("nickname");
		String address=request.getParameter("address");
		out.println("<br><br> 별명 : "+nickname+" 사는곳: "+address);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}




























