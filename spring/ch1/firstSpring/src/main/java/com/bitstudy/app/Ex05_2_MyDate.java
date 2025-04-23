package com.bitstudy.app;

/* 할일: 사용자로부터 넘어오는 정보를 Ex05_1에서 간단하게 사용할 수 있도록 이 클래스에 다 몰아넣기
 	
 	-순서-
 	1) Ex05_1 에서 사용하는 변수를 여기에 다 private 로 놓기(다른 외부 파일에서 쉽게 변수들에 접근 못하게 막기)
 	2) getter/setter 만들어서 외부접근 가능하게 하기
 		(메뉴바 > Source > Generate Getters and Setters)
 		(단축키: Alt + Shift + S > R)
 	3) toString 생성
 		(메뉴바 > Source > Generate toString() 선택)
 		(단축키: Alt + Shift + S > S)
 */
public class Ex05_2_MyDate {
	private int year; 
	private int month;
	private int date;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "입력하신 날짜는 [년=" + year + ", 월=" + month + ", 일=" + date + "]";
	}
	
	
}















