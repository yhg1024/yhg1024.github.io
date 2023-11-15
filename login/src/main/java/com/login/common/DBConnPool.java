package com.login.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnPool {

	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	public ResultSet rs;

	/**
	 * 생성자를 통해 Connection 객체를 생성합니다.
	 */

	public DBConnPool() {
		Context initContext;
		try {
			initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");

			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			con = ds.getConnection();

			/*
			 * stmt = con.createStatement(); 
			 * // 쿼리를 먼저 셋팅 
			 * rs = stmt.executeQuery("select sysdate from dual");
			 * 
			 * if (rs.next()) { System.out.println(rs.getString(1)); }
			 */

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 자원 반납
	 */
	public void close() {

		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			System.out.println(this.getClass().getName());
			System.out.println("DBConnPool - 자원 반납중 오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
