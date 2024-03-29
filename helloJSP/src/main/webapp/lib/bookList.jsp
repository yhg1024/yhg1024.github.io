<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- header 외부파일 인클루드 -->
	<%@ include file="common/header.jsp" %>
	<!-- 도서목록을 출력합니다. -->
	도서목록을 출력합니다.
	
	<table>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>작가</td>
		</tr>
		<c:if test="${empty list }" var="result">
			<tr>
				<td colspan="3">조회된 데이터가 존재하지않습니다.</td>
			</tr>
		</c:if>
		<c:forEach items="${list }" var="dto">
			<tr>
				<td>${dto.no }</td>
				<td>${dto.title }</td>
				<td>${dto.author }</td>
				<td>${dto.rentYn }</td>
			</tr>
		</c:forEach>
	</table>
	<!-- footer 외부파일 인클루드 -->
	<%@ include file="common/footer.jsp" %>
</body>
</html>