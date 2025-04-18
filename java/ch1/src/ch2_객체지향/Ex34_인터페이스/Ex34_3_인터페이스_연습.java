package ch2_객체지향.Ex34_인터페이스;

/** 할일: 인터페이스를 만들고 각각의 클래스에 impleaments 해서 인터페이스의 다형성 알아보기 */
interface Eatable {
    public abstract void eat();
}
interface Movable {
    void move();
}
class Animal {
//    public void move() { System.out.println("동물이 움직입니다."); }
}
class Human /* extends Animal*/ implements Eatable, Movable  {
    public void readBook() { System.out.println("사람이 책을 읽습니다."); }
    public void work() { System.out.println("일하기"); }
    
    public void move() { System.out.println("사람이 두 발로 걷습니다."); }
    public void eat() { System.out.println("사람이 집어 먹습니다."); }
    
}
class Tiger /* extends Animal*/ implements Eatable, Movable {
    public void hunting() { System.out.println("호랑이가 사냥을 합니다."); }

    public void move() { System.out.println("호랭이가 네 발로 걷습니다."); }
    public void eat() { System.out.println("호랭이가 뜯어 먹습니다."); }
}
class Eagle /* extends Animal*/ implements Eatable, Movable {
    public void landing() { System.out.println("독수리가 착륙합니다."); }

    public void move() { System.out.println("독수리가 하늘을 납니다."); }
    public void eat() { System.out.println("독수리가 쪼아 먹습니다."); }
}


public class Ex34_3_인터페이스_연습 {
    public static void main(String[] args) {

        Ex34_3_인터페이스_연습 aTest = new Ex34_3_인터페이스_연습();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());

        aTest.eatAnimal(new Human());
        aTest.eatAnimal(new Tiger());
        aTest.eatAnimal(new Eagle());
    }
    public void moveAnimal(/*Animal ani */ Movable ani ) {
        ani.move();
    }
    public void eatAnimal(/* Animal ani */ Eatable ani) {
        ani.eat();
    }
}
