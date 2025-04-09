package ch2_객체지향.Ex20_객체지향코딩;

/** 할일: 학생정보 만들기
 *      학생1: 이름(홍길동), 학번(S001), 나이(17)
 *      학생2: 이름(유관순), 학번(S002), 나이(16)
 *      ....
 * */
public class Ex20_4_1_클래스_필요한이유 {
    public static void main(String[] args) {
        Ex20_4_3_Student_클래스방식 s1 = new Ex20_4_3_Student_클래스방식();
        s1.setsName("홍길동");
        s1.setsNo("s001");
        s1.setsAge("17");
        s1.setsGender("남");

        System.out.println(s1.getsAge() +"살");
        System.out.println(s1);

        Ex20_4_3_Student_클래스방식 s2 = new Ex20_4_3_Student_클래스방식();
        s2.setsName("유관순");
        s2.setsNo("s002");
        s2.setsAge("16");
        System.out.println(s2);

        Ex20_4_3_Student_클래스방식 s3 = new Ex20_4_3_Student_클래스방식();
        s3.setsName("김말뚝");
        s3.setsNo("s003");
        s3.setsAge("19");
        System.out.println(s3);
    }
}
