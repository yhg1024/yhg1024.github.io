<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>예외사항이 발생 하였습니다.</h1>

<p> 
	오류명 : <%=exception.getClass().getName() %>
	오류명 메세지: <%=exception.getMessage() %>
</p>
</body>
</html>