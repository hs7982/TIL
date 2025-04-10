package ch2_객체지향.Ex22_메서드실습;

import java.util.Scanner;

public class Ex22_3_2_자판기_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex22_3_1_자판기 ms1 = new Ex22_3_1_자판기(1);
        System.out.print("1-콜라, 2-사이다, 3-환타, 4-포카리: ");
        ms1.pushProductButton(sc.nextInt());
        System.out.println(ms1);

        Ex22_3_1_자판기 ms2 = new Ex22_3_1_자판기(2);
        System.out.print("1-콜라, 2-사이다, 3-환타, 4-포카리: ");
        ms2.pushProductButton(sc.nextInt());
        System.out.println(ms2);
    }
}
