package com.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ojdbc를 이용하여 DB접근하고 커넥션을 얻어옵니다.
 */
public class DBConnection {
	
	public static void main(String[] args) {
		// 데이터베이스 접속정보
		// jdbc:oracle: thin:@아이피:포트:SID
		String url = "jdbc:oracl:thin:@localhost:1521:ORCL";
		String id = "TEST";
		String pw = "1234";
		
		try {
			// 이 클래스가 로딩이 가능한지 확인
			// 1. 드라이버 로딩 - ojdbc6
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. Connection 생성
			// 데이터베이스에 접근후 인증과정을 거쳐 커넥션을 얻어옵니다.
			Connection con = DriverManager.getConnection(url, id, pw);
			
			// 쿼리를 질의하기 위해 필요한 객체를 생성
			Statement stmt = con.createStatement();
			
			// 쿼리 실행
			// select - ResultSet
			// insert, delete, update - int
			ResultSet rs = stmt.executeQuery("select sysdate from dual");
			rs.next();
			System.out.println("현재시간 : " + rs.getString(1));
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 로딩할 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection 생성 실패");
			e.printStackTrace();
		}
	}
}
