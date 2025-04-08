package ch1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* 할일: 돈 단위에 컴마 붙이기 */
public class Ex16_돈컴마찍기 {
    public static void main(String[] args) {
        // 1) Decimal.format()
        DecimalFormat df = new DecimalFormat("###,###"); // 세자리마다 컴마 찍으라는 뜻
        String s1 = df.format(10000);
        String s2 = df.format(100000000);
        System.out.println(s1);
        System.out.println(s2);

        // 2) Numberformat
        String s3 = NumberFormat.getNumberInstance().format(10000);
        String s4 = NumberFormat.getNumberInstance().format(100000000);
        System.out.println(s3);
        System.out.println(s4);

        // 3) String.format
        String s5 = String.format("%,d", 10000);
        String s6 = String.format("%,d", 10000000);
        System.out.println(s5);
        System.out.println(s6);

    }
}