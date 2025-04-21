package ch2_객체지향.Ex39_컬렉션프레임워크;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
== Map 인터페이스 ==
    Map: 키, 값으로 구성된 데이터의 집합
        순서없고, 키 중복 안됨, 값은 중복 가능
        *(키가 중복되는 경우, 값만 최근꺼로 덮어씀)
        
        키와 값을 연결하는걸 '매핑' 이라고 함
        큰 사이즈의 데이터를 검색할때 주로 사용
        
== 생성방법 == 
    Map<키 타입, 값> 변수명 = new HashMap<>();
    HashMap<키 타입, 값 타입> 변수명 = new HashMap<>();

    ex) Map<String, Integer> 변수명 = new HashMap<>();
        HashMap<String, Integer> 변수명 = new HashMap<>();


== 사용 가능한 메서드 ==
    1) HashMap<>(): 해쉬맵 생성
    2) put(key, value): map에 value 객체를 key 객체에 연결(mapping) 해서 저장
                        *(키가 중복되는 경우, 값만 최근꺼로 덮어씀)
    3) containsKey(key): Map 에 해당 키랑 일치하는 객체가 있는지 확인. 있으면 true, 없으면 false
    4) containsValue(value): Map 에 해당 값과 일치하는 객체가 있는지 확인. 있으면 true, 없으면 false
    5) entrySet(): key-value 쌍으로 구성된 모든 Map.Entry타입의 객체를 Set에 담아서 리턴
    6) get(key): key 와 매칭되는 value 객체를 찾아서 반환
    7) isEmpty(): 컬렉션이 비어있는지 확인(결과: true, false)
    8) size(): 저장된 key-value 쌍의 총 개수 리턴
    9) keySet(): Map에 저장된 모든 key를 Set에 담아서 리턴
    10) values(): Map에 저장된 모든 value를 Set에 담아서 리턴
    11) remove(): 주어진 key 객체와 일치하는 key-value 객체 삭제
    12) clear(): 모든 Set 삭제
 */
public class Ex39_4_HashMap클래스 {
    public static void main(String[] args) {
        /* 1) HashMap<>(): 해쉬맵 생성 */
        Map<String, Integer> map = new HashMap<>();

        /* 2) put(key, value): map에 value 객체를 key 객체에 연결(mapping) 해서 저장 */
        map.put("빨", 1);
        map.put("주", 2);
        map.put("노", 3);
        map.put("초", 4);
        map.put("파", 5);
        map.put("남", 6);
        map.put("보", 7);

        /* 3) containsKey(key): Map 에 해당 키랑 일치하는 객체가 있는지 확인. 있으면 true, 없으면 false */
        System.out.println("containsKey: " + map.containsKey("초")); // true
        System.out.println("containsKey: " + map.containsKey("검")); // false

        /* 4) containsValue(value): Map 에 해당 값과 일치하는 객체가 있는지 확인. 있으면 true, 없으면 false */
        System.out.println("containsValue:" + map.containsValue(3)); // true
        System.out.println("containsValue:" + map.containsValue("3")); // false

        /* 5) entrySet(): key-value 쌍으로 구성된 모든 Map.Entry타입의 객체를 Set에 담아서 리턴 */
        System.out.println("entrySet: " + map.entrySet()); // 순서가 없으니깐 아무렇게나 들어감

        /* 6) get(key): key 와 매칭되는 value 객체를 찾아서 반환 */
        System.out.println("빨: " + map.get("빨")); // 1
        System.out.println("보: " + map.get("보")); // 7
        System.out.println("검: " + map.get("검")); // null. 없으면 null로 나옴

        /* 7) isEmpty(): 컬렉션이 비어있는지 확인(결과: true, false) */
        System.out.println("isEmpty: " + map.isEmpty()); // false.

        /* 8) size(): 저장된 key-value 쌍의 총 개수 리턴 */
        System.out.println("size: " + map.size()); // 7

        /* 9) keySet(): Map에 저장된 모든 key를 Set에 담아서 리턴 */
        System.out.println("keySet: " + map.keySet()); // [보, 빨, 노, 초, 남, 주, 파]
        /* Map으로 저장하면 키와 값으로만 구성되어 있고 순서대로 호출할수 없기 때문에(iterator 이기 때문)
        * (iterator - 요소들을 순화하면서 끝까지 읽음)
        * */
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key+" : "+value);
        }

        /* 10) values(): Map에 저장된 모든 value를 Set에 담아서 리턴 */
        System.out.println(map.values()); // [7, 1, 3, 4, 6, 2, 5]

        /* 11) remove(): 주어진 key 객체와 일치하는 key-value 객체 삭제 */
        map.remove("빨");
        System.out.println("remove: " + map.keySet());

        /* 12) clear(): 모든 Set 삭제 */
        map.clear();
        System.out.println("clear: " + map.keySet());
    }
}
