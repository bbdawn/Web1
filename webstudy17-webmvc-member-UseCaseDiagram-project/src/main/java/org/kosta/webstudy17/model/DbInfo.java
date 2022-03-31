package org.kosta.webstudy17.model;

public interface DbInfo {
	// interface는 public static final 상수로 자동 인식된다 
	String URL="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String USER="scott";
	String PASS="tiger";
}
