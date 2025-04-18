package ch2_객체지향.Ex36_내장클래스_내장메서드;

/*
    - wrapper 클래스
        기본자료형을 참조자료형 처럼 사용하기 위한 클래스
        (기본자료형은 메모리에 올라가는 순간부터 기본값을 가짐)
        (참조자료형을 사용하면 문자형 -> 숫자형, 숫자형 -> 문자형 형변환 하기 편하고
         null 값을 처리할수도 있다.)

        자바는 객체지향 언어이기 때문에 모든 자료형도 객체로 다뤄져야 함.
        그러나 기본 자료형은 객체로 다루지 않음
        이유는 기본형들은 기본 값들을 다 가지고 있어서 "String Pool" 영역에 기본적으로 값을 할당해 놓기 때문임

        
    - wrapper 클래스 종류 (기본형의 첫 문자를 대문자로 하고 줄임말 없이 기본자료형을 쓰면 됨)
        char -> Character
        byte -> Byte
        short -> Short
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        boolean -> Boolean

 */
public class Ex36_2_Wrapper {
    public static void main(String[] args) {
        Integer num = null; // wrapper 클래스는 null 값 인정
        //int num2 = null; // 기본형은 null 값 인정 안함


        Integer i = 10;
        String str;
        str = i.toString(); // 10 이라는 정수를 문자열 "10" 으로 변환
        System.out.println("str: " + str);

        int primaryInt = Integer.parseInt(str); // Integer 클래스 안에 있는 문자열 변환 함수를 사용해서 Integer 형으로 바꾸고 int 형의 변수에 저장
                                                // 문자열 -> 숫자 변환
        System.out.println("primaryInt: " + primaryInt);
        System.out.println("=================================");



    }
}
