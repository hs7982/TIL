package com.bitstudy.app;

/* DI 란?
    객체지향 프로그램은 객체들의 조립관계를 통해서 만들어진다.
    스프링의 가장 기본적인 능력은 객체를 생성해주고 조립하는 능력이다.
    (이때 사용하는 용어가 DI, IoC 이다)
 */

class B {}
class A {
    private B b;

    /*  A는 B를 일체형으로 가졌다.
        B는 A의 부품이다 라고 함 (종속객체 라고도 함)  */
    public A() {
        b = new B();
        /* 이 방식은 일체형 방식인데 클래스 간의 결합도가 강함
            (B 같은 부품을 쉽게 갈아낄수 없다는 뜻)

         */
    }
}

public class Ex01_DI1 {
}