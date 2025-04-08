package ch1;

public class Ex09_1_연산자 {
    public static void main(String[] args) {
    /*
        1) 사칙연산: +,-,*,/,%
        2) 비교연산: >, <, >=, <=, ==, ===, !=, !==
        3) 논리연산: &&, ||
        4) 대입연산: =
            복합대입연산: +=, -=, *=, /= ...
        5) 증감연산:  ++, --
        6) 삼항연산
            조건식?'참':'거짓'
            ex) num>10?"크다":"작다"

        * 우선순위: 사칙 > 비교 > 논리 > 대입
     */
        System.out.println("== 사칙연산 ==");
        System.out.println(5 / 2); // 2 | 정수 / 정수 = 정수 . JS 에서는 2.5가 나오지만 여기서는 정수형인 2 로만 표시된다
        System.out.println(5 / 2.0); // 2.5 | 정수/실수 = 실수  
        System.out.println(5.0 / 2); // | 실수/정수 = 실수
        System.out.println(5 % 2); // 1

        System.out.println((int)(5 / 2.0) );
    }
}
