package ch1;

import java.util.Scanner;

public class Ex11_3_홀수짝수_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 수 넣어라");
        int num1 = sc.nextInt();
        System.out.println("두번째 수 넣어라");
        int num2 = sc.nextInt();

        int total = num1 + num2;

        switch(total % 2) {
            case 0:
                System.out.println("짝수");
                break;
            case 1:
                System.out.println("홀수");
                break;
            default:
                break;
        }
    }
}
