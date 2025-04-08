package ch1;

/*
    할일: 자료의 형변환 알기
        형변환(casting)
        
        boolean 형을 제외한 모든 자료는 형변환 가능 (다만 숫자를 문자열로 변환 하는건 조금 다르게 해야함)
            1) '자동 형변환' 과
            2) '캐스팅 작업을 별도로 해야 하는 형변환' 이 있다.
            
        - 변환 방법
            1) 숫자 -> 다른 숫자형 으로 바꿀때
                 ex) double d = 3.14;
                     int i = d; // 이렇게 하면 결과는 3 만 나옴
            2) 숫자 -> 문자 로 바꿀때
                 ex) String.valueOf(숫자)
          
        - 자료형 확인
            기본형은 타입 확인이 안되고 참조형만 가능
            (자바스크립트의 typeof 처럼 '자료형은 뭐다' 이런게 없다.
            자바에서는 '이 데이터가 이거냐?' 처럼 물어보면 true / false 로 대답 해줄뿐임.
            
            ex) 데이터 instanceof 자료형

 */
public class Ex08_형변환 {
    public static void main(String[] args) {
        System.out.println("== 자동 형변환 ==");
        int i = 10;
        double d = i; // int를 double 에 넣는건 가능
        System.out.println("d: " + d); // 결과: 10.0
        /* 정수 10 이 double 에 들어가면서 10.0 이라는 double 형으로 변환 */

        String s = "홍길동";
        System.out.println(s + i + 10); // 결과: 홍길동1010
        /* 여기서는 i(10) 가 자동으로 문자형으로 변환 */

        System.out.println(s + d + 10); // 결과: 홍길동10.010
        /* 여기서는 d(10.0) 가 자동으로 문자형으로 변환 */


        System.out.println("== 수동 형변환 ==");
        // 정수 -> 문자
        int num = 65;
        char ch = (char)num; // 정수형 num 을 char 형으로 다운캐스팅 한거임
        System.out.println(ch); // 결과: A (아스키코드상 65는 문자 A 이기 때문)
        
        // 문자 -> 정수
        char ch2 = 'A';
        System.out.println((int)ch2 + 10); // 75
        System.out.println((double)ch2 + 10); // 75.0

        // 실수 -> 정수
        double d2 = 3.14;
        int i2 = (int) d2;
        System.out.println(i2); // 3

        // 실수 -> 실수
        /* double 에서 float 으로 갔다가 다시 double로 돌아가면 값이 변한다
            이유는 변환될 10진수 였던 숫자를 2진수로 변환한 후 특정 자리수를 넘어가면 0으로 변환되기 때문
            ex) 10011001111111 => 10011001110000
         */
        double d3 = 3.141592653589793238462643338327950288619716;
        System.out.println(d3); // 3.141592653589793

        float f2 = (float) d3;
        System.out.println(f2); // 3.1415927

        d3 = f2;
        System.out.println(d3);
        
        ///////////////////////////////////////////
        
        // 숫자 -> 문자
        // 두가지 방법이 있다. 1) String.valueOf(숫자);  2) Integer.toString(숫자);
        System.out.println("== 숫자를 문자로 ==");
        String s1 = String.valueOf(100.01); // 정수 실수 모두 가능
        System.out.println(s1);
        System.out.println(s1 instanceof String);

        s1 = Integer.toString(100); // 정수만 가능. 실수 안됨
        String s2 = Double.toString(100.0); // 실수만 가능
        System.out.println(s1 + ", " + s2);

        // 문자 -> 숫자
        int num2 = Integer.parseInt("100");
        System.out.println("num2: " + num2);

        double num3 = Double.parseDouble("100.1");
        System.out.println("num3: " + num3);


    }
}













