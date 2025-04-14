package ch2_객체지향.Ex29_다형성;

/*
    Child 인스턴스를 생성하더라도 멤버 변수는 원래꺼가 출력되고
    메서드는 (tmp)는 오버라이드 된다.
 */

class Parent {
    int x = 100;

    void tmp() {
        System.out.println("부모 메서드");
    }
}

class Child extends Parent {
    int x = 200;

    void tmp() {
        System.out.println("자식 메서드");
    }
}

public class Ex29_2_다형성_예제 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x: " + p.x);
        p.tmp();
        System.out.println("c.x: " + c.x);
        c.tmp();
    }
}

