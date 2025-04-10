package ch2_객체지향.Ex22_메서드실습;

import java.util.*;

/** 할일: 식당 테이블오더 프로그램 작성
 *      각 메뉴(데이터)마다 이름(menuName)과 가격(price)
 *
 *  1 - 쌀국수, 11000
 *  2 - 칼국수, 9000
 *  3 - 초밥, 14000
 *  4 - 오므라이스, 10000
 *  5 - 육회비빔밥, 12000
 *  6 - 도삭면, 10000
 *  7 - 샐러드, 12500
 *  8 - 돈까스, 13000
 *  9 - 제육, 10000
 *  10 - 돼지국밥, 12000
 *
 *  - 출력
 *      선택한 메뉴는 XXX 이고, 가격은 XXX원 입니다.
 */

public class Ex22_4_1_테이블오더 {
    private Map<Integer, Menu> menus = new HashMap<>();
    private List<Menu> selected = new ArrayList<>();;

    public Ex22_4_1_테이블오더(){
        menus.put(1, new Menu("쌀국수", 11000));
        menus.put(2, new Menu("칼국수", 9000));
        menus.put(3, new Menu("초밥", 14000));
        menus.put(4, new Menu("오므라이스", 10000));
        menus.put(5, new Menu("육회비빔밥", 12000));
        menus.put(6, new Menu("도삭면", 10000));
        menus.put(7, new Menu("샐러드", 12500));
        menus.put(8, new Menu("돈까스", 13000));
        menus.put(9, new Menu("제육", 10000));
        menus.put(10, new Menu("돼지국밥", 12000));
    }

    public void selectMenu(int id) {
        Menu menu = menus.get(id);
        selected.add(menu);
        System.out.println("선택한 메뉴는 '"+menu.name+"'이고, 가격은 " + menu.price + "원 입니다.");
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Menu menu : selected) {
            totalPrice += menu.price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Ex22_4_1_테이블오더{" +
                "selected=" + selected +
                '}';
    }
}


class Menu {
    String name;
    int price;
    public Menu(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}