package com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.BoardDao;
import com.login.dto.Criteria;
import com.login.dto.PageDto;

/**
 * Servlet implementation class BoardList
 */
@WebServlet("/list")
public class BoardListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 게시글 목록을 조회
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDao dao = new BoardDao();
		int pageNo = 1;
		int amount = 10;
		
		// 페이지 번호와 페이지당 게시물수를 설정 후
		// 조회할 게시물의 시작번호와 끝번호를 알아냅니다.
		Criteria cri = new Criteria(request.getParameter("pageNo"), request.getParameter("amount"));
		int total = dao.getTotalCnt();
		
		// 페이지블럭을 생성하기 위해 PageDto를 생성합니다.
		PageDto pageDto = new PageDto(total, cri);
		request.setAttribute("pageDto", pageDto);
		
		
		request.setAttribute("list", dao.getList(cri.getStartNo(), cri.getEndNo()));
		request.getRequestDispatcher("/board/board.jsp").forward(request, response);
		
		
		/*
		 * // 전달된 값이 있으면 변경, 없으면 기본값 if(request.getParameter("pageNo") != null &&
		 * !"".equals(request.getParameter("pageNo"))) { pageNo =
		 * Integer.parseInt(request.getParameter("pageNo")); }
		 * if(request.getParameter("amount") != null &&
		 * !"".equals(request.getParameter("amount"))) { amount =
		 * Integer.parseInt(request.getParameter("amount")); }
		 */

	}


}
