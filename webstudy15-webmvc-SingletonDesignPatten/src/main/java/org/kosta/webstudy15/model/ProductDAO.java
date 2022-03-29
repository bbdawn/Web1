package org.kosta.webstudy15.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
// Singleton Design Pattern 을 적용해서 외부에서 객체 생성하는 것을 막고 시스템 상에서 단 하나의 객체만 생성해서 운용하게 한다 
public class ProductDAO {
	// class loading 시에 단 한번 객체를 생성해서 주소값을 meta space에 저장 
	private static ProductDAO instance=new ProductDAO();
	//private 을 명시해서 외부(클래스,패키지)에서 객체 생성하는 것을 원천 차단한다 
	private ProductDAO() {
		System.out.println("ProductDAO 객체 생성");
	}
	//외부에서 현 DAO 객체를 이용할 수 있도록 public static method로 공유한다 
	public static ProductDAO getInstance() {
		return instance;
	}
	
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException {
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException{
		if(rs!=null)
			rs.close();
		closeAll(pstmt, con);
	}
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DbInfo.URL,DbInfo.USER,DbInfo.PASS);
	}
	public ProductVO findProductById(String id) throws SQLException{
		ProductVO vo=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=getConnection();
			String sql="SELECT id,name,maker,price FROM web_product WHERE id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				vo=new ProductVO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		}finally {
			closeAll(rs, pstmt, con);
		}
		return vo;
	}
	public ArrayList<ProductVO> getAllProductList() throws SQLException{
		ArrayList<ProductVO> list=new ArrayList<ProductVO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=getConnection();
			String sql="SELECT id,name,maker,price FROM web_product ORDER BY id DESC";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(new ProductVO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
		}finally {
			closeAll(rs, pstmt, con);
		}		
		return list;
	}
	
	public void register(ProductVO vo) throws SQLException{
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=getConnection();
			String sql="INSERT INTO web_product(id,name,maker,price) VALUES(web_product_seq.nextval,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMaker());
			pstmt.setInt(3, vo.getPrice());
			pstmt.executeUpdate();
		}finally {
			closeAll(pstmt, con);
		}
	}
}




























