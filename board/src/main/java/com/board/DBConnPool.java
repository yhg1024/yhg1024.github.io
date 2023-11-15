package com.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * 톰켓으로부터 제공받는 기능이므로 서버를 실행후 할수있다.
 * -> main 메소드를 이용한 실행이 불가능하다.
 */
public class DBConnPool {
	// DB에 접근하기 위해 필요한 데이터 -> 리소스에 정의 (context.xml에 정의)
	// DB에 접근하기위해 필요한 객체
	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	/**
	 * 생성자를 이용하여 커넥션 객체를 얻어옵니다.
	 */
	public DBConnPool() {
		try {
			Context initContext;
			initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			con = ds.getConnection();
			
		} catch (NamingException e) {
			System.out.println("NamingException - jdbc/myoracle를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 자원 반납
	 */
	public void close() {
		try {
			if(rs != null) rs.close();			
			if(pstmt != null) rs.close();			
			if(stmt != null) rs.close();			
			if(con != null) rs.close();			
		} catch (Exception e) {
			System.out.println("자원 반납 실패");
			e.printStackTrace();
		}
	}
}
