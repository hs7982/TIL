package ch1;

import java.util.Arrays;

/* 다차원 배열
    다차원 배열은 각 배열의 방 마다 또다른 배열이 들어가 있는 구조를 말한다
    
    -배열 선언
        타입 배열이름[][]
        타입[][] 배열이름 = new 타입[바깥방개수][안쪽방개수]
            ex) int[][] num = new int[2][3];
                이거처럼 코드 짜면 [[0,1,2], [0,1,2]] 이런식으로 만들어진다.

    -가변 배열
        보통 처음 만들때 방개수를 지정해서 고정시키지만 사실 방 개수를 넣지 않아도 된다.
            int[][] num = new int[2][];
        대신 이렇게 하면 작은방을 쓰기 전에 반드시 방 별도로 선언해줘야 한다.
            num[0] = new int[2]
            num[1] = new int[4]
 */
public class Ex18_2_배열_다차원 {
    public static void main(String[] args) {
        int[][] num = new int[2][3];
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));

        /* 가변 배열 */
        int[][] num2 = new int[2][];
        System.out.println(Arrays.toString(num2));
        num2[0] = new int[2];
        num2[1] = new int[4];
        System.out.println("num2[0]: " + Arrays.toString(num2[0]));
        System.out.println("num2[1]: " + Arrays.toString(num2[1]));
    }
}
