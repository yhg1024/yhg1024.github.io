<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	pageContext.setAttribute("attrPage", "attrPage");
	request.setAttribute("attrRequest", "attrRequest");
%>

<%-- <jsp:include> : 외부파일을 현재 파일에 포함시킵니다. --%>
	<h2>지시어와 액션태크 동작 방식 비교</h2>
	<hr>
	<h3>지시어방식</h3>
	<%@ include file="inc/OuterPage1.jsp" %>
	 include지시자 방식에서 선언한 변수 : <%= newVar1 %>
	 <p>
	 	페이지 영역(scope) 공유<br>
	 	include되는 페이지에서 생성한 변수도 공유
	 </p>
	
	<hr>
	<h3>액션태그 방식</h3>
	<!-- 
		액션태그 방식
			페이지영역이 공유되지 않음
			외부파일에서 생성된 변수가 공유되지 않음
	 -->
	<jsp:include page="inc/OuterPage2.jsp"></jsp:include>
	액션태그 방식에서 선언한 변수 : <%-- newVar2 --%>
</body>
</html>