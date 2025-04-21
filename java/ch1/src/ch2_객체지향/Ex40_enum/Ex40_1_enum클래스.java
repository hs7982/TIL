package ch2_객체지향.Ex40_enum;

/*
== Enum 클래스 ==
    우리가 상수를 정의할때 final static String 이런 방식으로 상수를 정의한다.
    이렇게 상수를 정의해서 코딩을 하는 경우 재사용 할수도 없고, 이름이 겹치면 에러가 난다.
    그래서 이 문제점을 보완하기 위해 나온 클래스

== enum 사용방법 ==
    enum 이름 { 상수명1, 상수명2, 상수명3.....}
 */
public class Ex40_1_enum클래스 {
    
    // 기존에 상수를 정의하는 방법
    public static final String MENU1 = "초코라떼";
    public static final String MENU2 = "아메리카노";

    public static void main(String[] args) {
        String menu;
        menu = MENU1; // 에러 안남
        menu = MENU2; // 에러 안남
        menu = "햄버거"; // 에러 안남. 그치만 에러 나야함
                        // 왜냐면 내가 원하는건 저 위에 있는 MENU1, MENU2 꺼만 들어가게 하려고 만든 menu 라는 변수이기 때문임
        // --------------------------------------------------------------------
        // enum 사용

        CafeMenu enumMenu;
        enumMenu = CafeMenu.초코라떼; // 에러 안남
        enumMenu = CafeMenu.아메리카노; // 에러 안남
        // enumMenu = "햄버거"; // 컴파일에러남

        System.out.println(enumMenu);

        /* 기존 상수 방식은 우리가 원하는 값 이외의 값이 들어와도 자료형만 맞으면 에러 안나기 때문에 별도의 유효성 검사 로직을 짜야 한다.
           그러나 enum 방식을 쓰면 우리가 지정한 상수값만 저장할수 있기 때문에 유효성검사를 하지 않아도 되는 장점이 있다. */
    }
}

enum CafeMenu { 
    초코라떼,
    아메리카노
}


