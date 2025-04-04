package ch1;

/*
    출력 할때는 System.out.println();를 사용한다.
    sout 치면 알아서 쳐줌


 */
public class Ex_05_1_출력_println {
    public static void main(String[] args) {
        System.out.println(100);
        System.out.println("100");

        System.out.println(100+100);
        System.out.println(100+"100");
        System.out.println("100"+100);
        System.out.println("100"+"100");

        System.out.println(100+100+"100");
        System.out.println("100"+100+100);
        System.out.println("100"+(100+100));
        System.out.println((100+100)+"100");

//        주의! js, c, c++ 계열에서는 true가 1로 자동 형변환 되어 101이 출력되지만,
//        자바에서는 걍 에러남!
//        System.out.println(100+true);
    }
}
