package com.bit2016.mysite.dao;

import java.sql.*;

import com.bit2016.mysite.vo.*;

public class BoardDao {
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 :" + e);
		}
		
		return conn;
	}
	
	public void insert(BoardVo vo) {				// write
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into board values()";
			pstmt = conn.prepareStatement(sql);
			
			
			
			
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(SQLException e) {
				System.out.println("error : " + e);
			}
		}
	}
	
	public void update(BoardVo vo) {				// modify
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();

			String sql = "update board set ";
			pstmt = conn.prepareStatement(sql);
			
			
			
			
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(SQLException e) {
				System.out.println("error : " + e);
			}
		}
	}
	
}
