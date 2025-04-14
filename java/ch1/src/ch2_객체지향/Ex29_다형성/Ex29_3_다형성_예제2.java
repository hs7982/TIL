package ch2_객체지향.Ex29_다형성;

/* 커피 구매하는 프로그램을 구현한다고 치고
    그냥 코드를 짜게 되면 각 메뉴마다 가격 이름같은 정보들이 다 다르기 때문에 각 메뉴마다 구매하는 메서드를 일일이 구현해줘야 한다.
    그런데 다형성을 활용하면 개별적인 커피의 구매 메서드를 따로 구현하지 않아도 된다.(그냥 메서드 하나로 모든 메뉴를 구매할 수 있게 할 수 있다)

    방법: 상위 클래인 Coffee 자료형을 매개변수로 전달 받으면, 하위 클래스 타입의 참조 변수는 매개변수로 전달될수 있다.
         (이렇게 하면 반복적인 코드를 줄일수 있다)
 */
class Coffee {
    int price;
    public Coffee(int price) { this.price = price; }
}
class Americano extends Coffee {
    // int price;
    public Americano(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "아메리카노";}
}
class ChocoLatte extends Coffee {
    public ChocoLatte(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "초코라떼";}
}
class CafeMoca extends Coffee {
    public CafeMoca(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "카페모카";}
}

class Customer {
    int money = 50000;
    void buyCoffee(Coffee coffee) {
        money -= coffee.price;
    }

    /* Americano 나 ChocoLatte 구매 메서드를 만들때, 다형성을 이용하지 않으면 각각의 메뉴에 대한 구매 메서드를 다 따로따로 만들어야 함 */
//    void buyCoffee(Americano ame) {
//        money -= ame.price;
//    }
//    void buyCoffee(ChocoLatte cl) {
//        money -= cl.price;
//    }
//    void buyCoffee(CafeMoca cm) {
//        money -= cm.price;
//    }
}

public class Ex29_3_다형성_예제2 {
    public static void main(String[] args) {
//        Americano ame = new Americano(2000);
//        ChocoLatte cl = new ChocoLatte(4000);
//        CafeMoca cm = new CafeMoca(3000);

        Customer c = new Customer();
//        c.buyCoffee(ame);
//        c.buyCoffee(cl);
//        c.buyCoffee(cm);

        c.buyCoffee(new Americano(2000));
        c.buyCoffee(new ChocoLatte(4000));
        c.buyCoffee(new CafeMoca(3000));

        System.out.println(c.money);
    }
}












