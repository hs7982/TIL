package ch2_객체지향.Ex20_객체지향코딩;

/** 할일: 별도의 객체지향 방식으로 코드를 만들지 않고,
 *          학생 한명한명씩 일일히 만드는 방식.
 *          (추천하지 않는 방식)
 *
 *          배열을 사용하면 코드의 길이를 줄일수 있지만
 *          학생수가 바뀔때마다 어짜피 모든 배열들을 다 건드려야 한다.
 *          각 배열바다 순번이 하나라도 틀리면 누구꺼가 빠졌는지 알수없음
 *
 *          */
public class Ex20_4_2_Student_일반방식 {
    public static void main(String[] args) {
        String stu1Name = "홍길동";
        String stu1No = "S001";
        String stu1Age = "17";

        String stu2Name = "유관순";
        String stu2No = "S002";
        String stu2Age = "16";

        String stu3Name = "김또치";
        String stu3No = "S003";
        String stu3Age = "19";

        System.out.println("이름: " + stu1Name + ", 학번: " + stu1No + ", 나이" + stu1Age);
        System.out.println("이름: " + stu2Name + ", 학번: " + stu2No + ", 나이" + stu2Age);
        System.out.println("이름: " + stu3Name + ", 학번: " + stu3No + ", 나이" + stu3Age);
        System.out.println("----------------------------------");

        /* 배열로 할때 */
        String[] sName = {"홍길동","유관순","김또치"};
        String[] sNo = {"s001","s002","s003"};
        String[] sAge = {"17","16","19"};

        for(int i=0; i<sName.length; i++) {
            System.out.println("이름: " + sName[i] + ", 학번: " + sNo[i] + ", 나이" + sAge[i]);
        }
    }
}