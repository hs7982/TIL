package com.bitstudy.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Ex04_1_Season {
	@RequestMapping("/season")
	public void random(HttpServletResponse response) {
		String[] seasonList = {"spring","summer", "fall", "winter"};
		
		int id = (int)(Math.random()*4);

		response.setContentType("text/html; charset=utf-8");
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
		out.println("<img src=./img/" + seasonList[id] + ".jpg" );
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
