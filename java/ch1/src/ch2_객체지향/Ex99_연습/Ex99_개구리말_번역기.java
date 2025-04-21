package ch2_객체지향.Ex99_연습;

import java.util.Scanner;
/* 할일: 개구리말 번역기 만들기

    한글로 입력된 문자열을 그 길이만큼 "개굴"로 바꾸기
    단, 공백은 그대로 유지되어야 함

    ex) 안녕 반가워 => 개굴개굴 개굴개굴개굴

 */
public class Ex99_개구리말_번역기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                System.out.print(" ");
            }
            else {
                System.out.print("개굴");
            }
        }

    }
}
