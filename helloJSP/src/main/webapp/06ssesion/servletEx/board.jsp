<%@page import="com.momo.dto.Criteria"%>
<%@page import="java.awt.Button"%>
<%@page import="java.util.List"%>
<%@page import="com.momo.dto.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	form, h2{
		text-align: center;
	}
	#table{
		width: 600px;
		margin: 0 auto;
	}

</style>
</head>
<body>

<script type="text/javascript">
	// 화면에서 동적인 처리
	window.onload=function(){
		let logoutBtn = document.querySelector("#logoutBtn");
		let loginBtn = document.querySelector("#loginBtn");
		if(logoutBtn != null) {
			logoutBtn.onclick=function(){
				// 로그아웃
				loginForm.action="/logout";
				loginForm.submit();
			}
		}
		if(loginBtn != null) {
			loginBtn.addEventListener('click', function(){
			// 로그인페이지로 이동
			// 같은 경로에 있는 파일을 호출했기 때문에 오류가 발생하지 않는다
			loginForm.action="/06ssesion/servletEx/loginForm.jsp";
			loginForm.submit();
				
			});
		}
		
	}

</script>
<!-- 로그인 여부를 체크
	로그인을 했을때 = 세션에 userId가 저장되어 있으면
		- 로그아웃 버튼을 출력
	없으면
		- 로그인 버튼을 출력
 -->
 <!-- 
 	submit : form의 요소들을 파라메터로 가지고 서버에 요청
 	action : 서버에 요청항 url 주소
 	method : 요청 방식
 				get : 조회용 파라메터
 				post : 등록, 수정용 파라메터
 	*버튼 생성했더라도  form안에 버튼이 하나밖에 없다면 해당 버튼은 서브밋 버튼이 된다.
  -->
	 <form method="get" name="loginForm">
	 <c:if test="${empty userId }">
	 	<button id="loginBtn">로그인</button>
	 </c:if>
	 <c:if test="${not empty userId }">
	 	${userId }님 환영합니다.
		 <button id="logoutBtn">로그아웃</button>
	 </c:if>

	 </form>
	 <h2>게시글 목록</h2>

	 <table id="table" border="1">
		<tr>
			<th>일련변호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<!-- 변수를 4가지 영역중 한곳에 저장 -->
		<!-- 만약 리스트의 사이즈가 0이라면 조회된 데이터가 없습니다. 출력
			만약 리스트의 사이즈가 0이 아니라면 목록을 출력 -->
			<c:if test="${empty list }" var="result">
				<tr><td colspan="6">조회된 데이터가 존재하지않습니다.</td></tr>
			</c:if>
			<c:forEach items="${list }" var="dto" >
				<tr>
					<td>${dto.num }</td>
					<td><a href="/BoardDetailController?num=${dto.num }">${dto.title }</a></td>
					<td>${dto.content }</td>
					<td>${dto.id }</td>
					<td>${dto.postdate }</td>
					<td>${dto.visitcount }</td>
				</tr>
			</c:forEach>
		
	</table>
	<!-- pageNavi include -->
	<%@ include file="PageNav.jsp" %>
	
	<!-- 페이지 네비게이션 작성
		- 페이지 번호 pageNo
		- 페이지블럭당 페이지 수 ?
			페이지블럭의 시작번호 ~ 페이지블럭의 끝번호
			
		- 총 게시물의 수 totalCnt
		- 페이지당 게시물의 수 amount
			진짜 블럭의 끝번호
	 --> 

</body>
</html>