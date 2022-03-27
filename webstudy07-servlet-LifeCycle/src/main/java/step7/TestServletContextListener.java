package step7;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class TestServletContextListener
 *
 */
public class TestServletContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestServletContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * 웹어플리케이션 종료 시점에 한번 호출 : 백업작업 
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("ServletContextListener contextDestroyed");
    }

	/**
     * 웹어플리케이션 시작 시점에 한번 호출 : 초기화작업 ( 보안적용 ) 
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         System.out.println("ServletContextListener contextInitialized");
    }
	
}




