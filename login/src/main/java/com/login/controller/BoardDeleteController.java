package com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.dao.BoardDao;

/**
 * Servlet implementation class BoardDeleteController
 */
@WebServlet("/delete")
public class BoardDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// form을 post로 만들어서 doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 파라메터 수집
		// 1건의 게시글을 삭제하기 위해 num을 수집합니다.
		String num = request.getParameter("num");
		
		// DB로부터 게시글을 삭제합니다.
		BoardDao dao = new BoardDao();
		int res = dao.deleteBoard(num);
		
		
		if(res == 1) {
			// 삭제 성공
			request.setAttribute("msg", "삭제되었습니다.");
			request.setAttribute("url", "/list");
		} else {
			// 삭제 실패
			request.setAttribute("msg", "삭제 처리중 예외사항이 발생하였습니다.\n관리자에게 문의해주세요.");
		}
		// 메세지출력 화면 이동
		request.getRequestDispatcher("/msgBox.jsp").forward(request, response);
	}

}
