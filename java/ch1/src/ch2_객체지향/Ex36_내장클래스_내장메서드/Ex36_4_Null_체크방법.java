package ch2_객체지향.Ex36_내장클래스_내장메서드;

import java.util.Objects;

/*  null 체크하는 방법
    1) == 이용하는 방법
    2) Objects.isNull() : 해당 객체가 널인지 확인해서 null이면 true, 아니면 false 리턴
    3) Objects.nonNull() : isNull 과 반대. null 이면 false, 아니면 true
    4) Objects.equals(a,b) : Object 클래스에는 equals 라는 메서드가 있고 그 안에 null 을 체크해주는 기능이 이미 있다.
                            그래서 별도로 null 체크 할 필요 없이 a, b 두 값을 비교할 수 있다.
 */
public class Ex36_4_Null_체크방법 {
    public static void main(String[] args) {
        String s1 = null;
        System.out.println(s1 == null);
        System.out.println(Objects.isNull(s1)); // null이면 true, 아니면 false 리턴

        String s2 = "dd";
        System.out.println(Objects.equals(s1, null)); // true
        System.out.println(Objects.equals(s2, null)); // false

        // System.out.println(s1.equals(s2)); // 앞에 null 이 들어가면 터짐
        System.out.println(s2.equals(s1)); // 여기처럼 순서를 바꾸거나 아니면 위에 있는 Objects.equals 사용할것

    }
}
