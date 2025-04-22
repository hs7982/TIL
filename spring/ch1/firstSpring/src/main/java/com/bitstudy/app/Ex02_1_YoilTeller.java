package com.bitstudy.app;

import java.util.Calendar;

/* 할일: URL에 년월일 입력하면 요일 출력하기
 * 		터미널로 돌려보기
 *  */


public class Ex02_1_YoilTeller {

	public static void main(String[] args) { 
		// 1. 입력
		String year = args[0];
		String month = args[1];
		String date = args[2];
		
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
		System.out.println(year+"년 " + month+"월 "+ date +"일 " + yoil +"요일");
		
	}

}
