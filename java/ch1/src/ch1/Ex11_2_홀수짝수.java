package ch1;

import java.util.Scanner;

/* 할일: 숫자 두개 입력 받아서 그 합의 홀짝 구하기

 */
public class Ex11_2_홀수짝수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 수 넣어라");
        int num1 = sc.nextInt();
        System.out.println("두번째 수 넣어라");
        int num2 = sc.nextInt();

        int total = num1 + num2;

//        if(total % 2 == 0) {
//            System.out.println("짝수입니다.");
//        }
//        else if(total % 2 == 1) {
//            System.out.println("홀수입니다.");
//        }

        System.out.println("입력하신 수의 합은 " + total +" 이고 " +( total%2==0?"짝수":"홀수") + "입니다.");

        sc.close();
    }
}
