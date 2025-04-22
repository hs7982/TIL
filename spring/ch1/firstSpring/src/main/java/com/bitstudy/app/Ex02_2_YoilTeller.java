package com.bitstudy.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* 할일: Ex02_1 에서 했던 내부터미널로 받던 입력을 브라우저에서(외부) 받아서 실행시켜보기 
 * 		(HttpServletRequest 를 이용해서 외부 입력을 받음)
 * HttpServletRequest: JSP 에서 가장 많이 사용되는 객체
 * 					   사용자의 request에서 값을 받아올 수 있다.
 	HttpServletResponse: 사용자에게 요청의 결과를 돌려주는 객체
 * 
 * 아래 예제 다 치면 URL에 아래 주소 넣기
 * http://localhost:8080/app/getYoil?year=2025&month=4&date=22
 * */

@Controller
public class Ex02_2_YoilTeller {
	
	public void main(HttpServletRequest request, HttpServletResponse response) { 
		// 1. 입력
//		String year = args[0];
//		String month = args[1];
//		String date = args[2];
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String date = request.getParameter("date");
		
		// Calendar 에는 int 만 넣을수 있기때문에 int 로 변환
		int y = Integer.parseInt(year);
		int m = Integer.parseInt(month);
		int d = Integer.parseInt(date);
		
		// 2. 작업
		/* Calendar 는 추상 클래스 라서 new 가 아닌 getInstance()를 이용해서 인스턴스를 만들기 
		 * new 로 만드는 것과의 차이는 최초에 할당된 메모리를 재사용 하느냐 안하는냐의 차이임. (재사용은 getInstance)
		 * */
		Calendar cal = Calendar.getInstance(); 
		cal.set(y, m-1, d); // month는 1월-0
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일이 숫자로 나옴
		char yoil = " 일월화수목금토".charAt(dayOfWeek);
		
		// 3. 출력
		/* Servlet은 HttpServletResponse 객체에 ContentType, 응답코드 등의 메세지들을 담아서 전송함
		 * 브라우저는 내가 보내주는게 텍스트인지 바이너리 인지 모르기 때문에 아래 두 정보를 전달해줘야함 */
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); // 위 두줄을 한줄로 합친거
		
		PrintWriter out=null; // 브라우저에 출력 준비(출력 스트립을 얻음)
			
		try {
			out = response.getWriter(); // getWriter() 는 예외처리가 필요함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println(year+"년 " + month+"월 "+ date +"일은<br>");
		out.println(yoil +"요일임.");
		out.println("</body>");
		out.println("</html>");
		out.close();

/*
 * 다 하고 서버 다시 켜고(ctrl + F11)
 * 
 * http://localhost:8080/app/getYoil?year=2025&month=4&date=22
 * 
 * 입력하기
 * */
	}
}
