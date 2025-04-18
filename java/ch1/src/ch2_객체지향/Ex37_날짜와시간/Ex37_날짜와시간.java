package ch2_객체지향.Ex37_날짜와시간;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*  자바에서 날짜와 관련된 객체 세가지
    1) Date 클래스 - java.util 패키지에 있음 (JDK 1.0 1995년도에 만들어짐)
                    날짜와 시간을 다룸
                    (Date 의 메서드들이 대부분 deprecated 됐지만 여전히 사용되고 있는 것들도 꽤 있음)
                    단점이 존재(날짜와 시간을 동시에 다룸)

    2) Calendar 클래스 - java.util 패키지에 있음 (JDK 1.1 1997년도에 만들어짐)
                        Date 클래스를 개선한 추상클래스
                        여전히 단점이 존재(날짜와 시간을 동시에 다룸)

    3) time 패키지 - java.time 패키지에 있음
                    Date와 Calendar 클래스들의 단점을 개선한 새로운 클래스들이 제공됨 (JDK1.8 때 나옴)
                    날짜(LocalDate)와 시간(LocalTime) 을 구분할 수 있고
                    LocalDateTime 이라는 클래스로 두개를 같이 사용할 수도 있다.
                    여전히 단점은 존재
 */
public class Ex37_날짜와시간 {
    public static void main(String[] args) {
    /* ******************************************** */
        /* Date 예제 */
        Date dt = new Date();
        System.out.println(dt);
//        System.out.println(dt.getMonth() + 1);
//        System.out.println(dt.getDate());

        // 출력 포멧 설정
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("date: " + date.format(dt));
        System.out.println("time: " + time.format(dt));


    /* ******************************************** */
        /* Calendar 예제
        *  Calendar는 인터페이스로 정의된 추상클래스이기 때문에 직접 객체를 생성할수 없고 메서드를 이용해서 인스턴스를 생성해야 한다. */
        // Calendar cal = new Calendar(); 이거 안됨

        // 추상클래스 객체화 하는 방법
        Calendar cal = Calendar.getInstance(); // 이렇게 하던가
        Calendar cal2 = new GregorianCalendar(); // 그레고리안 클래스 사용해야함
        System.out.println("cal: " + cal);
//        System.out.println("cal2: " + cal2);
        System.out.println("년: " + cal.get(Calendar.YEAR));
        System.out.println("월: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("일: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK)); //  요일: 1-일 2-월.... 7-토 부터 시작

        String[] yoil = {"", "일","월","화","수","목","금","토"};
        System.out.println("요일: " + yoil[cal.get(Calendar.DAY_OF_WEEK)]);

        System.out.println("");
        System.out.println("시: " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("분: " + cal.get(Calendar.MINUTE));
        System.out.println("초: " + cal.get(Calendar.SECOND));


        // 두 날짜간의 차이 구하려면 밀리초 단위로 반환 해야함( getTimeInMillis() 사용)
        Calendar date1 = Calendar.getInstance();
        date1.set(2025, 3, 1); // 25년 4월 1일

        Calendar date2 = Calendar.getInstance(); // 오늘

        long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) ;
        System.out.println((diff) + " 밀리초 지남");
        System.out.println((diff / 1000) + " 초 지남");
        System.out.println((diff / (1000 * 60)) + " 분 지남");
        System.out.println((diff / (1000 * 60 * 60)) + " 시간 지남");
        System.out.println((diff / (1000 * 60 * 60 * 24)) + " 일 지남");


        /* ******************************************** */
        /* time 예제 */

        // LocalDate
        LocalDate currDate = LocalDate.now(); // 지금날짜
        LocalDate targetDate = LocalDate.of(2025, 3, 18); // 지정날짜: 25년 3월 18일 (month에 +1) 안해도 됨
        System.out.println("currDate: " + currDate);
        System.out.println("targetDate: " + targetDate);

        // LocalTime
        LocalTime currTime = LocalTime.now(); // 지금시간
        LocalTime targetTime = LocalTime.of(22, 1, 2); // 지정시간: (시,분,초,나노초) 밀리초 없음
        System.out.println("currTime: " + currTime);
        System.out.println("targetTime: " + targetTime);


        // LocalDateTime
        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println("currDateTime: " +currDateTime);

        // 만약 날짜와 시간을 구해놨으면 아래처럼 사용 가능
        LocalDateTime targetDateTime = LocalDateTime.of(currDate, currTime);
        System.out.println("targetDateTime: " + targetDateTime);

        System.out.println("-------------------------");

        String localDateTime = currDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS"));
        System.out.println("localDateTime: " +localDateTime);

// ////////////////////////////////////////////////////////////////////////////////
        // 날짜 차이 구하기 - Period 클래스 사용하기
        LocalDate dt1 = LocalDate.now();
        LocalDate dt2 = LocalDate.of(2025, 4, 17);
        Period p = Period.between(dt1, dt2);
        System.out.println("p: " + p);
        // period 에서 특정 필드 값을 뽑을때는 p.get(ChronoUnit.필드명) 을 이용한다
        System.out.println(p.get(ChronoUnit.YEARS));
        System.out.println(p.get(ChronoUnit.MONTHS));
        System.out.println(p.get(ChronoUnit.DAYS));

        // 시간 차이 구하기 - Duration 클래스 사용하면 됨
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(0,0,0);
        Duration du = Duration.between(time2, time1);
        System.out.println("du: " + du);
        // Duration 에서는 시, 분 을 표시해주지 않는다. (하려면 별도의 계산식 돌려야함)
        System.out.println("SECONDS: " + du.get(ChronoUnit.SECONDS));
        System.out.println("NANOS: " + du.get(ChronoUnit.NANOS));

        // 시간 분 을 구하려면 Duration LocalTime 으로 변환 한 후 get 메서드를 이용해서 뽑아내면 됨
        LocalTime tmpTime = LocalTime.of(0,0).plusSeconds(du.getSeconds());
        System.out.println(tmpTime.getHour());
        System.out.println(tmpTime.getMinute());
        System.out.println(tmpTime.getSecond());


    }
}



















