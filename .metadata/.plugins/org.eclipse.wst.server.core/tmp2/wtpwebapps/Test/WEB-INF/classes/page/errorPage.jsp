<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>���ܻ����� �߻� �Ͽ����ϴ�.</h1>

<p> 
	������ : <%=exception.getClass().getName() %>
	������ �޼���: <%=exception.getMessage() %>
</p>
</body>
</html>