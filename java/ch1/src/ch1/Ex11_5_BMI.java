package ch1;

import java.util.Scanner;

/* 할일: BMI
        몸무게(KG) / 키(미터) 제곱
        75 / 1.80 의 제곱
        
    -출력
    XXX님의(키: XXX, 몸무게: XXX) 의 BMI 는 XX 이고 XX 비만 입니다.
        -범위-
            0~18.49 - 저체중
            18.5~22.99 - 정상
            23~24.99 -과체중
            25~  비만
 */
public class Ex11_5_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h = sc.nextDouble() / 100;
        double w = sc.nextDouble();

        double bmi = w / (h * h);

        System.out.printf("%.2f%n", bmi);

        if(bmi >= 25) {
            System.out.println("비만");
        }
        else if(bmi >= 23) {
            System.out.println("과체중");
        }
        else if(bmi >= 18) {
            System.out.println("정상");
        }
        else if(bmi >= 0) {
            System.out.println("저체중");
        }

    }
    
}
