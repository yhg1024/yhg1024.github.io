package com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.common.DBConnPool;
import com.login.dao.HelloDao;

/**
 * 1. 사용자의 요청을 수집
 * 2. JSP 페이지로 전환
 * 
 * @WebServlet("/hello")
 * url 매핑 - url이 호출되면 서블릿이 실행
 * 만약 url이 중복될경우, 서버가 실행이 안될수있다.
 */
@WebServlet("/hello")
public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 객체 저장
		request.setAttribute("str", "만나서 반갑습니다.");
		
		DBConnPool pool = new DBConnPool();
		
		HelloDao helloDao = new HelloDao();
		// DB로부터 시간을 조회후 request영역에 저장
		request.setAttribute("time", helloDao.getTime());
		
		// 사용자의 요청을 처리후 화면으로 전환
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}