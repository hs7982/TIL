package ch1;

import java.util.Scanner;

public class Ex13_가위바위보 {
    /*  할일: 컴퓨터랑 가위 바위 보 게임 하기
         사용자에게 가위(1), 바위(2), 보(3) 중 하나 입력 받고
         컴퓨터는 ramdom 으로 1,2,3 중 하나 내서
         승자 판별하기

        가위 - 1
        바위 - 2
        보 - 3

    - 출력
    컴퓨터: 가위, 사람: 바위
    사람 승!
 */
    public static String numToName(int num) {
        switch (num) {
            case 1: return "가위";
            case 2: return "바위";
            case 3: return "보";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int comp = (int)(Math.floor(Math.random() * (3 - 1  + 1) + 1));

        System.out.println("컴퓨터: " + numToName(comp) + ", 사람: " + numToName(user));

        if (comp == user) System.out.println("비김!");

        else if ((user == 1 && comp == 3) ||
                (user == 2 && comp == 1) ||
                (user == 3 && comp == 2))
            System.out.println("사람 승!");
        //-2나 1이면 사람 승 이도록 개선 가능

        else System.out.println("컴퓨터 승!");

    }
}
