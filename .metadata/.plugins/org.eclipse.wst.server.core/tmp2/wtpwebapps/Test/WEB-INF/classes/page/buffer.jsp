<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ page buffer="1kb" autoFlush="false" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- 
����
	���� ����� �� �������� ��� �������� �ʰ�,
	����� ������ ���ۿ� ������ �ξ��ٰ� �������� ���� Ŭ���̾�Ʈ�� ����
	
	�ӵ����̸� �غ��ϱ� ���� ��Ҵٰ� �ѹ��� ����
	�������
	
	(CPU�� �޸𸮿� ���� IO(�����) �ӵ��� �����Ƿ� �������� ���ۿ� ������ �ξ��ٰ� ����)
	
autoFlush
	true : ���۰� ����, �ڵ� ����
	false : ���۰� ����, ���� Exception �߻����� ���� ����	
 -->
 
 <%
 	for(int i = 0; i < 100; i++) {
 		out.println("abcde12345");
 	}
 
 	out.println("<br>test");
 	// ���� ������
 	out.println(out.getBufferSize());
 	out.println(out.isAutoFlush());
 %>

</body>
</html>