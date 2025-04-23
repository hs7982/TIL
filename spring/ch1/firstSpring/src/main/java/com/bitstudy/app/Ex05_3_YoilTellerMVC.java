package com.bitstudy.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/* 할일:   
 */

@Controller
public class Ex05_3_YoilTellerMVC {
	
	@RequestMapping("/getYoilMVC3")  
	public String main(Ex05_2_MyDate myDate, Model model) { 
  
		if(!isValid(myDate)) {
			return "yoilError";  
		}
		 
		char yoil = getYoil(myDate);
		
		// 위에서 구한 yoil까지 model 객체에 저장
		model.addAttribute("myDate",myDate); 
		model.addAttribute("yoil",yoil);
		
		// 3. 출력
		return "yoil";
		 
	}


	private char getYoil(Ex05_2_MyDate date) {
		Calendar cal = Calendar.getInstance(); 
		cal.set(date.getYear(), date.getMonth()-1, date.getDate()); // month는 1월-0
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일이 숫자로 나옴
		 
		return " 일월화수목금토".charAt(dayOfWeek);
	}
	
	
	private boolean isValid(Ex05_2_MyDate date) {
		
		if(date.getMonth() < 1 || 12 < date.getMonth()) {
			return false;
		}
		
//		month = month-1;
		Calendar cal = Calendar.getInstance();
		cal.set(date.getYear(), date.getMonth()-1, 10);
		int maxDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println((date.getMonth()) + ", " + maxDate);
		if(date.getDate() < 1 || maxDate < date.getDate() ) {
			return false;
		}
		
		return true;

	}
	
}
