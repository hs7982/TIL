package com.bitstudy.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*  할일: 회원가입 폼 작성해보기(MVC 패턴으로 회원가입 화면 만들기)
 		
 	- 순서 	
		1) 컨트롤러와 뷰 파일 생성
		2) 뷰 만들기 - 1)회원가입폼 페이지. 2)넣은 정보 확인하는 페이지.
		3) 컨트롤러 만들기 - 1) 컨트롤러 페이지
			뷰에서 넘어오는(요청) 데이터들을 받아서 화면에 출력하는 작업만 할거임
			(나중에 DB 연결까지 하면 그때 진짜 회원가입 할거임)
	
	*인코딩 설정 바꾸기(이거 안하면 한글 깨질수도 있음)
		메뉴바 > Window > Preperances > Web > HTML Files > encoding을 맨 위에 있는 UTF-8 로 변경하고
		HTML Files 말고 JSP 랑 CSS 꺼도 다 UTF-8로 변경하기
		
 */
@Controller
public class Ex07_1_회원가입 {
	@RequestMapping(value="/register/join", method=RequestMethod.GET)
	public String join() {
		return "Ex07_2_회원가입폼";
	}
	
	@RequestMapping(value="/register/save", method=RequestMethod.POST)
	public String save() {
		return "Ex07_3_회원가입결과";
	}
	
} 