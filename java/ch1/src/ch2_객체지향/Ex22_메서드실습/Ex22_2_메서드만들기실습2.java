package ch2_객체지향.Ex22_메서드실습;

import java.util.Scanner;

/** 할일: Ex22_1 에 있는 getOne(), getTwo() 이용해보기 */
public class Ex22_2_메서드만들기실습2 {
    public static void main(String[] args) {
        // 입력값 받아서
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하시오: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력하시오: ");
        int num2 = sc.nextInt();


        // Ex22_1을 메모리에 올리기(인스턴스화 하기)
        Ex22_1_메서드만들기실습1 tmp = new Ex22_1_메서드만들기실습1();

        // Ex22_1 에 있는 getOne() 사용해보기
        System.out.println("입력하신 숫자는 "+num1+" 이고, 결과는 "+ tmp.getOne(num1) +" 입니다.");

        // Ex22_1 에 있는 getTwo() 사용해보기
        System.out.println("입력하신 숫자는 "+num1+" 과 "+num2+" 이고, 결과는 "+ tmp.getTwo(num1, num2) +" 입니다.");

    }

}