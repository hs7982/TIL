package com.bitstudy.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/* 할일: Ex02_2 때 했던것들(년,월,일)을 외부에서 입력을 받고
 *      제대로 된 값이 넘어온 경우 View 단의 Yoil.jsp 를 사용자에게 리턴하거나, 
 *      잘못된 값이 넘어온 경우 미리 준비한 에러페이지를 리턴한다.
 *      
 * 순서: 1) src > main > webapp > WEB-INF > views > yoil.jsp, yoilError.jsp 만들기
 * 		2) Ex02_2 의 main 메서드 복사해오기
 * 
 */

@Controller
public class Ex03_1_YoilTellerMVC {
	
	@RequestMapping("/getYoilMVC")
// 1) HttpServletRequest 로 한번에 받지 않고 String year,String month, String date 로 아예 처음부터 나눠서 받기
//	public void main(HttpServletRequest request, HttpServletResponse response) {
//	 	1) 번꺼 하면 아래 세줄 필요 없음
//		String year = request.getParameter("year");
//		String month = request.getParameter("month");
//		String date = request.getParameter("date");
	
//	2)  String year,String month, String date 로 받던걸 어짜피 나중에 int로 형변환 할거기 때문에 
//		아예 3)번처럼 int로 받으면 형변환 파트 필요 없음
//	public void main(String year,String month, String date, HttpServletResponse response) {
//		int y = Integer.parseInt(year);
//		int m = Integer.parseInt(month);
//		int d = Integer.parseInt(date);
	
//	3) int로 값 다 받기 - 이거 하면 request도 필요 없고, 형변환 작업도 할필요 없음
	public String main(int year, int month, int date, Model model) { 
		// 1. 입력
		
		// 2. 작업 - 제대로 된 년월일 이 들어왔는지 검사.
		if(!isValid(year, month, date)) {
			return "yoilError"; // 잘못된 범위가 들어왔으면 에러페이지 연결
		}
		
		// 메서드로 코드 따로 빼기 - Alt + Shift + M / option+command+M
		// 제대로 된 범위가 들어온 경우 코드 진행
		char yoil = getYoil(year, month, date);
		
		// 위에서 구한 yoil까지 model 객체에 저장
		model.addAttribute("year",year);
		model.addAttribute("month",month);
		model.addAttribute("date",date);
		model.addAttribute("yoil",yoil);
		
		// 3. 출력
		return "yoil";
		
		// 아래 코드는 Views > yoil.jsp 로 옮김
//		response.setContentType("text/html; charset=utf-8"); // 위 두줄을 한줄로 합친거
//		
//		PrintWriter out=null; // 브라우저에 출력 준비(출력 스트립을 얻음)
//			
//		try {
//			out = response.getWriter(); // getWriter() 는 예외처리가 필요함
//		} catch (IOException e) { 
//			e.printStackTrace();
//		}
//		out.println("<html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println(year+"년 " + month+"월 "+ date +"일은<br>");
//		out.println(yoil +"요일임.");
//		out.println("</body>");
//		out.println("</html>");
//		out.close();

/*
 * 다 하고 서버 다시 켜고(ctrl + F11)
 * 
 * http://localhost:8080/app/getYoil?year=2025&month=4&date=22
 * 
 * 입력하기
 * */
	}


	private char getYoil(int year, int month, int date) {
		Calendar cal = Calendar.getInstance(); 
		cal.set(year, month-1, date); // month는 1월-0
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일이 숫자로 나옴
		
//		char yoil = " 일월화수목금토".charAt(dayOfWeek);
//		return yoil;
		// 위에 두줄 아래로 한줄로 변경 가능
		return " 일월화수목금토".charAt(dayOfWeek);
	}
	
	
	private boolean isValid(int year, int month, int date) {
		
		if(month < 1 || 12 < month) {
			return false;
		}
		
		month = month-1;
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, 10);
		int maxDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println((month+1) + ", " + maxDate);
		if(date < 1 || maxDate < date ) {
			return false;
		}
		
		return true;

	}
	
}
