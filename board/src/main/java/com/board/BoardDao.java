package com.board;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.dto.BoardDto;

public class BoardDao  extends DBConnPool{
	
	/**
	 * DB로부터 게시글 1건에 대한 상세 정보를 조회 후 반환
	 */
	public BoardDto getOne(String num) {
		BoardDto dto = new BoardDto();
		
		// ?를 이용한 인파라메터를 사용할 수 있다.
		String sql = "select * from board where num=?";
				
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,num);
			
			rs = pstmt.executeQuery();
					
			if(rs.next()) {
						
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setContent(rs.getString("id"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
						
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return dto;
	}
	
	
	/**
	 * DB로 부터 리스트를 조회후 반환
	 */
	public List<BoardDto> getList() {
		List<BoardDto> list = new ArrayList<>();
		
		// 쿼리 정의
		String sql = "select * from board";
		
		try {
			// prepareStrtement는 문장을 먼저 만든다.
			// 인파라메터를 설정 할수 있으므로 쿼리 실행전 sql문장을 셋팅한다.
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// dto에 담고 리스트에(여러행이므로) 담아서 반환합니다.
				BoardDto dto = new BoardDto();
				
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setContent(rs.getString("id"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("리스트조회 중 오류가 발생 하였습니다.");
			e.printStackTrace();
		}
		
		return list;
	}
}
