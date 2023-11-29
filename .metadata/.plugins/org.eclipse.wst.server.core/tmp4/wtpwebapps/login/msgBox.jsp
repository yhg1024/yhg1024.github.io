<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 메세지 출력후 다른 페이지로 이동 -->
<script type="text/javascript">
	alert('<%= request.getAttribute("msg") %>');
	// 만약 url값이 있다면 url 요청 (location.href=url)
	let url = '<%= request.getAttribute("url") %>';
	if(url != '') {
		// url로 이동
		location.href = url;
	} else {
		history.back();
	}
</script>

</body>
</html>