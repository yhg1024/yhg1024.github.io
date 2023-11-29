<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 값 확인</title>
</head>
<body>
<% 
	Cookie[] cookies = request.getCookies();
	if(cookies != null) {
		for(Cookie cookie : cookies) {
			
			String name = cookie.getName();
			String value = cookie.getValue();
			
			out.print("쿠키명 : " + name + " /쿠키값 : " + value + "<br>");
		}
	}
%>
</body>
</html>