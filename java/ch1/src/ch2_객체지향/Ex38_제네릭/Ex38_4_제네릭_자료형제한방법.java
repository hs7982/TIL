package ch2_객체지향.Ex38_제네릭;

/* 제네릭 이라고 해서 모든 클래스를 보내게 냅두면 안된다.
    그래서 제네릭 클래스의 자료형 <> 연산자에 제한을 걸어둘 수 있다.
    방법 별도의 추상 클래스를 만들고 그 클래스를 상속받은 클래스들만 제네릭 클래스의 자료형으로
    들어갈수 있게 하면 된다.

    만약 <T> 가 있다면 <T extends 부모클래스>
 */

abstract class Material {
    public abstract void makeDrink();
}
class CoffeeBean3 extends Material {
    public void makeDrink() {
        System.out.println("커피를 커피커피");
    }
}
class Soda3 extends Material {
    public void makeDrink() {
        System.out.println("탄산을 탄산탄산");
    }
}
class Milk3 {
    public void makeDrink() {
        System.out.println("우유를 우유우유");
    }
}
class CoffeeMachine3<T extends Material> {
    // 재료가 '커피'인 경우
    private T ingredient;
    public T getIngredient() { return ingredient; }
    public void setIngredient(T ingredient) { this.ingredient = ingredient;    }
}
public class Ex38_4_제네릭_자료형제한방법 {
    public static void main(String[] args) {
        CoffeeMachine3<CoffeeBean3> cm1 = new CoffeeMachine3<CoffeeBean3>();
        cm1.setIngredient(new CoffeeBean3());
        cm1.getIngredient().makeDrink();

        CoffeeMachine3<Soda3> cm2 = new CoffeeMachine3<>();
        cm2.setIngredient(new Soda3());
        cm2.getIngredient().makeDrink();

//        CoffeeMachine3<Milk3> cm3 = new CoffeeMachine3<>();
//        cm3.setIngredient(new Milk3());
//        cm3.getIngredient().makeDrink();
    }
}
