package ch2_객체지향.Ex30_다형성_예제;

import java.util.ArrayList;

class Coffee3 {
    int price;
    public Coffee3(int price) { this.price = price; }
}
class Americano3 extends Coffee3 {
    public Americano3(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "아메리카노";}
}
class ChocoLatte3 extends Coffee3 {
    public ChocoLatte3(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "초코라떼";}
}
class CafeMoca3 extends Coffee3 {
    public CafeMoca3(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "카페모카";}
}
class Customer3 {
    private int money;
    
    // 배열로 하면 무조건 개수를 정해야 하는데, 방 개수 정하지 않고 가변적으로 만들려면 ArrayList 를 사용해야함(add 메서드를 이용하면 계속 방 추가 가능)
    /* Coffee3[] item = new Coffee3[2]; */
    ArrayList<Coffee3> item = new ArrayList<>(); // 몇개의 커피를 저장할지 모를때

    int idx = 0;

    public void setMoney(int money) {
        this.money = money;
    }

    // 커피 주문 할 때 마다 사용자의 잔액 변경 하면서,
    // 커피 정보 저장하는 메서드
    void buyCoffee(Coffee3 coffee) {
        if(money < coffee.price) {
            System.out.println("== " + coffee);
            System.out.println("잔액 부족");
            return;
        }
        money -= coffee.price;

        /* item[idx++] = coffee; */
        item.add(coffee);
    }

    // 총액, 커피 정보(이름, 가격)
    void summary() {
        int sum = 0;
        
        // item은 배열이 아니고 ArrayList 이기 때문에 length 대신 size() 메서드를 사용해야함
        for(int i=0; i< item.size(); i++) {
            sum += item.get(i).price;
            System.out.println((i+1) + ": " + item.get(i) +"(" + item.get(i).price +")");
        }

        System.out.println("총액: " + String.format("%,d", sum) +"원");
    }
}
public class Ex30_2_다형성_예제_ArrayList {
    public static void main(String[] args) {
        Americano3 ame = new Americano3(2000);
        ChocoLatte3 cl = new ChocoLatte3(4000);
        CafeMoca3 cm = new CafeMoca3(3000);

        Customer3 송 = new Customer3();
        송.setMoney(10000);

        송.buyCoffee(ame);
        송.buyCoffee(cm);
        송.buyCoffee(ame);
        송.buyCoffee(cl);
        송.buyCoffee(ame);
        송.summary();
    }
}
