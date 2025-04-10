package ch2_객체지향.Ex24_생성자;

/** 할일: this 와 this() 의 차이 알아보기 
 *
    this 는 인스턴스 변수와 매개변수의 이름이 같은 경우 인스턴스 변수 앞에 붙여서 구분할 수 있게 해준다.

    this() 는 '같은 클래스'의 다른 생성자를 호출할때 사용함
               (블로그나 책에는 클래스 상관 없이 메서드를 호출할때 사용한다 라고 하지만 잘못된 말임.
                생성자 호출할때만 사용함)

 */
class Car {
    String color;   // 색상
    String gearType;// 변속기 종류 - auto, manual
    int door;       // 문의 개수

    Car() {
        this("white","auto",4);
    }
    Car(String color) {
//        this.color = color;
        this(color,"auto",4);
    }
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}
public class Ex24_2_생성자에서_다른생성자_호출 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1);

        Car c2 = new Car("red");
        System.out.println(c2);

        Car c3 = new Car("red", "auto", 2);
        System.out.println(c3);
    }
}












