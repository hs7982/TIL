package com.bitstudy.app;

/*
    - 스프링 JDBC 드라이버 받아서 하는 예제
    스프링 JDBC 는 순수 JDBC의 불편함을 보완해서 만든 기능을 제공.

    - 드라이버 다운받기: MVN REPO 에서 spring jdbc 검색하고 >> 아무 버전 복사해오기
      pom.xml에 붙여넣고
      아래 부분 변경
      <version>${org.springframework-version}</version>

    - 사용방법 두가지 있음
        1) DriverManagerDataSource 방법
        2) ApplicationContext 방법

 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Ex05_DBConnection2 {
    public static void main(String[] args) throws SQLException {

        // 1번 방법
//        String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
//        String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
//        String DB_USER = "bitstudy"; // DB에 접속 가능한 아이디, 비번
//        String DB_PASSWORD = "1234";
//
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setDriverClassName(DB_DRIVER);
//        ds.setUrl(DB_URL);
//        ds.setUsername(DB_USER);
//        ds.setPassword(DB_PASSWORD);
//
//        Connection conn = ds.getConnection(); // 데이터베이스의 연결을 얻었다
//        System.out.println("conn: " + conn);
/// ////////////////////////////////////////////////////////////////////////

    /* 2번 방법 - ApplicationContext
        스프링JDBC 가 제공하는 클래스
        설정 정보를 참조하고 IoC를 적용해서 빈을 생성하고 관계를 설정할수 있음
        (제어작업을 총괄함)
        얘가 있어서 외부파일들(xml 같은거)을 bean 으로 등록해놓고 가져다 쓸 수 있게됨.
     */

        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
        DataSource ds = ac.getBean(DataSource.class);

        Connection conn = ds.getConnection(); // 데이터베이스의 연결을 얻었다
        System.out.println("conn: " + conn);
    }

    /* 이렇게 코드를 돌리면 conn이 제대로 만들어 졌는지 확인하기 위해서 직접 sout 으로 찍어봐야한다.
     *   그런데 이렇게 하면 쓸데없는 시간이 오래걸리니까 스프링에서는 이러걸 자동으로 해주는게 있다.
     *   Test 자동화 라는거임.(JUnit 이라는 테스트도구). TDD 라고함
     *  */

    /*  테스트자동화 - TDD 하러 가기

        Ex06 만들어서 2번 방법만 복사해가기
     */
}
