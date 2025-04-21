package ch2_객체지향.Ex39_컬렉션프레임워크;

import java.util.HashSet;
import java.util.Iterator;

/*
== Set 인터페이스 ==
    Set 인터페이스 는 저장순서 유지하지 않음.
    요소의 중복 허용 금지.

    추가: add / addAll
        이미 저장된 요소를 또 추가하려고 하면 false 반환해서 실패함
    삭제: remove(값)
         clear();
 */
public class Ex39_3_HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("연어초밥");
        set.add("참치 대뱃살");
        set.add("광어묵은지");
        set.add("계란초밥");
        set.add("타코와사비군함");
        set.add("계란초밥");

        // 출력
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(set); // [타코와사비군함, 참치 대뱃살, 연어초밥, 광어묵은지, 계란초밥]
                                 // [타코와사비군함, 참치 대뱃살, 연어초밥, 광어묵은지, 계란초밥]


        // 요소에 값 검색
        System.out.println("contains: " + set.contains("계란초밥")); // true


        // 삭제
        set.remove("광어묵은지");
        System.out.println("remove: " + set);

        set.clear();
        System.out.println("clear: " + set);


    }
}
