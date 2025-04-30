package com.bitstudy.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertTrue;

/*
    할일 : DB에 연결해서 직접 저장하고 읽어오게 해보기

    1) insertUser 메서드 만들어서 test 코드 생성
    2) select, update, delete 다 만들어서 test코드 생성
    *주의: 원래는 rs, pstmt, conn 다 close 해줘야하는데 일단 그건 나중에 try/catch 할때 할거임
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class Ex06_DBConnection3Test3 {
    @Autowired
    DataSource ds;

    public void deleteAll() throws SQLException {
        Connection conn = ds.getConnection();
        String sql = "truncate table tmpUser";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.executeUpdate();
    }


    /**** insert (회원가입용) ****/

    /* -순서-
        1) 유저 객체 만들어서 insertUser()에 보내기
        2) 리턴 받은 값이 1일때만 테스트 성공 띄우기
     */
    @Test
    public void insertUserTest() throws Exception {
        deleteAll();

        User user = new User("asdf", "1234", "홍길동", "asdf@asdf.com");
        int rowCount = insertUser(user);

        System.out.println("rowCount: " + rowCount);
        assertTrue(rowCount == 1);
    }

    /* -순서-
        1) insertUser 만들고 User 클래스 매개변수로 받기
        2) DataSource ds를 가지고 conn  만들기
        3) 할일(sql) 문구 정하기
        4) sql문 실행(excute)
     */

    public int insertUser(User user) throws Exception {
        Connection conn = ds.getConnection();

        String sql = "insert into tmpUser values (null, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getId());
        pstmt.setString(2, user.getPw());
        pstmt.setString(3, user.getName());
        pstmt.setString(4, user.getEmail());

        int rowCount = pstmt.executeUpdate(); //select 처럼 리턴으로 데이터를 가져와야 할땐 executeQuery
        // excuteUpdate 경우 몇개의 행이 영향을 받았는지 정수로 넘어옴(실패시 0)

        return rowCount;
    }

    /**** select (아이디 중복검사용) ****/

    @Test
    public void selectUserTest() throws Exception {
        deleteAll();
        User user = new User("asdf", "1234", "홍길동", "asdf@asdf.com");
        int rowCount = insertUser(user);

        if (rowCount == 1) {
            User user2 = selectUser("asdf");
            assertTrue(user2.getId().equals("asdf"));
        }
    }

    public User selectUser(String id) throws SQLException {
        Connection conn = ds.getConnection();

        String sql = "select * from tmpUser where id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();

        if(rs.next()) {
            User user = new User();
            user.setId(rs.getString(2));
            user.setPw(rs.getString(3));
            user.setName(rs.getString(4));
            user.setEmail(rs.getString(5));
            return user;
        }
        return null;
    }
}