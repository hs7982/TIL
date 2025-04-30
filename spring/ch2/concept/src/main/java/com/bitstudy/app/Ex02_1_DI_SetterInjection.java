package com.bitstudy.app;

/*  일체형으로 코드를 짜면 뭔가 수정사항이 있을때마다 코드를 다 변경해줘야 한다.
    그래서 이제부터는 조립형으로 짤거임.
    
    조립형에서 주의할점은 A 와 B를 직접 연결하는게 아니라, 별도의 클래스를 만들어서 그 클래스가 B를 A에 주입하게 하는거임.
    두가지 방법이 있음.
        1) setter 인젝션
        2) Constructor 인젝션

 */
class A2 {
    private B2 b;

    public void setB(B2 b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A2{" +
                "b=" + b +
                '}';
    }
}
class B2 {
    String id = "asdf";
    public String toString() { return id; }
}
class BB extends B2{
    String id = "뽁습";
    public String toString() { return id; }
}

public class Ex02_1_DI_SetterInjection {
    public static void main(String[] args) {
        A2 a = new A2();
        a.setB(new B2());
        System.out.println(a);

        a.setB(new BB());
        System.out.println(a);

    }
}





















