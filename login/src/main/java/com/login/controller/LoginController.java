package com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.MemberDao;
import com.login.dto.MemberDto;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/loginAction")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       /**
        * 로그인 처리
        *  - 요청데이터 확인
        * 		id, pw가 일치하는 사용자가 있는지 확인 후
        * 		사용자가 있으면 - 로그인 성공
        * 			-> 사용자정보를 세션에 저장후 board.jsp 페이지로 이동
        * 		사용자가 없으면 - 로그인 실패
        * 			-> 'id, pw를 확인해주세요' 메세지를 띄우고 이전페이지로 이동
        *  - 요청 메서드에 따라 doGet, doPost 메서드가 실행됩니다.
        *  
        *  요청방식(method) - 요청방식을 지정하지 않으면 get방식으로 호출
        *  				 - 요청방식에 해당하는 메서드가 구현하지 않을경우 405 오류가 발생할수있다.
        */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청 데이터 수집(id, pw)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		
		// 2. 사용자 정보 조회(MemberDao.login(id, pw))
		//	MemberDto, MemberDao 생성		
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = memberDao.login(id,pw);
		
		// 자원반납
		memberDao.close();
		System.out.println("============= " + memberDto);
		
		// 3. 화면전환
		if(memberDto != null) {
			//로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("userId", memberDto.getId());
			session.setAttribute("memberDto", memberDto.getPass());
			// 세션영역에 로그인 정보를 저장 -> forward, redirect 어느것으로 페이지 전환해도 상관없음
			
			// 리스트 서블릿 요청
			response.sendRedirect("/list");
			// 서블릿을 요청시 주의사항
			// forward 방식으로 페이지를 전환시 405 오류가 발생할 수있다.
			// /loginAcrion -> post
			// list -> get
			// 요청 받을 당시 방식 (method)가 유지되므로 405 오류가 발생할 소지가 있다.
			
			//request.getRequestDispatcher("/list").forward(request, response);
		} else {
			// 로그인 실패
			// request.getRequestDispatcher("/login.jsp?isError=1").forward(request, response);
			request.setAttribute("msg", "아이디 비밀번호를 확인해주세요");
			request.getRequestDispatcher("msgBox.jsp").forward(request, response);
			
			// 서블릿 한글깨짐 처리
//			response.setContentType("text/html; charset=UTF-8");
//			response.getWriter().append("<script>");
//			response.getWriter().append("	alert('틀렸어 틀렸어 다시해');");
//			response.getWriter().append("	history.back();");
//			response.getWriter().append("</script>");
			
		}
		
	}

}
