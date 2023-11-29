<%@page import="com.login.dto.PageDto"%>
<%@page import="com.login.dto.Criteria"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩을 사용하기 위해 CDN을 추가합니다. -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<!-- 
	class를 추가하여
	active : 현재 페이지를 활성화()
	disabled : 버튼의 비활성화
 -->
 <% 
 	PageDto pageDto = null; 
 	// 페이지 네비게이션을 생성하기 위해 필요한 데이터
 	if(request.getAttribute("pageDto") != null && !"".equals("pageDto")) {
 		pageDto = (PageDto)request.getAttribute("pageDto");
 	} else {
 		pageDto = new PageDto(0, new Criteria());
 	}
 	
   /*  int totalCnt = 166;				// realEnd = 7
    // Criteria 생성자 pageNo, amount를 String타입으로 해놔서""로 스트링타입으로 변경
 	Criteria cri = new Criteria(11+"",10+""); // pageNo = 11, amount = 10 s=1, e=10
 			
 	PageDto pageDto = new PageDto(totalCnt, cri);  */
 %>
<nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
  	<!-- 이전 페이지 블럭으로 이동 -->
    <li class="page-item <%= pageDto.isPrev() ? "" : "disabled" %>">
      <a class="page-link" href="/list?pageNo=<%= pageDto.getStartNo()-1 %>" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    
    <!-- 페이지 버튼 -->
    <% 
    	// 페이지 번호를 출력하기 위해 반복문을 사용    	
    	for(int i = pageDto.getStartNo(); i <= pageDto.getEndNo(); i++) {
    %>
    <li class="page-item">
    	<a class="page-link <%= pageDto.getCri().getPageNo() == i ? "active" : "" %>" 
    		href="/list?pageNo=<%= i %>"><%= i %></a>
    </li>
	<% } %>
      
    <!-- 다음 페이지 블럭으로 이동 -->
    <li class="page-item <%= pageDto.isNext() ? "" : "disabled" %>">
      <a class="page-link" href="/list?pageNo=<%= pageDto.getEndNo()+1 %>" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
<!-- 부트스트랩을 사용하기 위해 CDN을 추가합니다. -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>