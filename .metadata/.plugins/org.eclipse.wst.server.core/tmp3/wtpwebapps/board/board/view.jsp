<%@page import="com.board.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>상세</h2>
	BoardDto : 한건의 게시글에 정보
	<p>
		jap를 단독으로 실행 할경우, request영역에 BoardDto를 저장하지 않으므로 게시글의 정보가 출력되지 않아요.
	</p>
	num : <%= request.getParameter("num") %>번 게시글에 대한 정보
	dto : <%= request.getAttribute("dto") %>
	<p>게시글 상세정보</p>
	<% 
		if(request.getAttribute("dto") != null) {
			BoardDto dto = (BoardDto)request.getAttribute("dto");
	%>
	
	번호 : <%= dto.getNum() %>
	제목 : <%= dto.getTitle() %>
	내용 : <%= dto.getContent() %>
	작성자 : <%= dto.getId() %>
	작성일 : <%= dto.getPostdate() %>
	조회수 : <%= dto.getVisitcount() %>
	
	<% } %>

	
</body>
</html>