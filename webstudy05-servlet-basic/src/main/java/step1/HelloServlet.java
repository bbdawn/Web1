package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

//해당 서블릿에 요청하기 위한 URL을 기술하는 어노테이션
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet { // 모든 서블릿과 JSP는 HttpServlet을 상속받게된다.
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @doGet() : 클라이언트가 Get방식으로 요청할 때 실행되는 메서드
	 */
	/**
	 * Http Request Method(요청방식) 1. get 방식 : 주로 정보 조회용, url 상에 전송 정보가 노출됨 전송 데이터 용량에
	 * 제한 있음 (ex. 뉴스 검색할 때 url 계속 바뀜, url 상에서 데이터가 노출됨)
	 * 
	 * 2. post 방식 : 정보 전달용 (서버 자원의 데이터 변경시 사용), url 상에서 전송 정보가 노출되지 않는다 http request
	 * body 부분에 정보가 내장되어 전송 (별도의 한글처리가 필요하다), 전송 데이터 용량 제한은 별도로 없음(서버 상황에 따라 다름)
	 * (ex. 로그인할 때, 블로그 글쓰기를 할 때, 파일업로드할 때 -> url 상에서 데이터 노출안됨)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("doGet");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("HelloServlet doGet이 실행");
		out.close();
	}

	/**
	 * @doPost() : 클라이언트가 post방식으로 요청할 때 실행되는 메서드
	 */
	/**
	 * Http Request Method(요청방식) 1. get 방식 : 주로 정보 조회용, url 상에 전송 정보가 노출됨 전송 데이터 용량에
	 * 제한 있음 (ex. 뉴스 검색할 때 url 계속 바뀜, url 상에서 데이터가 노출됨)
	 * 
	 * 2. post 방식 : 정보 전달용 (서버 자원의 데이터 변경시 사용), url 상에서 전송 정보가 노출되지 않는다 http request
	 * body 부분에 정보가 내장되어 전송 (별도의 한글처리가 필요하다), 전송 데이터 용량 제한은 별도로 없음(서버 상황에 따라 다름)
	 * (ex. 로그인할 때, 블로그 글쓰기를 할 때, 파일업로드할 때 -> url 상에서 데이터 노출안됨)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("doPost");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("HelloServlet doPost가 실행");
		out.close();
	}

}
