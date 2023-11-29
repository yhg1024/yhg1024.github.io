package com.login.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.login.common.DBConnPool;
import com.login.dto.BoardDto;

/**
 * DB로부터 게시글을 조회, 입력, 수정, 삭제 처리합니다.
 */

public class BoardDao extends DBConnPool{
	
	/**
	 * 게시글을 삭제합니다.
	 * @param num : 삭제할 게시물 번호
	 * @return res : 삭제된 게시물의 수
	 */
	public int deleteBoard(String num) {
		int res = 0;
		String sql = "delete from board where num = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			
			// 쿼리실행
			res = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("BoardDao.deleteBoard ====== SQLException 발생");
			e.printStackTrace();
		}
		
		return res;
	}
	
	public int updateVisitCount(String num) {
		int res = 0;
		String sql = "update board set visitcount=visitcount+1 where num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 1거의 게시글을 조회후 BoardDto에 담아서 반환
	 * @param num
	 * @return
	 */
	
	public BoardDto getOne(String num) {
		BoardDto dto = new BoardDto();
		
		try {
			pstmt = con.prepareStatement("select * from board where num = ?");
			pstmt.setString(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setNum(rs.getString("num"));
				dto.setPostdate(rs.getString("postdate"));
				dto.setVisitcount(rs.getString("visitcount")); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
		
	}
	
	/**
	 * 리스트 조회 후 반환
	 * + 페이징 처리
	 * @param startNum
	 * @param endNum
	 * @return
	 */
	public List<BoardDto> getList(int startNum, int endNum) {
		List<BoardDto> list = new ArrayList<>();
		/*
		 * String sql =
		 * "select num, title, id, to_char(postdate, 'yyyy-mm-dd') postdate \r\n" +
		 * "from board\r\n" + "order by num desc";
		 */
		
		String sql = "select *\r\n"
					+ "from (\r\n"
					+ "    select rownum rnum, b.*\r\n"
					+ "    from(\r\n"
					+ "        select rownum, b.*\r\n"
					+ "            from board b\r\n"
					+ "        -- 최신순으로 정렬\r\n"
					+ "        order by num desc\r\n"
					+ "    		)b\r\n"
					+ "		)\r\n"
					+ "where rnum between ? and ?";
		
		// db로부터 게시글의 목록을 조회하여 list에 담아 반환합니다.
		try {
			pstmt = con.prepareStatement(sql);
			// 시작번호 = 끝번호 - (페이지당 게시물수 -1)
			pstmt.setInt(1, startNum);
			// 끝번호 =페이지번호 * 페이지당 게시물 수
			pstmt.setInt(2, endNum);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String num = rs.getString("num");
				String title = rs.getString("title");
				// String contnet = rs.getString("content");
				String id = rs.getString("id");
				String postdate = rs.getString("postdate");
				// String visitcount = rs.getString("visitcount");
				
				BoardDto dto = new BoardDto(num, title, id, postdate);
				
				list.add(dto);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	/**
	 * 게시글의 총 건수를 구합니다.
	 * @return
	 */
	public int getTotalCnt() {
		int total = 0;
		String sql = "select count(*) from board";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				total = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
}
