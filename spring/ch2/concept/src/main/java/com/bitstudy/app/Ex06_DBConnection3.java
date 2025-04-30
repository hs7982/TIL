package com.bitstudy.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

/* 할일 : TDD 작업 해보기
        우클릭 > 이동 > Test클릭(command + shift + t)

 */

public class Ex06_DBConnection3 {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
        DataSource ds = ac.getBean(DataSource.class);

        Connection conn = ds.getConnection();
        System.out.println("conn: "+conn);
    }
}
