package ch1;

/*
    - 변수란 값을 저장할 수 있는 박스(공간) 을 의미한다
            하나의 변수에 하나의 형태의 값만 저장할 수 있다.

    - 변수 종류
        1) 클래스 변수(Class variable, cv)
            static 으로 선언된 변수. ex) static int num = 10;
            클래스가 메모리에 올라갈때 생성됨.
            그래서 별도의 인스턴스 생성 없이 '클래스이름.변수명' 방식으로 사용 가능

        2) 인스턴스 변수(Instance variable, iv)
            class가 시작하자마자 선언되는 변수 (main() 같은 메소드 밖에)
            클래스가 인스턴스화 될 때 초기화 되는 변수
            (인스턴스를 통해서만 접근 가능한 변수)

        3) 지역 변수(Local variable, lv)
            스코프 내에서 선언된 변수.
            해당 스코프 지역 내에서만 인식 가능
            멤버변수와 동일한 이름을 가질 수 있고, 지역변수가 우선순위

        4) 매개 변수(Parameter)
            메서드에 인자로 전달되는 값을 받는 변수
            져역변수처럼 사용

    - 변수 생성
        1) 변수 선언 - 변수타입 변수명;
                    ex)int num;
        2) 변수 초기화 - 변수를 선언할때 빈 박스로 두지 말고, 기본으로 사용할 초기값을 설정해놓자.
                    ex)int num = 0;

    - 변수 타입에 따른 기본값
        1) char - '\u0000'

        2) byte - 0
        3) short - 0
        4) int - 0
        5) long - 0L

        6) float - 0.0f
        7) double - 0.0

        8) boolean - false

        9) 참조형 변수 - null

    - 변수명 생성 규칙
        1) 시작글자는 영문, _, $ 중에 하나로 시작
        2) 대소문자 구분
        3) 예약어 사용 금지
        4) 변수병 중복되지 않도록 생성
        5) 공백 불가
            ex) int vscode; (O)
                int vs code; (x)
                    --> int vsCode; (O)

    - 상수: 바뀌지 않는 값
        최초에 선언될때 딱 한번만 값을 저장할 수 있는 변수
        final 키워드를 이용해서 생성
        보통 상수의 변수명은 대문자나 _ 를 이용해서 쓴다.
        ex) final int TMP = 10;

    -


 */
public class Ex04_변수 {

    public static void main(String[] args) {
        System.out.println(A.num1);

        A tmpA = new A();
        System.out.println(tmpA.num1); //num1, num2가 멤버변수와 지역변수 모두 다 있지만
        System.out.println(tmpA.num2); //여기서는 멤버변수꺼가 출력됨
        tmpA.aMain();
    }

}
class A {
    static int num1 = 100; // 클래스 변수, 멤버변수
    int num2 = 20; // 인스턴스 변수, 멤버변수

    void aMain() {
        int num1 = 200; //지역변수
        int num2 = 100; //지역변수
        System.out.println("num1: " + num1); //값은 이름의 변수가 '클래스 영역'에도 있고 '지역'에도 있을때는 제일 가까운쪽꺼 출력함
        System.out.println("num2: " + num2); //여기서는 지역변수꺼 출력해줌
    }
}