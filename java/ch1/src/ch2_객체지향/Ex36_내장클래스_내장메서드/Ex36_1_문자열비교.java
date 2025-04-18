package ch2_객체지향.Ex36_내장클래스_내장메서드;

/*  자바에서 문자열 비교시 == 가 아니라 equals() 메서드를 써야 함.
    이유는 == 는 주소값을 비교하고
    equals() 는 내용 자체의 값을 비교하기 때문임.
        사용법: 문자열1.equals(문자열2)

    문자열을 할당하는 방법은 두가지가 있다.
        1) 변수에 값을 직접 할당 => ex) String s = "JAVA";
        2) 인스턴스 생성하기 => ex) String s1 = new String("JAVA");

    인스턴스를 생성하게 되면 heap 영역에 저장되는데, 힙 영역안의 String Pool 이라는 영역이 따로 있다.
    1) 리터럴한 방식을 사용하게 되면 heap의 String Pool 영역에 저장됨
        만약 같은 값을 여러 변수들에 저장하면, 같은 주소값을 공유할뿐 새로 값을 String Pool 에 생성하지 않는다.
    2) new 를 이용해서 String 생성하면 그냥 heap 영역에 생성(저장)된다. 끝

    
    String 클래스의 equals() 는 모든 객체의 부모 클래스인 Object 에 정의되어 있는 메서드임.

    

 */
public class Ex36_1_문자열비교 {
    public static void main(String[] args) {
        String a = "안녕하세요";
        String b = "안녕하세요";

        String c = new String("안녕하세요");
        String d = new String("안녕하세요");

        System.out.println(a == b); // true
        System.out.println(b == c); // false
        System.out.println(c == d); // false

        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(c)); // true
        System.out.println(c.equals(d)); // true

    }
}




















