package ch1;

import java.util.Scanner;

/* 할일: 삼항연산자를 이용해서 어린이 키에 따른 놀이기구 탑승 가능여부 확인 하는 프로그램 작성
        조건: 키를 입력받고
             입력받은 키가 150cm 이상이면 '탑승가능'
                               미만이면 '탑승불가'
             메세지 띄우기
 */
public class Ex09_2_연습문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("어린이의 키를 입력하시오: ");
        int h = sc.nextInt();

        System.out.println(h<150?"탑승불가":"탑승가능");

//        if(h<150) {
//            System.out.println("탑승 불가");
//        }
//        else {
//            System.out.println("탑승 가능");
//        }
    }
}
