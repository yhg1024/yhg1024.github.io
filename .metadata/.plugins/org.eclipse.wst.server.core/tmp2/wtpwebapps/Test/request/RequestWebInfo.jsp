<%@page import="com.momo.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

<ul>
	<li>������ ���� ��� : <%=request.getMethod() %></li>
	<li>URL : <%=request.getRequestURL() %></li>
	<li>�������� : <%=request.getProtocol() %></li>
	<li>������ : <%=request.getServerName() %></li>
	<li>��Ʈ��ȣ : <%=request.getServerPort() %></li>
	<li>Ŭ���̾�Ʈ IP : <%=request.getRemoteAddr() %></li>
	<!-- URL?�̸�=��&�̸�=��
		�±�(���)�� name�Ӽ� -->
	<li>������Ʈ�� : <%=request.getQueryString() %></li>
	<li>�Ķ���� : <%=request.getParameter("eng") %></li>
	<li>�Ķ���� : <%=request.getParameter("han") %></li>
	
	<%
	// �޼��带 �����ؼ� ��ü�� ����
		UserVO user = new UserVO();
		String age = request.getParameter("age");
		
		user.setAge(Integer.parseInt(age));
		user.setName(request.getParameter("name"));
	%>
</ul>

</body>
</html>