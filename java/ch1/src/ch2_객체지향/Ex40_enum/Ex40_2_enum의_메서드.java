package ch2_객체지향.Ex40_enum;

/*
== enum 메서드 ==
    1) values(): 모든 원소를 순서대로 리턴
    2) valueOf(매개변수): 매개변수와 enum 에서 일치하는 이름을 갖는 원소 리턴
                        (없으면 IllegalArgumentException 예외 발생함)
    3) ordinal(): enum 에 정의된 index 번호 리턴
                  자주 사용 안하는걸 추천
 */
public class Ex40_2_enum의_메서드 {
    public static void main(String[] args) {
        /* 1) values(): 모든 원소를 순서대로 리턴 */
        for (CafeMenu2 item : CafeMenu2.values()) {
            System.out.println("value: " + item);
        }
        System.out.println("");

        /* 2) valueOf(매개변수): 매개변수와 enum 에서 일치하는 이름을 갖는 원소 리턴 */
        System.out.println(CafeMenu2.valueOf("초코라떼")); // OK
        //System.out.println(CafeMenu2.valueOf("계란초밥")); // 에러

        CafeMenu2 cf2 = CafeMenu2.아메리카노;
        System.out.println(cf2.ordinal()); // 1
    }
}
enum CafeMenu2 {
    초코라떼,
    아메리카노,
    바닐라라떼
}