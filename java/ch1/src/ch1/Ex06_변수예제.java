package ch1;

/* 할일: 변수의 사용법을 읽혀보자
    equals : Object 클래스에 들어있는 메서드.
             보통 문자열(String) 비교할때 사용
             값만 비교
    == : 주소값 비교
         primitive type 비교 할때는 그냥 값 비교
         reference type 비교 할때는 주소값 비교

 */
public class Ex06_변수예제 {
    public static void main(String[] args) {
        int i= 10;
        long l = 100;
        float f = 100.0f;

        System.out.println("i + l: " + (i + l)); // 110
        System.out.println("i + f: " + (i + f)); // 110.0

        char a = 'A';
        char c = 'A';
        System.out.println(c);
        System.out.println(c + i); // 75
        // '문자형'(char) 과 '문자열형'(String)은 다름
        // char(16bit = 2byte) 보다 int(32bit = 4byte) 가 더 크기 때문에
        // 둘이 + 로 붙으면 A가 정수형 65로(아스키코드) 변환되서 10 과 더해진다. 그래서 결과는 75
        
        System.out.println(a + c); // 130 // 여기서도 65 + 65 임
        System.out.println("" + a + c); // AA // 문자로 나오게 하려면 애시당초 문자형이 되도록 맨 앞에 "" 추가하면 됨
        //System.out.println('' + a + c); 이건 안됨

        String s1 = "A";
        System.out.println(s1 + c); // AA
        System.out.println(s1 + i); // A10
        System.out.println("//////////////////////////////////");

        // 참조자료형
        String txt1 = new String("HELLO");
        String txt2 = txt1;
        System.out.println(txt1); // HELLO
        System.out.println(txt2); // HELLO
        System.out.println(txt1 == txt2); // true
        System.out.println(txt1.equals(txt2)); // true. // 이제부터 문자열 비교는 == 가 아니라 equals 로 하기

        String txt3 = "HELLO";
        System.out.println(txt1 == txt3); // false
        System.out.println(txt1.equals(txt3)); // false
        // txt1은 객체로 만들어진 참조자료형(heap 영역에 저장)
        // txt3은 리터럴한 값을 가지고이 있는 일반형(heap 안의 string pool 영역에 저장)
        // 애시당초 생긴것만 같고 남남임.

        String txt4 = new String("HELLO");
        System.out.println(txt1.equals(txt4)); // true
        System.out.println(txt1 == txt4); // false
        // txt1과 txt4 다 heap 에 저장되는건 같지만
        // 둘 다 new 로 따로따로 생성한거기 때문에 남남임
    }
}




















