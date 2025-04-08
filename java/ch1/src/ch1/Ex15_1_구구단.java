package ch1;

import java.util.Scanner;

public class Ex15_1_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작단: ");
        int start = sc.nextInt();
        System.out.print("끝단: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println("== " + i + "단 ==");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
