package ch2_객체지향.Ex34_인터페이스;


interface Eatable2 {
    public abstract void eat();
}
interface Movable2 {
    void move();
}
abstract class Animal2 implements Eatable2, Movable2 {}

class Human2 extends Animal2 {
    public void readBook() { System.out.println("사람이 책을 읽습니다."); }
    public void work() { System.out.println("일하기"); }

    public void move() { System.out.println("사람이 두 발로 걷습니다."); }
    public void eat() { System.out.println("사람이 집어 먹습니다."); }

}
class Tiger2 extends Animal2 {
    public void hunting() { System.out.println("호랑이가 사냥을 합니다."); }

    public void move() { System.out.println("호랭이가 네 발로 걷습니다."); }
    public void eat() { System.out.println("호랭이가 뜯어 먹습니다."); }
}
class Eagle2 extends Animal2 {
    public void landing() { System.out.println("독수리가 착륙합니다."); }

    public void move() { System.out.println("독수리가 하늘을 납니다."); }
    public void eat() { System.out.println("독수리가 쪼아 먹습니다."); }
}

public class Ex34_4_인터페이스_연습2 {
    public static void main(String[] args) {

        Ex34_4_인터페이스_연습2 aTest = new Ex34_4_인터페이스_연습2();
        aTest.moveAnimal(new Human2());
        aTest.moveAnimal(new Tiger2());
        aTest.moveAnimal(new Eagle2());
    }
    public void moveAnimal(Animal2 ani) {
        ani.move();
        ani.eat();
    }
}
