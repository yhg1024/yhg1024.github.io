<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>다중 조건문</h2>

<p>홀짝 판단하기</p>
<!-- 변수 선언 -->
<c:set var="num" value="101"/>

<!-- 다중 조건문 사용하기 -->
<c:choose>
	<c:when test="${num mod 2 eq 0 }">
		num(${num })은 짝수입니다.
	</c:when>
	<c:otherwise>
		num(${num })은 홀수입니다.
	</c:otherwise>
</c:choose>

<!-- form에 action을 주지 않을경우, 동일한 페이지를 다시 요청합니다. -->
<form>
	국어 : <input type="text" name="kor"> <br>
	영어 : <input type="text" name="eng"> <br>
	수학 : <input type="text" name="math"> <br>
	<button>전송</button>
</form>
<!-- 동일한 페이지가 다시 요청되어 form태그 안에 요소를 출력 -->
국어점수는 ${param.kor } 입니다. <br>
영어점수는 ${param.eng } 입니다. <br>
수학점수는 ${param.math }입니다. <br>

총점은 ${param.kor + param.eng + param.math } <br>

<c:set var="avg" value="${(param.kor + param.eng + param.math)/3 }"></c:set>


<c:choose>
	<c:when test="${avg >= 90 }">
		평균 학점은 A학점입니다.
	</c:when>
	<c:when test="${avg >= 80 }">
		평균 학점은 B학점입니다.
	</c:when>
	<c:when test="${avg >= 70 }">
		평균 학점은 C학점입니다.
	</c:when>
	<c:otherwise>
		평균 학점은 D학점입니다.
	</c:otherwise>
</c:choose>

<h2>국, 영, 수 점수를 입력하면 평균을 내어 학점을 출력</h2>
<p>>=90 : A학점, >=80 : B학점, >=70 : C학점, >=60 : D학점</p>


</body>
</html>