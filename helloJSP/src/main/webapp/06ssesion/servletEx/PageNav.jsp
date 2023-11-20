<%@page import="com.momo.dto.Criteria"%>
<%@page import="com.momo.dto.PageDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

    </script>
   <% 
   	PageDto pageDto = null;
   // Controller에서 request 영역에 저장한 pageDto를 화면에서 사용할 수 있도록 변수에 저장합니다.
   	if(request.getAttribute("pageDto") != null && !"".equals(request.getAttribute("pageDto"))){
   		pageDto = (PageDto)request.getAttribute("pageDto");
   	} else {
   		pageDto = new PageDto(0, new Criteria());
   	}
   
/*    	int totalCnt = 160;
   	Criteria cri = new Criteria(); // pageNo = 1, amount = 10
   	cri.setPageNo(13);
  	PageDto pageDto = new PageDto(totalCnt, cri); */
   
/*    	int pageNo = 1;
   	int startNo = 1;
   	int endNo = 10;
   	
   	boolean prev = (startNo==1) ? false : true;
   	boolean next = true; */
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

<nav aria-label="Page navigation example">
  <ul class="pagination justify-content-center">
  	<!-- 앞으로 가기 버튼 시작 disabled : 비활성화 -->
    <li class="page-item <%= pageDto.isPrev() ? "" : "disabled" %>">
      <a class="page-link" href="/BoardListController?pageNo=<%= pageDto.getStartNo()-1 %>">Previous</a>
    </li>
    <!-- 앞으로 가기 버튼 끝 -->
    <% 
    for(int i = pageDto.getStartNo(); i <= pageDto.getEndNo(); i++) {
   	%>
	    <!-- active : 현재 페이지 번호 활성화 -->
	    <li class="page-item" aria-current="page">
	    	<a class="page-link <%= pageDto.getCri().getPageNo() == i ? "active" : "" %>" 
	    		href="/BoardListController?pageNo=<%= i %>" ><%= i %></a>
	    </li>
   	
   	<% } %>		
    
    <!-- 뒤로가기 버튼 시작 -->
    <li class="page-item <%= pageDto.isNext() ? "" : "disabled" %>">
      <a class="page-link " href="/BoardListController?pageNo=<%= pageDto.getEndNo()+1 %>">Next</a>
    </li>
  </ul>
</nav>
</body>
</html>