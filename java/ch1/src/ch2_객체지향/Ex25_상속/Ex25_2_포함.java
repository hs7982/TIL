package ch2_객체지향.Ex25_상속;

/*
    -포함
        상속 이외에도 클래스를 재사용 하는 방법이 있다. '포함' 이라고 방법임
        main 이 아닌 특정 클래스에서 다른 클래스를 인스턴화 하면 됨(new 말하는거임)

        굳이 공통되는 속성이나 기능들이 많지 않다면 상속보다 포함관계를 더 출력한다.
        (이유는 상속을 하나밖에 못받기도 하고, 클래스를 작성하는것도 쉽고, 코드도 간결해서 이해하기 쉽고, 관리하기에도 쉽다)
        (그치만 당연히 공통 용도로 쓸 클래스가 필요하기 때문에 어쩔수 없이 상속도 많이 씀)
        
        그래서 비중이 높은 클래스 하나만 상속관계로 하고, 나머지는 포함관계로 연결

 */
class A {
    int eyes = 2;
    int nose = 1;
    int mouse = 1;
    String race = "황인종";
    String name = "홍길동";
    String gender = "남";

    public void gait()  {
        System.out.println("팔자걸음");
    }
}

class B {
    A a22 = new A();


}
public class Ex25_2_포함 {
    public static void main(String[] args) {
        B b = new B();
        b.a22.gait();
    }
}










