package ch2_객체지향.Ex28_캡슐화;


import java.util.Scanner;
/* 할일: 시분초를 받는 클래스를 만들고
        시: 0~23
        분: 0~59
        초: 0~59
        범위 내의 숫자만 받을수 있도록 하기
        (만약 잘못된 범위의 숫자가 들어오면 0 으로 넣기)
 */
class Time {
    private int hour;
    private int minute;
    private int second;

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour > 23) hour = 0;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) minute = 0;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59) second = 0;
        this.second = second;
    }
}
public class Ex28_2_캡슐화예제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time time = new Time();
        System.out.print("시: ");
        time.setHour(sc.nextInt());

        System.out.print("분: ");
        time.setMinute(sc.nextInt());

        System.out.print("초: ");
        time.setSecond(sc.nextInt());

        System.out.println(time);
    }

}
