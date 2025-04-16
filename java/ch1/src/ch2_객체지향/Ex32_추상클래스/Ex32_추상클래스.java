package ch2_객체지향.Ex32_추상클래스;

/*
    - 추상클래스란 (abstract class)
        구체적이지 않은 클래스
        선언부로만 구성되어 있는 메서드(미완성[추상] 메서드)를 하나라도 가지고 있는 클래스를 '추상클래스' 라고 함
        기본클래스는 구체화 되어 있는 메서드들만 들어있음. (그런데 거기에 하나라도 추상메서드면 그 클래스는 이제부터 추상클래스로 침)

        *추상클래스로는 객체화 할 수 없음(다른곳에서 new 로 객체화 불가능)

        *추상 메서드의 앞에는 abstract 를 붙여줘야 한다
        (얘 때문에 클래스도 abstract 가 붙어서 추상클래스 로 표시해 줘야 함)
        
        [public] abstract class 클래스명 {
            abstract void 메서드명([매개변수..]) ;
        }

        *추상클래스를 상속받은 자식들을 객체화 할 용도로 만들거라면 무조건 추상메서드를 구체화 해야함
 */
abstract class A {
    abstract void study(); // 추상 메서드
    void go() {
        System.out.println("go");
    }
    void stop() {
        System.out.println("stop");
    }
    void run() {
        System.out.println("run");
    }
    void jump() {
        System.out.println("jump");
    }
}
class A1 extends A {
    void study() { // 부모에 있는 추상메서드를 구체화 한거임
        
    }
}
public class Ex32_추상클래스 {
    public static void main(String[] args) {

    }
}
