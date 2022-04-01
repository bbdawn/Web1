package org.kosta.webstudy17.model;

import java.io.Serializable;
/*
 * "서버 리로드"시에 세션에 저장된 회원객체를 WAS에서 직렬화하여 계속 유지하게끔 하기 위해
 * Serializable interface를 구현한다
 */
public class MemberVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String password;
	private String name;
	private String address;
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public MemberVO(String id, String password, String name, String address) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + "]";
	}
	
}
