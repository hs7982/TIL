package ch2_객체지향.Ex33_추상클래스_작성방법;
/*  할일: 추상클래스 설계 하고 작성해보기
*
*   추상클래스 만들때 첫번쨰로 생각해야 하는거
*   1) 여러 클래스에 공통되는거 따로 뽑기(메서드)
*   2) 특정 메서드로 공통되는 메서드 한방에 돌릴지 말지 결정
*
*   아래 '보병', '탱크' , '수송선' 에서 공통적인 부분들을 뽑아내서 추상클래스로 바꿔보기
* */

import java.util.ArrayList;

class 보병 {
    int x, y;
    void move(int x, int y) { /* x, y 지점으로 이동 */ }
    void stop() { /* 멈춤 */ }

    void drug() { /* 마약 사용 - 총 짱빨리쏨, 총 맞아도 아몰랑 */ }
}
class 탱크 {
    int x, y;
    void move(int x, int y) { /* x, y 지점으로 이동 */ }
    void stop() { /* 멈춤 */ }

    void modeChg() { /* 공격모드 변환 */ }
}
class 수송선 {
    int x, y;
    void move(int x, int y) { /* x, y 지점으로 이동 */ }
    void stop() { /* 멈춤 */ }

    void load() { /* 상차 */ }
    void unload() { /* 하차 */}
}
/****************************************************/

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춤");
    };
}
class 보병2 extends Unit {
    void move(int x, int y) {
        System.out.println("보병: " +x+", " + y +" 지점으로 길 따라서 이동");
    }
    void drug() {
        System.out.println("마약 사용 - 총 짱빨리쏨, 총 맞아도 아몰랑");
    }
}
class 탱크2 extends Unit {
    void move(int x, int y) {
        System.out.println("탱크: " + x+", " + y +" 지점으로 길 따라서 이동");
    }
    void modeChg() {
        System.out.println("공격모드 변환");
    }
}
class 수송선2 extends Unit {
    void move(int x, int y) {
        System.out.println("수송선: " + x+", " + y +" 지점으로 날아서 이동");
    }
    void load() {
        System.out.println("상차");
    }
    void unload() {
        System.out.println("하차");
    }
}


public class Ex33_1_추상클래스_작성방법 {
    public static void main(String[] args) {

//        Unit 보병 = new 보병2();
//        보병.move(10, 20);
//        Unit 탱크 = new 탱크2();
//        탱크.move(10, 20);
//        Unit 수송선 = new 수송선2();
//        수송선.move(10, 20);

        Unit[] group = new Unit[3];
        group[0] = new 보병2();
        group[1] = new 탱크2();
        group[2] = new 수송선2();

        for (int i = 0; i < group.length ; i++) {
            group[i].move(100, 200);
        }
        // -----------------------------------------

        ArrayList<Unit> unit = new ArrayList<>();
        unit.add(new 보병2());
        unit.add(new 보병2());
        unit.add(new 보병2());
        unit.add(new 보병2());
        unit.add(new 보병2());
        unit.add(new 수송선2());

        for (int i = 0; i < unit.size() ; i++) {
            unit.get(i).move(150, 250);
        }
    }
}








































