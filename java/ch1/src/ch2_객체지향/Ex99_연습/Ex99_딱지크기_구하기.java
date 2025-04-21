package ch2_객체지향.Ex99_연습;

/*  지피티와 딥시크가 딱지를 접고 있음 각자 접은 딱지의 사이즈를 구할거임
    (클래스를 이용해서) 두 사람의 딱지 면적을 구해보기

    할거:  1) 지금 입력하는 값이 정사각형용인지 직사각형 용인지 먼저 선택하고
          2) 딱지 가로 세로 길이 입력 받기 -> 딱지 면적 구하기
        (단, 딱지 종류는 직사각형, 정사각형 두가지임)
        직사각형: 숫자 두개 입력받아서 (숫자1 * 숫자2)
        정사각형: 숫자 한개 입력받고 (숫자1 * 숫자1)

 */

import java.util.Scanner;

// 직사각형
class RectDDakZi {
    int w;
    int h;

    public RectDDakZi(int w, int h) {
        this.w = w;
        this.h = h;
    }
    public int area() { return w*h;}
}
// 정사각형
class SquarDDakZi extends RectDDakZi {
    public SquarDDakZi(int w) {
        super(w, w);
    }
}

public class Ex99_딱지크기_구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("딱지 종류를 선택하시오");
        System.out.println("1-직사각형, 2-정사각형");
        int t = sc.nextInt();

        RectDDakZi rect1 = null;
        SquarDDakZi squar1 = null;

        if(t == 1) { // 직사각형
            System.out.print("가로 크기를 입력하시오: ");
            int w = sc.nextInt();
            System.out.print("세로 크기를 입력하시오: ");
            int h = sc.nextInt();
            rect1 = new RectDDakZi(w,h);
            System.out.println("입력한 가로 세로는 "+ w+", "+h +" 이고, 크기는" + rect1.area()+" 입니다.");
        }
        else if(t == 2) { // 정사각형
            System.out.print("가로세로 크기를 입력하시오: ");
            int w = sc.nextInt();
            squar1 = new SquarDDakZi(w);
            System.out.println(squar1.area());
            System.out.println("입력한 가로 세로는 "+ w+", "+w +" 이고, 크기는 " + squar1.area()+" 입니다.");
        }


    }
}