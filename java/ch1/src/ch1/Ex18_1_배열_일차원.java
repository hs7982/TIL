package ch1;

import java.util.Arrays;

/*
    배열(array)
        - 변수와 비슷(변수는 하나의 박스에 한가지 값만 가질수 있고, 배열을 같은 종류의 여러 개의 값을 가질수 있다.)
                   (결과적으로는 큰 박스에 여러개의 칸(방)을 만들어서 같은 종류의 값들을 하나씩 넣을수 있다.)
        - 자료형: object
        - [] 안에 방번호를 써서 값 하나씩 건드릴수 있다.
        - 강 방마다 다른 자료형의 자료를 가질수 있다.
        - 방 개수 거의 무제한
        - **방번호는 무조건 0번부터 시작

        * length: 길이/개수

    - 배열 선언
        타입[] 변수명
        타입 변수명[]
        ([] 는 어디에 붙던 상관 없음)
    
    1) 선언만 하고 빈 방으로 두기
        int[] 변수명 = new int[길이]
            ex) int[] num = new int[3];  // <== [ , , ]

    2) 선언과 동시에 값 초기화 하기(값들을 저장)
        int[] 변수명 = {10,20,30}

    *중요: 배열은 메모리상 어딘가에 있는 실제 값의 주소값을 참조할뿐임
          그래서 sout 으로 찍어보면 그 안의 값이 나오지 않고 주소값이 나옴
 */
public class Ex18_1_배열_일차원 {
    public static void main(String[] args) {
        // 1번 방법
        int[] num = new int[3]; // 3칸짜리 빈 방 만듬
        num[0] = 10;
        num[1] = 100;
        num[2] = 1000;

        System.out.println(num); // [10,100,1000] 이게 나오지 않고  [I@43a25848 이게 나옴 주소값임
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(Arrays.toString(num)); // 이렇게 해야 [10,100,1000] 이 출력됨
        System.out.println("=============");

        //2번 방법
        int[] num2 = {10,20,30};
        System.out.println(num2[0]);
        System.out.println(num2[1]);
        System.out.println(num2[2]);
        System.out.println(Arrays.toString(num2));
        System.out.println(num2.length);
        System.out.println("=============");

        for(int tmp : num2) {
            System.out.println(tmp);
        }
    }
}



















