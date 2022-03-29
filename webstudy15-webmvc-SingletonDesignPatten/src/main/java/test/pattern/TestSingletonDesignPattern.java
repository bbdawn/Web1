package test.pattern;

public class TestSingletonDesignPattern {
	public static void main(String[] args) {
		// error , CompanyDAO 클래스의 생성자의 접근제어자가 
		// private 이므로 외부(클래스,패키지)에서 접근 불가 
		//CompanyDAO dao=new CompanyDAO();
		// static method로 접근해 객체의 주소값을 받아온다 
		// CompanyDAO 내부에서 만든 하나의 객체를 이용해 사용하게 된다 
		CompanyDAO dao1=CompanyDAO.getInstance();
		System.out.println(dao1);
		CompanyDAO dao2=CompanyDAO.getInstance();
		System.out.println(dao2);
		CompanyDAO dao3=CompanyDAO.getInstance();
		System.out.println(dao3);
		dao1.register("LG");
		dao2.register("SK");
		dao3.register("KIA");
	}
}
