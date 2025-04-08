package ch1;

/* 할일: while 반복문 공부하기

    주로 몇바퀴 돌려야 할지 모를때

    초기식;
    while(조건) {
        조건을 위한 값
    } 
 */
public class Ex14_2_반복문_while {
    public static void main(String[] args) {
        int i = 0;
        while(i < 10) {
            System.out.println(i + " : 헬로");
            i+=4;

//            i++;
//            if(i == 3) break;
        }

        System.out.println("=========================");
    }
}
