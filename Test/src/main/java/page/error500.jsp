<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>page ���þ�</title>
</head>
<body>
<%
	int age = 0;

	//try {
		// ���� ����
		age = Integer.parseInt(request.getParameter("age"));
		out.print("���� : " + age);
	//}
	//catch (Exception e) {
		out.print("������ ���ܰ� �߻� �Ͽ����ϴ�.");
	//}

%>
<hr>
<%= "���� :" + age %>
</body>
</html>