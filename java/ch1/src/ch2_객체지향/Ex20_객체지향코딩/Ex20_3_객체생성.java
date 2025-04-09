package ch2_객체지향.Ex20_객체지향코딩;

/** 할거: 클래스를 이용해서 객체(인스턴스)를 생성할거임
 *       (중요한 부분 '한개의 클래스를 가지고' 어떻게 '여러개의 객체를 생성하는지' 봐야함)
 *
 *  - 객체 생성 방법
 *      클래스명 변수명 = new 클래스명()
 *      ex) Phone p = new Phone();
 *          해설: 변수 p 는 참조변수
 *               new 연산자를 이용해서 Phone 객체를 생성 한 후, p 에 객체의 주소값을 저장
 */

/** phone 클래스를 만들고, 메인 클래스에서 phone 클래스의 객체를 생성할거임
 * (생성시 각각 다른 속성값들을 갖도록 만들거임 - 갤럭시, 아이폰, 노키아....) */
class Phone {
    //회사
    private String brand;

    //모델
    private String model;

    //색상
    private String color;

    //크기
    private String size;

    //전화
    void call(String msg) {
        System.out.println(msg);
    }

    //문자
    void txt(String msg) {
        System.out.println(msg);
    }

    public Phone() {
    }

    public Phone(String brand, String model, String color, String size) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

public class Ex20_3_객체생성 {
    public static void main(String[] args) {
        //삼성 - 생성자로
        Phone gal25 = new Phone("삼성", "갤럭시s25", "블랙", "5.2인치");

//        System.out.println(brand()); //brand가 private 이기 때문에 직접 가져올 수 없음.
        System.out.println(gal25.getBrand()); //getter을 이용해 가져옴
        System.out.println(gal25.getModel());
        System.out.println(gal25.getColor());
        System.out.println(gal25.getSize());
        System.out.println(gal25.toString()); // toString: 생략 가능. 해당 객체가 가지고 있는 필드값들을 편하게 볼 수 있음.

        System.out.println("==========");

        //아이폰 - setter
        Phone iPhone16 = new Phone();
        iPhone16.setBrand("애플");
        iPhone16.setModel("iPhone16");
        iPhone16.setColor("실버");
        iPhone16.setSize("4.2인치");

        System.out.println(iPhone16.getBrand());
        System.out.println(iPhone16.getModel());
        System.out.println(iPhone16.getColor());
        System.out.println(iPhone16.getSize());
        System.out.println(iPhone16);

    }
}
