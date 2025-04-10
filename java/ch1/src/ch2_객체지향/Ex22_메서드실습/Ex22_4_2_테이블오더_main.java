package ch2_객체지향.Ex22_메서드실습;

import java.util.Scanner;

public class Ex22_4_2_테이블오더_main {
    public static void main(String[] args) {
        Ex22_4_1_테이블오더 order1 = new Ex22_4_1_테이블오더();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" *  1 - 쌀국수, 11000\n" +
                    " *  2 - 칼국수, 9000\n" +
                    " *  3 - 초밥, 14000\n" +
                    " *  4 - 오므라이스, 10000\n" +
                    " *  5 - 육회비빔밥, 12000\n" +
                    " *  6 - 도삭면, 10000\n" +
                    " *  7 - 샐러드, 12500\n" +
                    " *  8 - 돈까스, 13000\n" +
                    " *  9 - 제육, 10000\n" +
                    " *  10 - 돼지국밥, 12000\n" +
                    "0 - 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int select = scanner.nextInt();
            if (select == 0) { break;}
            order1.selectMenu(select);
        }
        System.out.println(order1);
        System.out.println(order1.getTotalPrice()+"원");
    }
}

