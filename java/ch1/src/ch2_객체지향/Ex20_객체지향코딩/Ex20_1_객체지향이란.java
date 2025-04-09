package ch2_객체지향.Ex20_객체지향코딩;
/*
    - 객체 지향 (클래스로 만들어놓은 코드를 이용하기 때문에 쉽게 작성하고 유지보수 할 수 있다.)
        1) 코드의 재사용성이 높다
        2) 관리가 쉽다
        3) 중복 제거

    - 핵심 개념
        1) 캡슐화 - 데이터 보호
                   데이터 캡슐화: 필드와 메서드를 하나로 묶는것
                   은닉화: 객체의 세부 내용이 외부에 들어나지 않아서 외부에서 데이터를 직접 접근하지 못하게 방지한다.
        2) 상속 - 코드를 재사용
                부모클래스의 특징과 기능들을 물려받아서 사용
                (부모클래스를 상속 받아서 수정해가면서 사용하기 때문에 중복코드를 줄일수 있다)
                (주의: 부모클래스에 변동이 생기면 자식들도 모두 영향을 받는다)
        *3) 다형성 - 제일 중요
                    하나의 타입에 여러 객체를 대입함
                    오버로딩, 오버라이딩
        4) 추상화 - 핵심적인 코드만 보여주기(불필요한 부분 숨김)
                    객체가 동작해야 하는 핵심적인 역할만 규정해놓고, 실제적인 구현은 각각의 객체에서 함
        5) 인터페이스 - 자바는 다중상속 안됨
                      그러나 다중상속이 필요한 경우가 있기 때문에 인터페이스 라는 일종의 추상클래스를 사용한다.

     - 객체
        현실세계의 모든 사물들을 객체 라고 생각하면 됨.
        예들 들어서 모니터가 있다고 치고, 모니터는 기능, 속성 으로 구분 할 수 있는데
        속성들(색상, 크기, 제조사, 모델명....)은 변수라고 생각하면 되고
        기능들(전원, 스피커, 밝기, 해상도 조절...)은 메서드 라고 생각하면 됨


    - 클래스 (객체 지향에서 제일 중요한 개념)
        여러 모니터들의 공통적인 기능/속성이 있고, 각각의 모니터마다 별도로 가지고 있는 기능/속성들이 있는데
        공통적으로 있는 기능/속성을 한군데로 모아놓은 것을 클래스 라고 한다.
        (추가되는 기능/속성들은 클래스를 상속받아서 자식클래스로 만들면 됨)
 */


class Car {
    private String brand; /* 전역변수(멤버변수) */
    private String model; /* 전역변수(멤버변수) */
    private String color; /* 전역변수(멤버변수) */
    private int door; /* 전역변수(멤버변수) */
    private int maxSpeed; /* 전역변수(멤버변수) */

    //public Car() { } /* 기본 생성자 - 생략 가능 */

    public Car(String brand, String model, String color, int door, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.door = door;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    void go() { /* 메서드 */
        String txt = "출발"; /* 지역변수 */
        System.out.println(txt);
    }
    void stop() { /* 메서드 */
        String txt = "멈춤"; /* 지역변수 */
        System.out.println(txt);
    }
}

public class Ex20_1_객체지향이란 {
    public static void main(String[] args) {
        Car sonata = new Car("현대", "쏘나타", "red", 4, 200);

        System.out.println(sonata.getBrand());
        System.out.println(sonata.getModel());
        System.out.println(sonata.getColor());
        System.out.println(sonata.getDoor());
        System.out.println(sonata.getMaxSpeed());

        sonata.go();
        System.out.println("=========================");

        Car benz = new Car("벤츠","S","black",2,250);

        System.out.println(benz.getBrand());
        System.out.println(benz.getModel());
        System.out.println(benz.getColor());
        System.out.println(benz.getDoor());
        System.out.println(benz.getMaxSpeed());

    }
}