package com.bitstudy.app;

/*  자바프로그램을 이용해서 Mysql DB를 인텔리제이로 읽어오고 삭제하는거 해보기

    여기서는 순수 JDBC 드라이버 받아서 해볼거임
    (스프링 JDBC 는 다음 파일에서 할거임)

    - 드라이버 다운받기: MVN REPO 에서 mysql 검색하고 >>> connect-j 드라이버 pom.xml 에 넣고 업데이트 하기
 */


import java.sql.*;

public class Ex04_DBConnection {
    public static void main(String[] args) throws Exception {
        // 스키마 이름이 test 임.
        String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        String DB_USER = "root"; // DB에 접속 가능한 아이디, 비번
        String DB_PASSWORD = "1234";

        // Connection은 객체라고는 하지만 사실 인터페이스임
        // DriverManager의 getConnection 메소드를 이용해서 연결정보를 주면 "열쇠를 만들어줌"
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // DB의 연결을 얻는다

        String sql = "select now()"; // 할일: 현재시간 출력

        // 열쇠에 sql문장(할일)을 적을 종이를 준비한다
        Statement stmt = conn.createStatement();

        // ResultSet 은 테이블 형태로 정보를 가져옴
        ResultSet rs = stmt.executeQuery(sql);

        while(rs.next()) { // (여기서는 결과가 한줄만 나오기 떄문에 if문으로 해도 됨. 그래도 보통 while로 함)
            String currDate = rs.getString(1); // 읽어온 행의 첫번째 컬럼 값을 String으로 읽어서 currDate에 저장

            System.out.println("currDate: " + currDate);
        }



    }
}
