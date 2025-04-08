package ch1;

import java.util.Scanner;

/* if문 switch case 문 두개가 있음
    
    1) if문
        if(조건식) {
            - 조건식이 성립될때만 실행되는 코드
            - 단독 사용 가능
        }
        else if(조건식) {
            - if의 조건식이 false 이면서 여기의 조건이 true 일때만 동작
            - 단독 사용 불가능
            - else if 여러번 사용 가능하며, 그중 하나라도 true 가 걸리면 아래쪽의 세트 조건문들은 확인하지 않음
        }
        else {
            - 조건식 없다.
            - 위의 조건식들이 모두 false 일때 여기 걸림
        }
        
        * 중첩 가능
 */
public class Ex11_1_조건문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        
        if(num > 10) {
            System.out.println("10보다 크다");
        }
        else if(num < 10) {
            System.out.println("10보다 작다");
        }
        else {
            System.out.println("10과 같다");
        }

    }
}










