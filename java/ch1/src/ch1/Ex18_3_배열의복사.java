package ch1;

import java.util.Arrays;

/*
    배열의 복사에는 '얕은복사' 와 '깊은복사' 가 있다.

        얕은복사(Shallow Copy): 복사된 배열이나 원본 배열이 변경될때 둘 다 값이 변경
                               주소값 공유
        깊은복사(Deep Copy): 복사된 배열이나 원본 배열이 변경 되어도 서로 영향을 주지 않음
                            실제값 공유받고 끝
 */
public class Ex18_3_배열의복사 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};

        /* **** 얕은복사 **** */
        System.out.println("== 얕은복사 == ");
        int[] shallow_arr = arr;
    
        // 얕은 복사시 arr 랑 shallow_arr 랑 같은 '주소값' 과 같은 '실제값' 이 나온다
        System.out.println("arr: " + arr);
        System.out.println("shallow_arr: " + shallow_arr);
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("shallow_arr: " + Arrays.toString(shallow_arr));

        // arr 0번방의 값을 100으로 바꾸면 arr와 shallow_arr 의 값 모두 바뀐다
        arr[0] = 100;
        System.out.println("arr[0] 바꾼거: " + Arrays.toString(arr)); // [100, 20, 30]
        System.out.println("shallow_arr: " + Arrays.toString(shallow_arr)); // [100, 20, 30]

        System.out.println("===============================");

        /* **** 깊은복사 **** */
        int[] arr2 = {10,20,30};
        int[] deep_arr = new int[arr2.length]; // arr2 을 바로 복사하지 않고 arr2의 길이만큼 새로운 배열을 생성한다(arr2와는 상관 없는 배열)

        for(int i = 0; i < arr2.length; i++){
            deep_arr[i] = arr2[i];
        }

        System.out.println("arr2: " + arr2);
        System.out.println("deep_arr: " + deep_arr);
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("deep_arr: " + Arrays.toString(deep_arr));

        arr2[0] = 100;
        System.out.println("arr2[0] 바꾼거: " + Arrays.toString(arr2)); // [100, 20, 30]
        System.out.println("deep_arr: " + Arrays.toString(deep_arr)); // [100, 20, 30]


        System.out.println("=============================");

    }
}





















