package test.pattern;
/*
 *  Singleton Design Pattern : 시스템 상에서 단 하나의 객체만 생성해서 공유해 사용하기 위한 설계 패턴 
 */
public class CompanyDAO {
	// static 특징 : class loading시에 단 한번 실행되어 meta space 영역에 저장 ,
	// 이 특성을 이용해 클래스 내부에서 단 한번 객체 생성해서 객체 주소값을 meta space static 변수 영역에 저장 
	private static CompanyDAO instance=new CompanyDAO();
	// private 생성자를 명시해 외부 클래스에서 객체 생성하는 것을 원천 차단한다 
	private CompanyDAO() {
		System.out.println("CompanyDAO 객체 생성");
	}
	// static method는 외부에서 객체생성 없이 클래스명.메서드명으로 접근 가능 
	// 이 특성을 이용해 내부에서 한번 만든 객체의 주소값을 반환해서 외부에서 현 객체를 사용할 수 있게 한다 
	public static CompanyDAO getInstance() {
		return instance;
	}
	public void register(String companyInfo) {
		System.out.println("db insert "+companyInfo);
	}
}
