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
<h2>도서 정보</h2>
요청 도서 번호 : ${param.no } <br>
도서정보 : ${bookDto } <br>
도서번호 : ${bookDto.no } <br>
도서명 : ${bookDto.title } <br>
작가 : ${bookDto.author } <br>
대여여부 :${bookDto.rentYn } <br>
</body>
</html>