package com.bitstudy.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller - 원격 호출 가능한 컨트롤러 빈으로 등록
@Controller
public class Ex01_1_Hello {
	int iv = 10;
	static int cv = 20;
	
	// @RequestMapping - URL과 메서드 연
	@RequestMapping("/hello")
	private void main() { //private 이던 public이던 외부요청일때는 상관 없음 
		System.out.println("hello world");
		
		System.out.println("메인메서드 iv : " + iv);
		System.out.println("메인메서드 cv : " + cv);
	}
	
	public static void main(String[] args) {
		//System.out.println("메인메서드 iv : " + iv); //에러. 쓸거면 맵핑하고 static 빼야
		System.out.println("메인메서드 cv : " + cv);
	}
	
	
}
