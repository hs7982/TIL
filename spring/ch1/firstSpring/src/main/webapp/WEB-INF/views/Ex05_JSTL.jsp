<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 
== taglib 란 ==
	JSP는 자신만의 태그를 추가할 수 있는 기능을 제공함. <jsp:include> 같은 커스텀태그가 있음.
	연산이나 조건문 반복문 같은 기능을 하는 태그를 제공해주는게 JSTL 임	

	1) core는 JSTL의 주요 기능들을 끌어다 쓰겠다는 뜻
	2) fmt 는 formatting 기능 -> 숫자, 날짜, 시간 포멧팅 하는 기능을 제공
	3) fn 은 기본 함수들( ex) 배열의 사이즈 구하는 그런 함수)
 --%>    
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	1) jstl 의 if, else 문
		-if문- c:if
			<c:if test="${조건}">
			
			</c:if>
		
	   - if, else 문 - c:choose
		   	<c:choose>
				<c:when test=${조건}>
					조건 맞는경우 실행
				</c:when>
				<c:when test=${조건}>
					조건 맞는경우 실행
				</c:when>
				<c:otherwise>
					조건 맞는경우 실행
				</c:otherwise>
			</c:choose> 
			
	2) 반복문 - c:forEach
		<c:forEach items=${배열} var="${for문 안에서 사용할 변수}" varStatus="status" >
		
		</c:forEach>
		
	3) 변수선언 - c:set 
		<c:set var=변수명 value="값" />
 --%>
	
	<%-- 변수 선언 --%>
	<c:set var="num" value="10" /> <%-- 변수 num 생성 --%>
	<!-- int num = 10; 같은거임 -->
	
	<%-- 배열 선언 - 말만 배열임. 그냥 , 들어간 문자열 처럼 들어가있음. (단, 컴마때문에 배열처럼 인식 시킬수도 있음) --%>
	<c:set var="arr" value="10,20,30,40,50" />
	
	<%-- 출력 - EL방식( ${ } ) 를 이용해서 변수명을 써줘야함 --%>
	<c:out value="num" />  <!-- 변수 num 을 불러오는게 아닌 그냥 문자열 num을 찍어줄뿐임 --> 
	<br />
	num: <c:out value="${ num }" /> <!-- EL 방식을 써야 실제 변수를 불러옴 -->
	<br />
	arr: <c:out value="${ arr }" /> <!-- 배열을 그냥 출력하면 나오기는 하지만 그게 배열로 나오는게 아니라 , 를 포함한 문자열로 나올뿐임 -->
	<br /> 
	<!-- 배열을 출력하고 싶으면 forEach문으로 하나씩 출력 -->
	arr각 방 출력: 
	<c:forEach var="item" items="${ arr }" varStatus="status" >
		${ status.index } 번방: ${ item } <br />
	</c:forEach>
	arr 개수: ${ fn:length(arr) }개 <br />
	<hr>
	<!-- arr를 split 해서 배열로 재저장 하면 일반 배열처럼 사용 가능 -->
	<c:set var="arr" value="${ fn:split(arr, ',') }" />
	1번방: <c:out value="${ arr[1] }" />
	<br />
	<hr>
	<hr>
	<hr>
	
	<!-- 만약 arr 가 비어있지 않으면 안에 코드 실행 -->
	<c:if test="${ not empty arr }">
		<c:forEach var="item" items="${ arr }" varStatus="status" >
			${ status.index } 번방: ${ item } <br />
		</c:forEach>
	</c:if>
	
	<hr>
	<!-- if else 문 - 만약 arr가 비어있으면 "비어있음" , 아니면 "들어있음" 출력하기 -->
	<c:choose>
		<c:when test="${ empty arr }">
			<h1>비어있음</h1>
		</c:when>
		<c:otherwise>
			<h1>들어있음</h1>
		</c:otherwise> 
	</c:choose>
	
	<!-- url에 특정 key(msg) 가 있으면 출력 -->
	<c:if test="${ param.msg != null }">
		들어온 메세지 = ${ param.msg }
	</c:if>
	<c:if test="${ param.msg == null }">
		메세지가 없습니다
	</c:if>
	 
	<hr>
	
	<!-- URL 을 통해 age 입력받고 20 이상이면 "성인", 20미만이면 "미성년자" 입니다.
		0이하 이면 "잘못된 입력입니다." 출력하기 -->
	<c:set var="age" value="${ param.age }" />
	
	<c:if test="${ age >= 20 }">
		"성인입니다."
	</c:if>
	<c:if test="${ 0 < age && age < 20 }">
		"미성년자"
	</c:if>
	<c:if test="${ age <= 0 }">
		"잘못된 입력입니다."
	</c:if>
	<hr>
	<hr>
	<c:choose>
		<c:when test="${ age >= 20 }">
			"성인입니다."
		</c:when>
		<c:when test="${ 0 < age && age < 20 }">
			"미성년자"
		</c:when>
		<c:otherwise>
			"잘못된 입력입니다."
		</c:otherwise>
	</c:choose>
	
	<hr>
	
	<c:set var="now" value="<%= new java.util.Date() %>" />
	서버 타임: <fmt:formatDate value="${now }" type="both" pattern="yyyy/MM/dd HH:mm:ss"/>
	 
</body>
</html>















