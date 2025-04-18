package ch2_객체지향.Ex35_예외처리;

/*  throws 를 이용해서 try catch 대신 메서드 선언부에 예외를 선언해놓을수 있다.
    (예외 던지기)

 */

public class Ex35_2_메서드에_예외_선언 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            method1();
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("끗");
        }
        System.out.println(2);
    }
    static void method1() throws Exception {
        System.out.println(3);
        method2();
        System.out.println(4);
    }
    static void method2() throws Exception {
        System.out.println(5);
        throw new Exception();
    }

    @Override
    public String toString() {
        return "Ex35_2_메서드에_예외_선언{}";
    }
}
