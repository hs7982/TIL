package ch1;

import java.util.Scanner;

public class Ex15_2_구구단_가로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작단: ");
        int start = sc.nextInt();
        System.out.print("끝단: ");
        int end = sc.nextInt();

        for (int dan = start; dan <= end; dan++)
            System.out.print("== " + dan + "단 ==\t\t");
        System.out.println();

        for (int i = 1; i < 10; i++) {
            for (int j = start; j <= end; j++)
                System.out.print(j + " X " + i + " = " + i * j +"\t\t");
            System.out.println();
        }
    }
}
