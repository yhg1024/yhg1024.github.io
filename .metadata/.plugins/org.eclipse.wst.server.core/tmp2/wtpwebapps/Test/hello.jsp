<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>


<!-- ����� -->
<%!
	String str = "Java Server Page";

	// ���������� ��ȯŸ�� �޼����(�Ű������� Ÿ�� �Ű������� ������)
	public int add(int num1, int num2){
		return num1 + num2;
	}
%>

<h1><%= str%></h1>
<h2><%= add(1,10) %></h2>


</html>