<%-- 
	= JSP 기본객체 =
	1) request: 사용자의 요청 정보가 담겨있는 객체 
	2) response: 요청에 대한 응답을 작성할때 사용하는 객체
	3) session: HTTP 세션을 구현한 객체(서버에 정보 저장 관련)
	4) application: WebApplication(내 서비스 전체) 에서 공유하는 객체 
	5) out: 응답에 포함될 내용을 브라우저에 출력할때 사용

 --%> 

<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@page import="java.util.Calendar"%>

<%
	String year = request.getParameter("year");
	String month = request.getParameter("month");
	String date = request.getParameter("date");

	int y = Integer.parseInt(year);
	int m = Integer.parseInt(month);
	int d = Integer.parseInt(date);
	
	Calendar cal = Calendar.getInstance(); 
	cal.set(y, m-1, d); // month는 1월-0
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일이 숫자로 나옴
	char yoil = " 일월화수목금토".charAt(dayOfWeek);
%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>요일 구하기</title>
</head>
<body>
	<h1><%=y%>년<%=m%>월<%=d%>일은 <%= yoil %>요일 입니다.</h1>
</body>
</html>