<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1. 서버의 환경정보 읽기</h2>
	
	<ul>
		<li>데이터 전송 방식 : <%= request.getMethod() %></li>
		<li>URL : <%= request.getRequestURL() %></li>
		<li>프로토콜 : <%= request.getProtocol() %></li>
		<li>서버명 : <%= request.getServerName() %></li>
		<li>포트번호 : <%= request.getServerPort() %></li>
		<li>클라이언트 IP : <%= request.getRemoteAddr() %></li>
		<li>쿼리스트링 : <%= request.getQueryString() %></li>
		<li>파라미터 : <%= request.getParameter("eng") %></li>
		<li>파라미터 : <%= request.getParameter("han") %></li>
	</ul>
	
</body>
</html>