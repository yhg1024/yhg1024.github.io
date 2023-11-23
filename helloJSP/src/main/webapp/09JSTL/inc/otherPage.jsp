<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 외부페이지 연결하기 -->
	<h2>${param.title }</h2>
	<%-- <c:import url="https://goldenrabbit.co.kr/"></c:import> --%>
	<c:import url="https://www.naver.com/"></c:import>
</body>
</html>