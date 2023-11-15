<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		// id == momo, pw == 1234 로그인 성공
		if("momo".equals(id)
				/* id != null && id.equals("momo") 
				위에 적은게 바로 위와 다르게 NPE가 안되서 위를 쓴다.
				*/
			&& "1234".equals(pw)) {
			// 로그인 성공
			// 페이지 전환 -> 웹브라우저 -> 웹브라우저가 다시 요청
			// 기존 요청정보가 공유되지 않는다.
			// 아이디를 파라미터로 넘겨주지 않으면 id값이 공유되지 않는다.
			response.sendRedirect("responseWelcom.jsp?id="+ request.getParameter("id"));
		} else {
			// 로그인 실패
			// 기존 요청정보가 공유 된다.
			request.getRequestDispatcher("responseMain.jsp?isErr=1")
				.forward(request, response);	
			
		}
	%>
	<h2>페이지를 전환하는 방법</h2>
	<p>sendReirect</p>
	<p>forward</p>
	
id : <%= id %> <br>
pw : <%= pw %> <br>
</body>
</html>