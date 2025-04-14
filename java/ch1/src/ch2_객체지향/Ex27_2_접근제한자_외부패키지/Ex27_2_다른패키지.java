package ch2_객체지향.Ex27_2_접근제한자_외부패키지;

import ch2_객체지향.Ex27_1_접근제한자.Ex27_1_접근제한자;

class Child extends Ex27_1_접근제한자 {
    public static void main(String[] args) {

        Ex27_1_접근제한자 tmp = new Ex27_1_접근제한자();
        //System.out.println(tmp.pro); // 에러. 상속꺼가 아니라 tmp꺼임.
        System.out.println(tmp.pub);

        //System.out.println(pro); // 에러. 이 메서드가 static 이면 Ex27_1_접근제한자 가 메모리에 올라가기 전에 먼저 동작하기 때문에 못잡음
    }

    public void printMembers() {
//        System.out.println(pri);
//        System.out.println(def);
        System.out.println(pro);
        System.out.println(pub);
    }
}


public class Ex27_2_다른패키지 {
    public static void main(String[] args) {
        Ex27_1_접근제한자 tmp = new Ex27_1_접근제한자();

        //        System.out.println(tmp.pri); // 에러. private은 같은 클래스 에서만 쓸 수 있음
        //System.out.println(tmp.def); // 에러. 같은 패키지 안에서만 사용 가능하기 때문
        //System.out.println(tmp.pro); // 에러. 다른 패키지이면서 자식클래스가 아니라서
        System.out.println(tmp.pub); // OK
    }
}
