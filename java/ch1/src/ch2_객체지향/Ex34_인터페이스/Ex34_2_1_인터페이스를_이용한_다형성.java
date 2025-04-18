package ch2_객체지향.Ex34_인터페이스;
/*

 */

class A {
    void method() {
        System.out.println("A클래스");
    }
}
class B {
    void method() {
        System.out.println("B클래스");
    }
}
class C { // A 나 B의 출력용
    void method(A a) {
        a.method();
    }
}
public class Ex34_2_1_인터페이스를_이용한_다형성 {
    public static void main(String[] args) {
        C c = new C();
        c.method(new A()); // 'C가 A에 의존(dependency)하고 있다' 라고 함

        // A가 아니라 B를 사용하고 싶으면 C클래스의 method에 보내는 매개변수를 B로 바꿔줘야 한다
        // c.method(new B());

    }
}
