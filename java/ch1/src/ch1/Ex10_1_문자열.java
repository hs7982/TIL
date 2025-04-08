package ch1;

public class Ex10_1_문자열 {
    public static void main(String[] args) {
        String s = "Hello World Hello Java";
        System.out.println(s);

        // 문자열의 길이
        System.out.println("문자열 길이: " + s.length());

        // 대소문자 변환
        System.out.println("대문자로 변환: " + s.toUpperCase());
        System.out.println("소문자로 변환: " + s.toLowerCase());

        // 특정 문자열 포함 됐는지 확인(정확한 단어여야함) - 포함 true
        System.out.println("포함 확인: " + s.contains("hel")); // false
        System.out.println("포함 확인: " + s.contains("Hel")); // true
        
        // 몇번째에 있는 문자열인지 확인 - 시작은 0번째부터. 없으면 -1 출력됨
        System.out.println("World 가 몇번째?: " + s.indexOf("World"));

        // 마지막 단어가 몇번째에 있는지 확인 - 시작은 0번째부터. 없으면 -1 출력됨
        System.out.println("마지막 Hello 가 몇번째?: " + s.lastIndexOf("Hello"));

        // 시작 문장과 마지막 문장 확인하기 - 맞으면 true
        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("Java"));
        /////////////////////////////////////////////////////

        // 문자열 변환
        String s2 = "Hello World Hello Java Hello";
        System.out.println(s2);
        System.out.println(s2.replace("Hello", "Hi")); // 모든 Hello 를 Hi 로 변환
        
        // 문자열 자르기
        System.out.println(s2.substring(6)); // 6번째 글자부터 가져오기
        System.out.println(s2.substring(s.indexOf("World")));

        System.out.println(s2.substring(6, 17)); // 6번째 글자부터 17번째 미만 번째 까지 잘라오기
        
        // 문자열 양 끝 공백 제거
        String s3 = "      Hello World Hello Java Hello    ";
        System.out.println(s3.trim());

        // 문자열 결합
        String s4 = "JAVA";
        String s5 = "Spring";
        System.out.println(s4 + s5);
        System.out.println(s4 + " " + s5);
        System.out.println(s4.concat(" ").concat(s5));

        // 문자열 비교
        String s6 = "Java";
        String s7 = "java";
        System.out.println(s6.equals(s7)); // false
        System.out.println(s6.equalsIgnoreCase(s7)); // true

        String s8 = new String("java");
        String s9 = "java";
        System.out.println(s8.equals(s9)); // true (값만 비교)
        System.out.println(s8 == s9); // false (주소값까지 비교)

        String s10 = null;
        System.out.println(s9.equals(s10)); // 이건 OK. 비교할때 null 이 주체가 아니고 비교 당하는게 될때는 오류 안남
        System.out.println(s10.equals(s9)); // 이건 에러. 주체가 null 이면 아예 시동조차 걸 수 없음.
    }
}












