package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * forward 이동방식 테스트 : 여러번 실행한다고 해서 재동작이 되지 않음!!! request,response 유지하기 때문에 공유할 수 있다
 */
@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(getServletName()+" doGet() 메서드 실행");
		//forward 방식은 기존 request와 response를 유지하면서 이동된다 (서버상에서 이동함)
		//forward 방식은 request에 정보를 저장해 view가 사용할 수 있게 할 수 있다
		request.setAttribute("productInfo", "진라면 오뚜기");
		//forward 방식으로 제어를 이동시킨다
		request.getRequestDispatcher("forward-result.jsp").forward(request,response);		
	}

}
