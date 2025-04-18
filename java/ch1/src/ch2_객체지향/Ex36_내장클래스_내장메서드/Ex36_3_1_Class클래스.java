package ch2_객체지향.Ex36_내장클래스_내장메서드;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    - Class 클래스 -
        자바에서는 클래스나 인터페이스들의 메타데이터(클래스명, 필드, 생성자, 메소드 같은 정보들)를 Class 라는 이름을 가지고 있는 클래스에서 관리한다.
        (java.lang 패키지에 있음)
        그래서 Class 클래스를 이용해서 클래스 객체를 가져올수 있다
        이때 Object 클래스가 가지고 있는 getClass() 메서드를 이용해서 해당 클래스의 정보를 뽑아낼 수 있다.
            ex) A a = new A();
                Class clazz = a.getClass();

        Class 클래스는 생성자를 감추고 있기 때문에 new 로 인스턴스화 할 수 없어서 forName() 이라는 메서드를 이용해야 한다
            ex) Class clazz = Class.forName(String 클래스명);
                찾으려는 클래스가 없으면 ClassNotFoundException 예외 터짐


    - 이걸 사용하는 이유 -
        원래는 변수 선언시 사용할 자료형을 미리 파악하고 생성을 했었음.
        클래스도 마찬가지로 클래스 정보를 코드상에 눈으로 봐가면서 프로그램을 만들었었음.
        그런데 특정 경우에는 여러 클래스 중에 다른 클래스를 사용해야 하거나 리턴 받는 클래스의 타입을 모를때가 있다.
        이때 Class 클래스를 사용해서 해당 클래스의 정보를 가져오거나 인스턴스를 생성할 수 있다.


    - * Class 클래스의 주요 메서드들
        1) 객체 정보 얻기
            - getClass()
                    Object 클래스에 있는 메서드
                    현재 참조하고 있는 클래스를 확인 할 수 있는 메서드

            - forName(클래스명)
                    매개변수로 보내는 클래스명이 존재해야함
                    (없으면 ClassNotFoundException 발생하기 때문에 throws ClassNotFoundException 를 걸어줘야함)

        2) 동적 객체 생성
            - newInstance() - 동적 객체 생성
                Class 객체를 이용해서 new 연산자처럼 인스턴스를 생성할 수 있다


 */
public class Ex36_3_1_Class클래스 {
    public static void main(String[] args) throws ClassNotFoundException {

        // 1) getClass() 사용 - 해당 클래스의 정보(위치)
        Ex36_3_2_Person p = new Ex36_3_2_Person();
        Class klass = p.getClass();
        System.out.println("getClass: " + klass); // 결과: class ch2_객체지향.Ex36_내장클래스_내장메서드.Ex36_3_2_Person

        // 2) forName() 사용 - 클래스 이름(정보)으로 가져오기
        Class clazz = Class.forName("ch2_객체지향.Ex36_내장클래스_내장메서드.Ex36_3_2_Person");
        System.out.println("forName: " + clazz.getName());

        // 생성자 정보 가져오기
        Constructor[] cons = clazz.getConstructors(); // Person 클래스가 가지고 있는 모든 생성자를 배열로 받아오기
        for (Constructor con : cons) {
            System.out.println("생성자 정보: " + con);
        }

        // 필드 정보 가져오기
        Field[] fields = clazz.getFields(); // public 한 필드(변수) 가져오기
        for (Field field : fields) {
            System.out.println("필드정보1: " + field);
        }
        Field[] fields2 = clazz.getDeclaredFields(); // 모든 변수들 가져오기
        for (Field field : fields2) {
            System.out.println("필드정보2: " + field);
        }

        // 메서드 정보 가져오기
        Method[] methods = clazz.getMethods(); // public
        for (Method method : methods) {
            System.out.println("메서드 정보1" + method);
        }
        Method[] methods2 = clazz.getDeclaredMethods(); // 모든
        for (Method method : methods2) {
            System.out.println("메서드 정보2" + method);
        }
    }
}














