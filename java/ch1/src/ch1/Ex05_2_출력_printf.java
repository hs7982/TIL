package ch1;

/*
    할일: printf 를 이용해서 출력하기
        (format 을 정해놓고 출력)

    * println 과 printf 의 차이
    1) println - 실수 형태에서 소수점 자리수가 끝까지 다 출력됨
                 (소수점을 특정 위치에서 자르려면 Math 클래스를 이용하면 됨)

    2) printf - 원하는 소수점 자리수로 끊어서 출력할 수 있다.
                (대신 자동 줄바꿈 안됨. %n 또는 \n 로 따로 해야함)
                포멧을 미리 정해놓고 필요한 값들을 가져다 쓰면서 구문을 완성함
        ex) int num = 10;
            System.out.printf("정수1: %d%n", num );
            *해설: 문자열 "정수1:" 을 찍고 그 바로 뒤에 정수형태인 num 변수 안에 있는 값을 가져와서 %d 자리에 넣는다

    (다 알필요는 없고 %d, %f, %s 3개는 무조건 기억)
        %b: boolean
        %d: 10(decimal)진수 정수 형태로 출력
        %o: 8(octal)진수 정수 형태로 출력
        %x, %X: 16(hexa)진수 정수 형태로 출력
        %f: 부동 소수점 형식으로 출력 (double 이어오 %f로 해야함)
        %e, %E: 지수 표현식의 형태으로 출력
        %c: 문자 한개
        %s: 문자열(문자 여러개)

 */
public class Ex05_2_출력_printf {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("정수1: " + num);
        System.out.printf("정수2: %d%n", num ); // 결과 10
        System.out.printf("정수3: [%5d] %n", num ); // 결과 [   10]
                                                    // [] 안에 있는 숫자는 자리수를 뜻함. 기본 우측정렬
        System.out.printf("정수4: [%-5d] %n", num ); // 결과 [10   ]
                                                    // - 인 경우 왼쪽 정렬
        System.out.println("=============");

        float f = 123.4567890f;
        System.out.printf("실수1: %f%n", f); // 결과: 실수1: 123.456787
                                            // float 은 정밀도가 7자리, double은 15 자리까지 정확함
        double d = 123.4567890;
        System.out.printf("실수2: %f%n", d); // 결과: 실수2: 123.456789

        System.out.printf("소수점1: [%.2f]%n", d); // 결과: [123.46]
                                                  // .2 인 경우 소수전 2번째 까지 보여줌. 3번째 자리꺼 반올림함.
        System.out.printf("소수점2: [%10.2f]%n", d); // 결과: [    123.46]
                                                    // [%10.2f] 에서 10은 소수점을 포함한 총 자리수 를 뜻함.
                                                    // 우측정렬
        System.out.printf("소수점2: [%-10.2f]%n", d); // 음수인 경우 좌측 정렬
        System.out.println("=============");

        char c = 'A';
        System.out.printf("문자1: %c%n", c); // 결과: 'A'. 문자의 경우 %c로 해도 되는데
        System.out.printf("문자2: %s%n", c); // 결과: "A". String을 뜻하는 %s로도 한글자가 커버 되기 때문에 %s 사용해도 되긴 함

        String str = "ABC";
        System.out.printf("문자열: %s%n", str);


        System.out.println("===============================================");
        System.out.println("자바에서 소수점을 반올림해서 원하는 자리수 얻는 방법");

        double d2 = 123.4567890;
        long test = Math.round(d2); // Math 의 리턴은 정수(long)
//        System.out.println(test); // 결과: 123
        // Math.round는 소수점 첫째자리 기준으로 반올림


        System.out.println(Math.round(123.4567890  * 100));// 123.4567890 => 12346
        System.out.println(Math.round(123.4567890  * 100) / 100.0);// 123.4567890 => 123.46

        double result = Math.round(d2 * 100) / 100.0;  // 123.4567890 => 12345 => 123
        System.out.println("result: " + result); // 결과: 123.46
        
    }
}

















