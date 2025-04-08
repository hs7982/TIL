package ch1;
/*
    - do while
        while의 조건이 false 여도 기본 한번은 동작함

        do {
            ...
        } while(조건)
 */
public class Ex14_3_do_while {
    public static void main(String[] args) {

        int i=0;

        do {
            System.out.println(i);
        } while(i != 0);
    }
}
