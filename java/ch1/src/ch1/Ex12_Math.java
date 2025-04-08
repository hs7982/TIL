package ch1;

public class Ex12_Math {
    public static void main(String[] args) {
         /*
            - Math 객체
                1) random
                    범위: 0.00000~0.9999999
                    0.0 * 범위 <= random * 범위 < 1.0 * 범위
                        (int)(0.0 * 범위) <= (int)(Math.random() * 범위) < (int)(1.0 * 범위)

                    ex) 0~4 까지의 랜덤수 구하기
                        (int)(0.0 * 5) <= (int)(Math.random() * 5) < (int)(1.0 * 5)

                    Math.floor(Math.random() * (max - min +1) ) + min //최대 최소값 포함한 범위 설정
                    */
        System.out.println((int)(Math.floor(Math.random() * (3 - 1  + 1) + 1)));
        /*
                2) ceil : 올림
                3) floor : 내림
                4) round : 반올림
                5) max : Math.max(숫자, 숫자, ...) 숫자중에 가장 큰거 한개
                6) min : Math.min(숫자, 숫자, ...) 숫자중에 가장 작은거 한개
                7) abs : 절대값
                8) pow : 제곱근. Math.pow(2, 10) - 2의 10승
                9) sqrt: 루트
          */
        double pi = 3.1415926535;
        System.out.println("ceil: "+Math.ceil(pi));
        System.out.println("floor: "+Math.floor(pi));
        System.out.println("round: "+Math.round(pi));
        System.out.println("max: "+Math.max(1, 10));
        System.out.println("min: "+Math.min(1, 10));
        System.out.println("abs: "+Math.abs(-10));
        System.out.println("pow: "+Math.pow(2, 10));
        System.out.println("sqrt: "+Math.sqrt(16));
    }
}
