package ch1;

import java.util.Arrays;
import java.util.Collections;

public class Ex19_배열용_메서드 {
    public static void main(String[] args) {
    /* 1) toString()
            모든 자바 Object 에 포함되어 있는 메서드
            배열 자체를 System.out.println() 같은곳에서 출력하면 데이터가 출력되지 않고 오브젝트의 id 이 출력됨
            Arrays.toString() 를 이용하면 안에 있는 실제값을 출력할 수 있음

        2) sort()
            배열의 원소들을 정렬
                sort(배열, Comparator)
                sort(배열, int fromIdx, int toIdx) 를 이용해서 내림차순 또는 정렬 구간 설정
            기본 정렬은 '대문자 > 소문자'


        3) copyOf() - 깊은복사
            배열을 복사해서 새로운 배열로 반환
            copyOfRange(배열, 몇번째부터, 몇번째꺼 앞까지) 특정 범위만 반환

        4) asList()
            배열을 ArrayList 로 반환함
            (ArrayList 는 크기가 고정되어 있지 않는 배열 같은거)
     */
        String[] cars = {"hyundai", "bmw", "Benz","subaru"};
        System.out.println("기본: " + Arrays.toString(cars)); // [hyundai, bmw, Benz, subaru]
        Arrays.sort(cars); // 알파벳 순
        System.out.println("정렬: " + Arrays.toString(cars)); // [Benz, bmw, hyundai, subaru]

        Arrays.sort(cars, Collections.reverseOrder()); // 역순
        System.out.println("정렬: " + Arrays.toString(cars));  // [subaru, hyundai, bmw, Benz]
        System.out.println("-------------");

        String[] cars2 = {"hyundai", "bmw", "Benz","subaru"};
        System.out.println("기본: " + Arrays.toString(cars2));
        Arrays.sort(cars2, 0, 2); // 0 번쨰꺼부터 2-1 번째꺼까지만 정렬 적용
        System.out.println("정렬: " + Arrays.toString(cars2));


        System.out.println("== copyOf ==");
        // copyOf - 깊은복사, 배열을 추가하거나 삭제할때 사용하기도 함
        // 원본복사
        String[] cars_copy = Arrays.copyOf(cars2, cars2.length); // [bmw, hyundai, Benz, subaru]
        System.out.println(Arrays.toString(cars2));
        System.out.println(Arrays.toString(cars_copy));

        // 원하는 구간만 복사
        String[] cars_copy2 = Arrays.copyOfRange(cars2, 0, 2); // [bmw, hyundai]
        System.out.println(Arrays.toString(cars2));
        System.out.println(Arrays.toString(cars_copy2));
        
        // 복사하면서 새 빈 방을 추가
        String[] cars_copy3 = Arrays.copyOfRange(cars2, 0, 10);
        System.out.println(Arrays.toString(cars2));
        System.out.println(Arrays.toString(cars_copy3));
    }
}














