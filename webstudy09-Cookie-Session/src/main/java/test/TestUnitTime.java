package test;

import java.util.Date;

/*
 * 쿠키에 저장할 시간 정보 테스트 
 */
public class TestUnitTime {
	public static void main(String[] args) {
		Date time=new Date();
		System.out.println(time.toString());
		String time2=time.toString().replace(" ", "-");
		System.out.println(time2);
	}
}
