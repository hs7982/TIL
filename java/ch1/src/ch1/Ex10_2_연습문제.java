package ch1;

/* 할일: 주민번호 입력 받고 생년월일과 성별 출력하기

        ex) 990101-1234567
            생년월일: 1999년 1월 1일
            성별: 남
        ex) 020101-4234567
            생년월일: 2002년 1월 1일
            성별: 여

 */
public class Ex10_2_연습문제 {
    public static void main(String[] args) {
        String id =  "990102-1234567";
        System.out.println(id);
//        System.out.println(id.substring(0,8));
//        System.out.println(id.substring(0, id.indexOf("-")+2));

        String num1 = id.split("-")[0];
        String num2 = id.split("-")[1];
        int tmp = Integer.parseInt(num2.substring(0,1));//num2.charAt(0); // 1, 2, 3, 4 중에 한개

        String gender = "남";
        if(tmp % 2 == 0) {
            gender = "여";
        }
        String year = tmp<=2?"19":"20";
        year += num1.substring(0, 2);
        String month = num1.substring(2, 4);
        String date = num1.substring(4, 6);
        System.out.println(year+"-"+month+"-"+date + ", " + gender);
    }
}
