package ch1;

/*

    - 자료형
        컴퓨터가 이해할 수 있는 값의 형태를 '자료형' 이라고 한다.
        (사람으로 따지면 '문자', '숫자' 같은거임)
        java 에서의 자료형은 기본자료형(Primitive type) 과 참조자료형(Reference type) 으로 구분한다.

        인스턴스를 생성하게 되면 heap 영역에 저장되는데, heap 영역 안에는 String pool 이라는 영역이 따로 있다.
        1) 리터럴한 값(기본자료형)들은 String pool 영역에 저장되서 공유되고, 만약 같은 값을 여러 변수에 저장하면 같은 주소값을 공유할뿐 새로운 값을 생성하지 않는다.
            사용하지 않으면 GC(가비지콜랙터)로 정리
        2) new를 이용해서 생성하면(참조자료형) 그냥 heap 영역에 저장된다.

    1) 기본자료형(Primitive type)
        논리형: boolean (8bit = 1byte)
                기본값: false
        문자형: char, (16bit = 2byte)
                기본값: '\u0000'
                *주의: 따옴표. 문자 하나를 의미
                    (이제부터 쌍따옴표는 String 이라는 자료형을 뜻함)

        정수형
            byte, (8bit = 1byte), -128~127
                기본값 = 0
            short, (16bit = 2byte), -32,768 ~ 32,767
                기본값 = 0
            int, (32bit = 4byte), 약 -21억 ~ 21
                기본값 = 0
                정수형 에서의 기본단위
            long, (64bit = 8byte), 엄청나
                기본값 = 0L

        실수형
            float: (32bit = 4byte)
                    기본값: 0.0f
            double: (64bit = 8byte)
                    기본값: 0.0
                    실수형 에서의 기본단위


2) 참조자료형(Reference type) - 객체의 주소를 저장한다.
        '기본자료형'을 제외한 모든 자료형을 말한다.
        클래스 이름으로 변수 타입을 쓰면 그게 다 참조변수

        클래스이름 변수이름 = new 클래스이름(); // new 뒤의 '클래스이름'은 사실 해당 클래스의 생성자임

        String 이 대표적인 예 이다.
            ex) String s = new String();

    3) 자료형 확인 - 자료형 확인시 Wrapper 클래스 타입으로 된 변수들을 Class 클래스의 getClass() 와 getName() 을 이용해서 함

 */

import java.util.ArrayList;

public class Ex03_자료형 {
    public static void main(String[] args) {
        long num= 10;
        // int num2 = 10L;
        // System.out.println("num: " + num);

        double d = 10;
        System.out.println(num + d);

//        ------------------------------------
        String s1 = "ABC";
        System.out.println(s1.getClass().getName());

        char c = 'A';
        System.out.println(Character.valueOf(c).getClass().getName());

        int i = 100;
        System.out.println(Integer.valueOf(i).getClass().getName());

        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list.getClass().getName());

        char[] arr = new char[3]; // 배열은 자료형 찾기가 안되는건 아닌데 표시될때 실수면 [D, char면 [C, int 면 [i 이런식으로 표시됨
        System.out.println(arr.getClass().getName());
    }
}