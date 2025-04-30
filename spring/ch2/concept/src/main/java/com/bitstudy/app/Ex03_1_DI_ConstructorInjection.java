package com.bitstudy.app;


class A3 {
    private B3 b;

    public A3(B3 b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A3{" +
                "b=" + b +
                '}';
    }
}
class B3 {
    String id = "asdf";
    public String toString() { return id; }
}
public class Ex03_1_DI_ConstructorInjection {
    public static void main(String[] args) {
        A3 a = new A3(new B3());
        System.out.println(a);
    }
}
