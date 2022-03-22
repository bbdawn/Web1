package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetTestServlet
 */
@WebServlet("/GetTestServlet")
public class GetTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * HttpServletRequest : client의 "요청"정보를 저장하는 객체
	 * HttpServletResponse : client에게 "응답하기 위한" 정보를 저장하는 객체
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//client에게 응답하기 위한 문서 타입을 지정(한글 처리 포함)
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		
		//client가 보낸 데이터를 반환받는다 (중요부분!!)
		//html form : <input type="text" name="food" placeholder="점심메뉴" required="required">
		//=request.getParameter("food");
		
		String info=request.getParameter("food");
		String num=request.getParameter("count");
		
		out.println("GetTestServlet 점심메뉴: "+info+ " "+num+"인분 주문");
		
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}































