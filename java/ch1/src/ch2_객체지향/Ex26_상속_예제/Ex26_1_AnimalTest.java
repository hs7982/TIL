package ch2_객체지향.Ex26_상속_예제;

/** 할일: Animal 클래스 상속받은 클래스들을 만들어서 각 메서드 실행시켜보기 */

class Animal {
    public void move() { System.out.println("동물이 움직입니다."); }
}
class Human extends Animal {
    public void readBook() { System.out.println("사람이 책을 읽습니다."); }
    public void work() { System.out.println("일하기"); }
    public void move() { System.out.println("사람이 두 발로 걷습니다."); }
}
class Tiger extends Animal {
    public void move() { System.out.println("호랭이가 네 발로 걷습니다."); }
    public void hunting() { System.out.println("호랑이가 사냥을 합니다."); }
}
class Eagle extends Animal {
    public void move() { System.out.println("독수리가 하늘을 납니다."); }
    public void landing() { System.out.println("독수리가 착륙합니다."); }
}

public class Ex26_1_AnimalTest {
    public static void main(String[] args) {
        // 방법1 - 각각을 객체화 해서 사용.
//        Human h = new Human();
//        h.move();
//
//        Tiger t = new Tiger();
//        t.move();
//
//        Eagle e = new Eagle();
//        e.move();

        /// ////////////////////////////////////
        Ex26_1_AnimalTest aTest = new Ex26_1_AnimalTest();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal ani) {
        ani.move();
    }
//    public void moveAnimal(Human ani) {
//        ani.move();
//    }
//    public void moveAnimal(Tiger ani) {
//        ani.move();
//    }
//    public void moveAnimal(Eagle ani) {
//        ani.move();
//    }
}
















