package ch1;

public class Ex01_자바문법 {
    /*
        1) java 파일 안에는 public을 가지고 있는 클래스가 하나 있어야 함
            (java 파일 안에 class가 여러개을 수 도 있지만, public을 달고 있는 클래스는 무조건 한개
        2) 클래스의 이름의 첫 글자는 대문자로 생성
        3) 클래스 이름 뒤에 () 괄호 쓰지 않음 {} 괄호 써야함
        4) 메서드는 클래스 내부에 생성
            public static은 생략 가능
        5) 클래스 내부에는 필드와 메서드만 쓸 수 있음
        6) 메서드 생성시 리턴타입을 명시해야 한다.
            void main(), String 메서드이름(), int 메서드이름()
            void - 리턴 없음, String - 문자열, int - 정수...
        7) 모든 작업이 끝날때마다 ; 필수
     */

    public static void main(String[] args) {
        System.out.println("여기");
        Main3 m3 = new Main3();
        m3.main();
    }
}

class Main3 {
    void main() {
        System.out.println("저기");
    }
}
