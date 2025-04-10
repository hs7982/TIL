package ch2_객체지향.Ex22_메서드실습;

import java.util.HashMap;
import java.util.Map;

public class Ex22_3_1_자판기 {
    private int id;
    private Map<Integer, Drink> drinks;
    private Drink buyDrink;

    Ex22_3_1_자판기(int id) {
        this.id = id;
        drinks = new HashMap<>();
        drinks.put(1, new Drink("콜라"));
        drinks.put(2, new Drink("사이다"));
        drinks.put(3, new Drink("환타"));
        drinks.put(4, new Drink("포카리"));
    }

    public void pushProductButton(int id) {
        Drink selected = drinks.get(id);
        buyDrink = selected;
        System.out.println(this.id + "번 자판기 - " + selected.name + " 버튼이 눌렸습니다.");
    }

    @Override
    public String toString() {
        return id + "번 자판기 - 구매하신 음료는 " + buyDrink.name + " 입니다.";
    }
}

class Drink {
    String name;

    Drink(String name) {
        this.name = name;
    }
}