package com.bitstudy.app;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.*;


/* TDD에서는 같은 클래스에 들어있는 메서드들도 다 남남으로 생각해야함
    무조건 public void 여야 한다.
    * 중요 : Test 하려는 메서드에는 @Test 어노테이션을 달아줘야 한다.


 */

public class Ex06_DBConnection3Test {

    @Test
    public void main() throws Exception {
        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
        DataSource ds = ac.getBean(DataSource.class);

        Connection conn = ds.getConnection();
//        System.out.println("conn: "+conn);

        assertTrue(conn != null);
    }
}