package ch2_객체지향.Ex30_다형성_예제;

import java.util.ArrayList;
import java.util.Scanner;

/** 할거: Ex30_1 꺼를 사용자에게서 메뉴를 숫자로 입력 받아서 실행되도록 하기
 */
class Coffee4 {
    int price;
    public Coffee4(int price) { this.price = price; }
}
class Americano4 extends Coffee4 {
    public Americano4(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "아메리카노";}
}
class ChocoLatte4 extends Coffee4 {
    public ChocoLatte4(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "초코라떼";}
}
class CafeMoca4 extends Coffee4 {
    public CafeMoca4(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "카페모카";}
}
class Customer4 {
    private int money;

    ArrayList<Coffee4> item = new ArrayList<>();
    int idx = 0;

    public void setMoney(int money) {
        this.money = money;
    }
    
    // 커피 주문 할 때 마다 사용자의 잔액 변경 하면서,
    // 커피 정보 저장하는 메서드
    void buyCoffee(Coffee4 coffee) {
        if(money < coffee.price) {
            System.out.println("잔액 부족");
            return;
        }
        money -= coffee.price;
        System.out.println(coffee + "커피를 주문하였습니다. ("+ coffee.price + "원), 잔액: " + money);
        item.add(coffee);
    }

    // 총액, 커피 정보(이름, 가격)
    void summary() {
        int sum = 0;

        for(int i=0; i< item.size(); i++) {
            sum += item.get(i).price;
            System.out.println(item.get(i) +"(" + item.get(i).price +")");
        }
        System.out.println("총액: " + String.format("%,d", sum) +"원");
        System.out.println("잔액: " + String.format("%,d", money) +"원");
    }
}
public class Ex30_3_다형성_예제 {

    public static void main(String[] args) {
        Customer4 호오오오랭이윤 = new Customer4();
        호오오오랭이윤.setMoney(15000);

        Coffee4[] menu = {
                new Americano4(2000),
                new ChocoLatte4(4000),
                new CafeMoca4(3000)
        };

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) +"-"+ menu[i] +"("+ menu[i].price + "원)");
        }

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("메뉴를 선택하시오");

            int tmp_input = sc.nextInt();
            if(tmp_input <= 0) break;
            else if( menu.length < tmp_input) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            호오오오랭이윤.buyCoffee(menu[tmp_input - 1]);
        }

        호오오오랭이윤.summary();

    }
}


























