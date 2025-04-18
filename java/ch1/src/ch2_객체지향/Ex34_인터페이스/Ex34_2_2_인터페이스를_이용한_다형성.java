package ch2_객체지향.Ex34_인터페이스;

/* Ex34_2_1 의 방식은 C 클래스에 무조건 한 종류의 클래스만 매개변수로 받았어야 했는데
   그러면 수정할때마다 C 클래스의 매개변수 부분을 바꿔줘야 한다.
   
   그렇게 하는 대신 인터페이스를 만들어서 선언부만 만들어 놓고, 그 인터페이스를 이용해서 A나 B를 구현하면(다형성 개념) C의 method() 에서 인터페이스의 다형성 방식으로 A 와 B 둘다 받을수 있다.

 */
interface I {
    public void method();
}
class AA implements I {
    public void method() {
        System.out.println("A클래스");
    }
}
class BB implements I {
    public void method() {
        System.out.println("B클래스");
    }
}
class CC {
    void method(I i) {
        i.method();
    }
}
public class Ex34_2_2_인터페이스를_이용한_다형성 {
    public static void main(String[] args) {
        CC c = new CC();

        c.method(new AA());
        c.method(new BB());

    }
}














