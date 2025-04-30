package com.bitstudy.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.assertTrue;


/* DataSource를 내가 가져오는 방법을 명시하지 않고, 스프링이 알아서 가져오게 하기
(DI, IoC 개념)
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class Ex06_DBConnection3Test2 {
    @Autowired // Autowired 사용시 클래스에 @RunWith랑 @ContextConfiguration 필요함
    DataSource ds;
    /*
        @Autowired란
            필요한 의존 객체의 "타입"에 해당하는 Bean을 찾아서 주입한다.
            (필드, 생성자, setter에 사용 가능함)
            지금 여기서는 root-context.xml에 있는 bean 객체들 중에서 id가 DataSource인것 불러오는거임
     */

    @Test
    public void main() throws Exception {
        /* ApplicationContext방식은 우리가 수동으로 주입하는 방식
        * 이거 대신 Autowired를 써서 자동 주입 받을 수 있다.
        * 장점: @Test 단위가 여러개일때 메서드 내에서 매번 ac를 생성해야 하는데, Autowired로 xml을 불러오면 하나의 ac를 재사용하는 것과 같기 때문에
        *       성능적으로 이점이 있음 */
//        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/root-context.xml");
//        DataSource ds = ac.getBean(DataSource.class);

        Connection conn = ds.getConnection();
//        System.out.println("conn: "+conn);
    
        assertTrue(conn != null);
    }
}