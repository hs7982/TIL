package com.bitstudy.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/* 할일:  int year, int month, int date 같은 사용자 요청사항을 받아주는 매개변수의 개수가 많을때를 대비해서
 * 		한개의 클래스를 별도로 만들어서 그걸 연결해서 써보기
 */

@Controller
public class Ex05_1_YoilTellerMVC {
	
	@RequestMapping("/getYoilMVC2") 
//	public String main(int year, int month, int date, Model model) {
	public String main(Ex05_2_MyDate myDate, Model model) { 

		int year = myDate.getYear();
		int month = myDate.getMonth();
		int date = myDate.getDate();
		 
		if(!isValid(year, month, date)) {
			return "yoilError";  
		}
		 
		char yoil = getYoil(year, month, date);
		
		// 위에서 구한 yoil까지 model 객체에 저장
		model.addAttribute("year",year);
		model.addAttribute("month",month);
		model.addAttribute("date",date);
		model.addAttribute("yoil",yoil);
		
		// 3. 출력
		return "yoil";
		 
	}


	private char getYoil(int year, int month, int date) {
		Calendar cal = Calendar.getInstance(); 
		cal.set(year, month-1, date); // month는 1월-0
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일이 숫자로 나옴
		 
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
