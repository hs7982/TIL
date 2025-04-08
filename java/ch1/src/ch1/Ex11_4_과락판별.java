package ch1;

import java.util.Scanner;

/* 이름, 국,영,수 입력 받고
    평균 60점 미만,
    평균 60점이상 이어도 한과목이라도 40점 미만이면 과락

    - 출력
        XXX님의 총점: XXX 이고, 평균: XX 이고, 과락/통과 입니다.
 */
public class Ex11_4_과락판별 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하시오");
        String name = "송유진";// sc.nextLine();

        System.out.println("국어 점수를 입력하시오");
        int kor = sc.nextInt();

        System.out.println("영어 점수를 입력하시오");
        int eng = sc.nextInt();

        System.out.println("수학 점수를 입력하시오");
        int math = sc.nextInt();

        int total = kor + eng + math;
        float avg = total / 3.0f;
        System.out.println(avg);

        String result = "통과";
        if(avg < 60 || kor < 40 || eng < 40 || math < 40) {
            result = "과락";
        }

        System.out.println(name+"님의 총점: "+total+"점 이고, 평균: "+avg+"점 이고, "+result+" 입니다.");
            


//        if(avg < 60) {
//            System.out.println("과락");
//        }
//        else if(avg >= 60) {
//            if(kor < 40 || eng < 40 || math < 40) {
//                System.out.println("과락");
//            }
//            else {
//                System.out.println("통과");
//            }
//        }

        


        sc.close();
    }
}
