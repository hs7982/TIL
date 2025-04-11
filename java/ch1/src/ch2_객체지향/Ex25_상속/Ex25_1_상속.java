package ch2_객체지향.Ex25_상속;

/*
    - 상속이란
        새로운 클래스를 정의할때 이미 구현되어 있는 클래스를 상속받아서 그 속성이나 기능을 확장해서 새 클래스를 구현한다.
        (생성자, 초기화 블록은 상속 안됨)
        * 단일상속만 가능(부모 여러개 안됨)
        * 만약 부모가 누군가를 상속하고 있는 상황이면 그 자식은 조상꺼까지 다 받게 됨
        * 자식이 변경되면 부모는 영향을 받지 않지만, 부모(조상) 코드가 변경되면 자식은 100% 영향을 받음

        부모클래스: 상위 클래스, super class, base class
        자식클래스: 하위 클래스, child class, sub(derived) class

    - 상속 문법
        class Parent {}

        class Child extends Parent {}



 */

class Parent {
    int eyes = 2;
    int nose = 1;
    int mouse = 1;
    String race = "황인종";
    String name = "홍길동";
    String gender = "남";

    public Parent() {
        System.out.println("부모 생성됨");
    }
    public Parent(String tmp) {
        System.out.println("부모 tmp");
    }

    public void gait() throws NullPointerException {
        System.out.println("팔자걸음");
    }
    @Override
    public String toString() {
        return "Parent{" + "eyes=" + eyes +", nose=" + nose +", mouse=" + mouse +", race='" + race + '\'' +", name='" + name + '\'' +", gender='" + gender + '\'' +'}';
    }
}

class Child extends Parent  {
    // 상속을 받으면 실제로는 여기 없지만 아래처럼 있는거로 인식함
//    int eyes = 2;
//    int nose = 1;
//    int mouse = 1;
//    String race = "황인종";
//    String name = "홍길동";
//    String gender = "남";
//
//    public void gait() {
//        System.out.println("팔자걸음");
//    }
//    @Override
//    public String toString() {
//        return "Parent{" + "eyes=" + eyes +", nose=" + nose +", mouse=" + mouse +", race='" + race + '\'' +", name='" + name + '\'' +", gender='" + gender + '\'' +'}';
//    }

}

class Child2 extends Parent {
    int ears = 2;
    String name = "홍순자";
    String gender = "여";

/* 오버라이딩 - 상속받은 메서드의 내용을 정리하는것
    - 조건
        1) 선언부의 반환타입, 이름, 매개변수 모두 동일해야함
            (구현부 내맘대로)
        2) 접근제어자는 조상의 범위보다 크거나 같게 해야함
            (public > protected > defalut > private)
        3) 조상 클래스의 메서드 보다 많은 수의 예외를 선언할 수 없다
           ex) 조상: public void gait() throws IOException, SQLExcaption {}
               자식: public void gait() throws IOException
    
 */
    public void gait() {
        System.out.println("바른걸음");
    }

    @Override
    public String toString() {
        return "Child2{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", eyes=" + eyes +
                ", nose=" + nose +
                ", mouse=" + mouse +
                ", ears=" + ears +
                ", race='" + race + '\'' +
                '}';
    }
}

class GrandChild extends Child2 {
    private String name = "";
    private String gender = "";
    private String race = "흑인종";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return "손주{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", eyes=" + eyes +
                ", nose=" + nose +
                ", mouse=" + mouse +
                ", ears=" + ears +
                ", race='" + race + '\'' +
                '}';
    }
}


public class Ex25_1_상속 {
    public static void main(String[] args) {
        // Child에 아무것도 없는 상태에서 인스턴스화 하면 어떻게 될지 확인하기
        Child c1 = new Child(); // Child 객체 생성
        System.out.println("이름: " + c1.name); // c1 에는 name에 관련된 변수가 없기 때문에 부모꺼 사용
        System.out.println("눈: " + c1.eyes);
        System.out.println("코: " + c1.nose);
        System.out.println("입: " + c1.mouse);
        System.out.println("성별: " + c1.gender);
        c1.gait(); // c1에서 새롭게 gait 를 선언한적 없기 때문에 부모꺼 사용
        System.out.println(c1);

        System.out.println("------------------------");
        Child2 c2 = new Child2();
        System.out.println("이름: " + c2.name);
        System.out.println("눈: " + c2.eyes);
        System.out.println("코: " + c2.nose);
        System.out.println("입: " + c2.mouse);
        System.out.println("귀: " + c2.ears); // c2 자체적으로 ears 를 선언했긴 때문에 자기꺼 사용. 
        System.out.println("성별: " + c2.gender);
        c2.gait();
        System.out.println(c2);


        System.out.println("------------------------");
        GrandChild gc1 = new GrandChild();
        gc1.setName("마이클장"); // 상속 받았기 때문에 name 속성의 값이 들어가는 있지만, 자체적으로 세팅 했기 때문에 자기꺼 사용
        gc1.setGender("남");

        System.out.println(gc1);

    }
}




























