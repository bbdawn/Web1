package step2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * web 2.5 버전이므로 web.xml 에 url pattern 이 정의 
 */
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 클라이언트 접속수를 저장하는 변수 
    private int count;
    // 접속수를 저장할 파일 경로 :  destroy() 실행될 때 아래 파일에 접속수를 저장 , init() 실행될 때 파일에 있는 접속수를 count 변수에 할당 
    private String savePath="C:\\kosta238\\count.txt";
    /**
     * 객체 생성은 단 한번 된다 
     */
    public CountServlet() {
        super();
        System.out.println("CountServlet 객체 생성");
    }
    /**
     * init() : 단 한번 실행 
     */
    @Override
    public void init() throws ServletException {
    	System.out.println("init 실행 파일에 저장된 조회수를 인스턴스 변수에 할당");
    	File countFile=new File(savePath);
    	if(countFile.isFile()) {
    		try {
    		DataInputStream dis=new DataInputStream(new FileInputStream(countFile));
    		count=dis.readInt();
    		dis.close();
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    	}else {    	
    		count++;
    	}
    } 

	/**
	 * service() => doXXX() : 클라이언트 요청시마다 실행 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() -> doGet()");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor=yellow>");
		out.println("<h2>"+getServletName()+" count:"+count+"</h2>");
		count++;
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	/**
	 * destroy() : 서비스 해제전( was 종료전)에 한번 실행 
	 */
	@Override
	public void destroy() {
		System.out.println("destroy() 실행 - 조회수를 파일에 백업");
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(savePath));
			dos.writeInt(count);
			dos.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}












