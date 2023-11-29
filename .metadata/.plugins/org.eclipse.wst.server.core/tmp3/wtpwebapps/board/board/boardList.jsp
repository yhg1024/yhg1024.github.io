<%@page import="java.util.List"%>
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
	<h2>목록 조회</h2>
	<% 
		List<BoardDto> list = (List<BoardDto>)request.getAttribute("list");
	%>
	<table border="1" text-align="center">
		<tr>
			<td>일련번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성자 아이디</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<% 
			if(list != null && list.size() > 0) {
				for(BoardDto dto : list){
		%>
					<tr>
						<td><%= dto.getNum() %></td>
						<td><%= dto.getTitle() %></td>
						<td><%= dto.getContent() %></td>
						<td><%= dto.getId() %></td>
						<td><%= dto.getPostdate() %></td>
						<td><%= dto.getVisitcount() %></td>
					</tr>
		<% 
					
				}
			} else {
				
			}
			
		
		%>
	</table>
</body>
</html>