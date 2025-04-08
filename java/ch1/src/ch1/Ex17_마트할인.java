package ch1;

import java.util.Scanner;
/* 할일: -1 넣기 전까지 계속 입력 받기
        만원 이상 구매시 10%
        5만원 이상 구매시 20%

    -출력-
        전체 상품 금액: XXXX원
        할인율: XX%
        할인 금액: XXX원
        최종 금액: XXXXX원

 */
public class Ex17_마트할인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        double discountRate = 0;
        int discount = 0;

        while (true) {
            int inp = sc.nextInt();
            if (inp == -1)
                break;
            total += inp;
        }

        if (total >= 50000)
            discountRate = 0.2;
        else if (total >= 10000)
            discountRate = 0.1;
        discount = (int)(total * discountRate);

        System.out.printf("전체 상품 금액: %,d원%n", total);
        System.out.println("할인율: "+ (int)(discountRate * 100)+"%");
        System.out.printf("할인 금액: %,d원%n", discount);
        System.out.printf("최종 금액: %,d원%n", total - discount);

    }
}
