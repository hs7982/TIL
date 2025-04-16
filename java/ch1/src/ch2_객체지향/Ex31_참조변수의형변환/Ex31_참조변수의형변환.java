package ch2_객체지향.Ex31_참조변수의형변환;

/** 할일: 참조변수도 형변환(캐스팅)이 가능함
 주의: 상속 관계에서 자손 참조변수에 조상객체를 저장할수 없음.
 (캐스팅 하더라도 코드상 에러는 안나지만 컴파일시 에러남
 그래서 instanceof 를 이용해서 캐스트를 할 수 있는지 판별 하고 진행할것)
 */

class Car {
    String color = "White";
    String gearType = "Auto";
    int door = 5;
    int maxSpeed = 180;
}
class SportCar extends Car {
    int door = 2;
    int maxSpeed = 380;
}
class Bongo extends Car {
    int door = 4;
    int maxSpeed = 150;
}


public class Ex31_참조변수의형변환 {
    public static void main(String[] args) {
        SportCar sc = new SportCar();
        Car c1 = (Car) sc; // (sc)자식은 부모에 들어갈 수 있음
        Car c2 = sc; // (sc)자식은 부모에 들어갈 수 있음
        // c1처럼 별도의 형변환(캐스팅)을 하지 않아도 알아서 형변환 되서 들어감
        Car c3 = (Car)(new SportCar());

        // ------------------------------
        Car c4 = new Car();

        //SportCar sc4 = (SportCar) c4; // 에러.
        // 캐스팅은 되지만 실제로 돌리면 에러남
        // 그래서 instanceof 를 이용해서 캐스팅 가능한지 확인 하고 돌리기
        // 사용법: 확인할변수 instanceof 캐스팅할_클래스명
        //      ex) c3 instanceof SportsCar

        SportCar sc4 = new SportCar();
        System.out.println(sc4 instanceof Car); // true
        System.out.println(c4 instanceof SportCar); // false

        if(c4 instanceof SportCar) { // false 밖에 안나옴
            SportCar sc5 = (SportCar) c4;
            System.out.println("여기 들어올 일이 없음");
        }


        System.out.println();

    }
}
