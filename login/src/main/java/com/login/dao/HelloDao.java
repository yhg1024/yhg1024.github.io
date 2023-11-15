package com.login.dao;

import java.sql.SQLException;

import com.login.common.DBConnPool;

public class HelloDao extends DBConnPool{
	/**
	 * DB로 부터 현재 시간을 조회후 반환합니다.
	 * @return
	 */
	public String getTime() {
		String time = "";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select sysdate from dual");
			
			if (rs.next()) { 
				time = rs.getString(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return time;
	}
}
