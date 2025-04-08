package ch1;

/* 할일: 반복문 for 에 대해 알아보기

    반복문: 같은 작업을 같은 자리에서 반복하는 작업

    *for 문은 주로 몇번 돌려야 할지 알때 사용

    - for 문 종류
        1) for(초기식; 조건식; 증감식) { }

        2) foreach 문 (향상된 for문)
            기본 for문은 초기식; 조건식; 증감식 으로 구성되지만
            향상된 for 문은 초기식; 조건식; 증감식 없이 callback 함수를 통해서 기능을 동작시킬 수 있다.
            배열의 첫번째 방부터 마지막 방까지 알아서 반복하면서 값을 하나씩 떠내온다

            for(변수타입 변수명 : 배열) { }

 */
public class Ex14_반복문_for {
    public static void main(String[] args) {
        // 기본 for 문. int 가 거의 고정적으로 사용 되지만 다른 숫자 자료형을 써도 돌긴 함
        for(float i = 1; i <= 10; i++) {
//            System.out.println(i);
            System.out.printf("%.2f%n", i);
        }
        
        // 향상된 for 문
        int[] arr = {1,2,3,4,5};
        for(int i = 0 ;i < arr.length; i++) {

        }

        for(int num : arr) {
            System.out.println(num);
        }
        
    }
}











