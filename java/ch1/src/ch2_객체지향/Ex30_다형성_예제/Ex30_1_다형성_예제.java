package ch2_객체지향.Ex30_다형성_예제;

/** 할거: 구입한 커피의 총 금액과 내역을 출력해보기
 (고객: 기본 돈 50000만원)

 ex) 총액: 4800 원 입니다.
 내역: 아메리카노, 초코라떼 입니다.

 */
class Coffee2 {
    int price;
    public Coffee2(int price) { this.price = price; }
}
class Americano2 extends Coffee2 {
    public Americano2(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "아메리카노";}
}
class ChocoLatte2 extends Coffee2 {
    public ChocoLatte2(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "초코라떼";}
}
class CafeMoca2 extends Coffee2 {
    public CafeMoca2(int price) { super(price); /*부모생성자 호출*/ }
    @Override
    public String toString() { return "카페모카";}
}
class Customer2 {
    private int money;

    Coffee2[] item = new Coffee2[2];
    int idx = 0;

    public void setMoney(int money) {
        this.money = money;
    }

    // 커피 주문 할 때 마다 사용자의 잔액 변경 하면서,
    // 커피 정보 저장하는 메서드
    void buyCoffee(Coffee2 coffee) {
        if(money < coffee.price) {
            System.out.println("잔액 부족");
            return;
        }
        money -= coffee.price;
        item[idx++] = coffee;

    }

    // 총액, 커피 정보(이름, 가격)
    void summary() {
        int sum = 0;

        for(int i=0; i< item.length; i++) {
            sum += item[i].price;
            System.out.println(item[i] +"(" + item[i].price +")");
        }
        System.out.println("총액: " + String.format("%,d", sum) +"원");
    }

}
public class Ex30_1_다형성_예제 {
    public static void main(String[] args) {
        Americano2 ame = new Americano2(2000);
        ChocoLatte2 cl = new ChocoLatte2(4000);
        CafeMoca2 cm = new CafeMoca2(3000);

        Customer2 송 = new Customer2();
        송.setMoney(10000);

        송.buyCoffee(ame);
        송.buyCoffee(cm);
        송.summary();
    }
}
