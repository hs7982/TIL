package ch2_객체지향.Ex27_1_접근제한자;

/*
    (상속 개념부터 알고 와야함)

    - 접근 제어자 / 접근 제한자
        접근제한자란?
            접근제한자는 변수, 메서드, 생성자에 대한 접근 권한을 지정하는 역할을 함.
            클래스의 외부에서 클래스 내부의 멤버 변수, 메서드, 생성자에 접근할 수 있는지 여부를 지정하는 키워드임.
            객체의 속성들에 대한 잘못된 접근을 막기 위해 사용된다.

    - 접근 제어자 종류
        **1) private: 같은 클래스 내부에서만 접근 가능 (외부 클래스, 상속관계인 클래스 에서도 접근 불가)
        2) default: 같은 패키지 내부에서만 접근 가능함 (상속관계여도 다른 패키지에 있으면 접근 불가)
        3) protected: 같은 패키지나 상속관계의 클래스 에서는 접근 가능
        **4) public: 클래스의 내외부 어디서든 접근 가능

        *public, private 만 오지게 쓸거임

 */
public class Ex27_1_접근제한자 {
    private String pri = "private";
    /*default*/ String def = "default";
    protected String pro = "protected";
    public String pub = "public";

    public void printMembers() {
        System.out.println(pri); // OK
        System.out.println(def); // OK
        System.out.println(pro); // OK
        System.out.println(pub); // OK
    }
}
class SS1 {
    public static void main(String[] args) {
        Ex27_1_접근제한자 tmp = new Ex27_1_접근제한자();
        tmp.printMembers();

//        System.out.println(tmp.pri); // 에러. private은 같은 클래스 에서만 쓸 수 있음
        System.out.println(tmp.def);
        System.out.println(tmp.pro);
        System.out.println(tmp.pub);
    }
}