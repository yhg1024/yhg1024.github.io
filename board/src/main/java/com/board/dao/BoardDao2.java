package com.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.board.DBConnPool;
import com.board.dto.BoardDto;

/**
 * DB에 접근해서 데이터에 대한 입력, 수정, 삭제, 조회
 * void = 반환값 없음
 */
public class BoardDao2 extends DBConnPool{
		
	public List<BoardDto> getList() {
		List<BoardDto> list = new ArrayList<>();
		
		String sql = "select b.*, m.name from board b, member m where b.id = m.id";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDto dto = new BoardDto();
				
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
				// join을 이용해서 다른 테이블의 데이터를 함께 조회해올경우,
				// dto에 담기 위해 칼럼을 추가할 수 있다.
				
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
