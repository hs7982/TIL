package ch2_객체지향.Ex27_1_접근제한자;

public class Ex27_2_같은패키지 {
    public static void main(String[] args) {

        Ex27_1_접근제한자 tmp = new Ex27_1_접근제한자();
        
//        System.out.println(tmp.pri); // 에러. private은 같은 클래스 에서만 쓸 수 있음
        System.out.println(tmp.def); // OK
        System.out.println(tmp.pro); // OK
        System.out.println(tmp.pub); // OK
    }
}
 