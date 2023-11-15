package com.login.dao;

import java.sql.SQLException;

import com.login.common.DBConnPool;
import com.login.dto.MemberDto;

public class MemberDao extends DBConnPool{
	/**
	 * id, pw를 전달 받아 DB에 등록된 사용자가 있는지 조회후 MemberDto를 반환
	 * @param id
	 * @param pw
	 * @return
	 */
	
	public MemberDto login(String id, String pw) {
		MemberDto dto = null;
		
		try {
			pstmt = con.prepareStatement("select * from member where id = ? and pass = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				// String id = rs.getString("id");
				String name = rs.getString("name");
				String regidate = rs.getString("regidate");
				
				// 로그인 성공시 memberDto객체를 생성후 반환
				dto = new MemberDto(id, name, regidate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return dto;
	}
}