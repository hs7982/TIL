package ch2_객체지향.Ex39_컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collections;

/*
= ArrayList =
    - 생성 방법
        1) List<타입 파라미터> 객체명 = new ArrayList<타입 파라미터>(초기 저장용량)
        2) ArrayList<타입 파라미터> 객체명 = new ArrayList<타입 파라미터>(초기 저장용량)
        
        위 두가지 방법이 있는데 ArrayList에만 있는 메서드를 사용할게 아니라면 List를 사용하는게 더 좋다
        이유는 ArrayList 처럼 List 인터페이스로 구현한 클래스가 더 있는데(LinkedList)
        2번처럼 자료형을 ArrayList로 해버리면 변수를 재활용 할 수가 없다.
        ex) ArrayList<String> tmp = new ArrayList<>();
            tmp = new LinkedList<String>(); <<== 에러남

= 사용 가능한 메서드 =
    1) ArrayList(): 크기가 0인 ArrayList 생성
    2) add(데이터): ArrayList 의 마지막 방으로 추가
    3) add(방번호, 데이터): 특정 방에 데이터 추가. (기존것들은 뒤로 한칸씩 밀림)
    4) get(방번호): 해당 방번호꺼 데이터 읽기
    5) remove(방번호): 해당 방번호 데이터 삭제
    6) addAll(데이터): 모든 객체를 저장
    7) addAll(방번호, 데이터): 지정된 방번호부터 저장(이걸 돌리려면 '방번호' 만큼 기존 ArrayList에 자료가 들어있어야 함)
    8) set(방번호, 데이터): 해당 방에 데이터 변경
    9) clear(): ArrayList 내용 전체 삭제
    10) clone(): ArrayList 복제
    11) contain(Object o): 지정된 객체가 ArrayList에 포함되어 있는지 확인
    12) size(): ArrayList 의 방 개수
 */
public class Ex39_2_ArrayList클래스 {
    public static void main(String[] args) {
        /* 1) ArrayList() */
        ArrayList<String> fruit = new ArrayList<>();

        /* 2) add(데이터) */
        fruit.add("banana");
        fruit.add("apple");
        fruit.add("Melon");
        System.out.println(fruit);

        /* 3) add(방번호, 데이터) */
        fruit.add(1, "lemon");
        System.out.println(fruit);

        /* 4) get(방번호): 해당 방번호꺼 데이터 읽기 */
        //System.out.println(fruit.get(1));
        for (int i = 0; i < fruit.size(); i++) {
            System.out.println(fruit.get(i));
        }

        /* 5) remove(방번호): 해당 방번호 데이터 삭제 */
        fruit.remove(1);
        System.out.println(fruit);

        /* 6) addAll(데이터): 모든 객체를 저장 - 깊은복사 */
        ArrayList<String> newFruit = new ArrayList<>();
        newFruit.addAll(fruit);
        System.out.println("fruit: " + fruit); //  [banana, apple, Melon]
        System.out.println("newFruit: " + newFruit); // [banana, apple, Melon]

        /* 7) addAll(방번호, 데이터): 지정된 방번호부터 저장(이걸 돌리려면 '방번호' 만큼 기존 ArrayList에 자료가 들어있어야 함) */
        ArrayList<String> newFruit2 = new ArrayList<>();
        newFruit2.add("test"); // 1번 방부터 fruit 꺼가 들어갈거기 때문에 적어도 0번방은 알아서 내가 채워줘야함. 이거 안하면 에러
        newFruit2.addAll(1, fruit);
        System.out.println("fruit: " + fruit); // [banana, apple, Melon]
        System.out.println("newFruit2: " + newFruit2); // [test, banana, apple, Melon]

        /* 8) set(방번호, 데이터): 해당 방에 데이터 변경 */
        fruit.set(0,"버내너");
        System.out.println("fruit: " + fruit);
        System.out.println("newFruit: " + newFruit);
        System.out.println("newFruit2: " + newFruit2);

        /* 9) clear(): ArrayList 내용 전체 삭제 */
        newFruit2.clear();
        System.out.println("fruit: " + fruit);
        System.out.println("newFruit: " + newFruit);
        System.out.println("newFruit2: " + newFruit2);

        /* 10) clone(): ArrayList 복제 */
        newFruit2 = (ArrayList<String>) fruit.clone();
        System.out.println("clone: " + newFruit2);

        /* 11) contain(Object o): 지정된 객체가 ArrayList에 포함되어 있는지 확인 */
        System.out.println(fruit.contains("orange")); // false
        System.out.println(fruit.contains("버내너")); // true

        // ------------------------------------------------------------------------
        // == 정렬 == 
        // 대문자 > 소문자
        System.out.println("newFruit11: " + newFruit); // [banana, apple, Melon]
        Collections.sort(newFruit); // 대소문자 구분 하면서 정렬
        System.out.println("newFruit22: " + newFruit); // [Melon, apple, banana]

        Collections.sort(newFruit, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 없이 asc 정렬
        System.out.println("newFruit33: " + newFruit); // [apple, banana, Melon]

        Collections.sort(newFruit, Collections.reverseOrder()); // 대소문자 구분 없이 desc 정렬
        System.out.println("newFruit44: " + newFruit); // [banana, apple, Melon]

        Collections.sort(newFruit, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); // 대소문자 구분 없이 asc 정렬
        System.out.println("newFruit55: " + newFruit);

    }
}
















