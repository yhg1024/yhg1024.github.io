<%@page import="com.momo.dto.Criteria"%>
<%@page import="com.momo.dto.PageDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<style type="text/css">
	.pagination {
		padding-top:50px;
	}
	
	#calendar{
		display: none;
	}
	
	#chart{
		display: none;
	}
	
</style>
 <script src='https://cdn.jsdelivr.net/npm/fullcalendar@6.1.9/index.global.min.js'></script>
    <script>

      document.addEventListener('DOMContentLoaded', function() {
        var calendarEl = document.getElementById('calendar');
        var calendar = new FullCalendar.Calendar(calendarEl, {
          initialView: 'dayGridMonth'
        });
        calendar.render();
      });
      
      function goPage(pageNo) {
    	  searchForm.pageNo.value =  pageNo;
    	  searchForm.submit();
      }

    </script>
   <% 
   	PageDto pageDto = null;
   // Controller에서 request 영역에 저장한 pageDto를 화면에서 사용할 수 있도록 변수에 저장합니다.
   	if(request.getAttribute("pageDto") != null && !"".equals(request.getAttribute("pageDto"))){
   		pageDto = (PageDto)request.getAttribute("pageDto");
   	} else {
   		// 게시글의 총 건수를 넣어 페이지 네비게이션을 생성한다.
   		pageDto = new PageDto(0, new Criteria());
   	}
   %>
</head>
<body>

<div id='calendar'></div>

<!-- 차트 chart.js -->
<div id="chart">
  <canvas id="myChart"></canvas>
</div>

<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<script>
  const ctx = document.getElementById('myChart');

  new Chart(ctx, {
    type: 'bar',
    data: {
      labels: ['Red', 'Blue', 'Yellow', 'Green', 'Purple', 'Orange'],
      datasets: [{
        label: '# of Votes',
        data: [12, 19, 3, 5, 2, 3],
        borderWidth: 1
      }]
    },
    options: {
      scales: {
        y: {
          beginAtZero: true
        }
      }
    }
  });
</script>



<!-- 부트스트랩 JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

pageDto : ${pageDto } <br>
startNo : ${pageDto.startNo } <br>
prev : ${pageDto.prev ? "" : "disabled" }

<!-- 페이지네이션 -->
<nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
  	<!-- 앞으로 가기 버튼 시작 disabled : 비활성화 -->
  	
    <li class="page-item ${pageDto.prev ? '' : "disabled" }">
      <a class="page-link"  onclick="goPage(${pageDto.startNo -1})">Previous</a>
    </li>
    
    <!-- 앞으로 가기 버튼 끝 -->
    <c:forEach begin="${pageDto.startNo }" end="${pageDto.endNo }" var="i">
    	<li class="page-item" aria-current="page">
   		<!-- href="..." 링크로 이동할 경우, 검색어가 유지 되지 않습니다. -->
   		<!-- 검색어를 유지하기 위해 searchForm을 전송하는 goPage 함수를 생성했습니다. -->
   		<!-- 링크를 함수호출로 변경 onclick이벤트가 발생하면 goPage() 함수를 호출합니다.
   				함수의 파라메터로 페이지번호를 넣어 주어야합니다. -->
	    <!-- active : 현재 페이지 번호 활성화 -->
	    	<a class="page-link ${pageDto.cri.pageNo eq i ? 'active' : '' }" 
	    		onclick="goPage(${i})" >${i }</a>
	    </li>
    </c:forEach>
       
    <!-- 뒤로가기 버튼 시작 -->
    <li class="page-item ${pageDto.next ? '' : 'disabled'}">
      <a class="page-link " onclick="goPage(${pageDto.endNo +1})">Next</a>
    </li>
  </ul>
</nav>
</body>
</html>