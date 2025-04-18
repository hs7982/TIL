package ch2_객체지향.Ex34_인터페이스;

/*
    인터페이스란 추상메서드들의 집합(추상메서드와 상수만 멤버로 가질수 있다)
    (추상클래스보다 강도가 쎈 추상화)

    *중요* 추상클래스는 abstract 가 들어가는 메서드들도 가질수 있고, 일반 메서드들도 가질수 있는데
           인터페이스는 전부 abstract 메서드여야만 한다.
           모든 멤버는 public 이어야 한다.(그래서 생략 가능)
           다중상속 가능. 이유는 같은 이름을 가지고 있는 메서드들이 여러 인터페이스들에 있어도 구현부가 없어서 충돌날 일이 없음

    interface 이름 {
        public static final 타입 상수명 = 값;
        public abstract 반환타입 메서드이름([매개변수...]);
    }
    
    - 인터페이스가 인터페이스 상속 받는 경우(다중상속 가능)
      (인터페이스는 여러개를 '상속' 받을수 있음. 단 인터페이스만 상속 가능)
        interface 이름 extends 인터페이스1, 인터페이스2, 인터페이스3... {}

    - 클래스를 인터페이스를 이용해 구현(상속) 하는 경우
      (클래스는 다른 클래스를 상속(extends) 받을수도 있고(한번), 여러개의 인터페이스를 구현(implements) 할수도 있다
        class 이름 extends 부모클래스 implements 인터페이스1, 인터페이스2, 인터페이스3... {}

 */

interface Fightable {
    /*public static final*/ int speed = 10; // 인터페이스는 모두 public 이고, 변수의 경우 상수로만 사용 해야하며 static 이어야 한다.
                                            // public static final 생략 가능
//    final int hp = 1000;
//    static int hp = 1000;
//    public int hp = 1000;
    /* public abstract */ void move(int x, int y); // 인터페이스는 모두 public 이고, 메서드의 경우 모두 추상메서드만 사용 가능
                                                    // public abstract 생략 가능
}
class Unit {
    int x, y;

    void stop() {
        System.out.println("멈춤");
    }
}
class 보병 extends Unit implements Fightable {
    void drug() {
        System.out.println("마약 사용 - 총 짱빨리쏨, 총 맞아도 아몰랑");
    }
    
    void attack() { System.out.println("공격 시작"); }

    @Override
    public void move(int x, int y) {
        System.out.println("보병: " +x+", " + y +" 지점으로 길 따라서 이동");
    }
}

public class Ex34_1_인터페이스 {

}






























