<%@page import="com.momo.dto.DeptDto"%>
<%@page import="java.util.List"%>
<%@page import="com.momo.dao.DeptDao"%>
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
		DeptDao dao = new
		DeptDao(application);
		List<DeptDto> list = dao.getList();
		
		dao.close();
		
		for(DeptDto dto:list) {
			out.print(dto.getDept_Title());
			out.print(" ");
			out.print(dto.getLocal_Name());
			out.print(" ");
			out.print(dto.getLocation_Id());
			out.print(" ");
			out.print(dto.getNational_Code());
		}
	
	%>
</body>
</html>