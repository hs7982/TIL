package ch2_객체지향.Ex38_제네릭;

class CoffeeBean2 {
    public void makeDrink() {
        System.out.println("커피를 커피커피");
    }
}
class Soda2 {
    public void makeDrink() {
        System.out.println("탄산을 탄산탄산");
    }
}

/** 무조건적으로 CoffeBean 이나 Soda 같이 정해진게 아닌
 *  제네릭을 이용해서 자료형을 그때그때마다 CoffeeMachine2 에 보내서 사용할 수 있는 틀을 만들어준다
 *  그러면 메인 메서드에서 CoffeeMachine2<> 의 <> 부분에 필요한 자료(클래스)를 보내주면
 *  CoffeeMachine2 하나로 여러가지 타입을 만들수 있다.
 */
class CoffeeMachine2<T> {
    // 재료가 '커피'인 경우
    private T ingredient;
    public T getIngredient() { return ingredient; }
    public void setIngredient(T ingredient) { this.ingredient = ingredient;    }
}

public class Ex38_3_제네릭코드 {
    public static void main(String[] args) {
        // 메뉴마다 다 다른 클래스들을 만들고 인스턴스도 각각 생성 해야함
        CoffeeMachine2<CoffeeBean2> cm1 = new CoffeeMachine2<CoffeeBean2>();
        cm1.setIngredient(new CoffeeBean2());
        cm1.getIngredient().makeDrink();

        CoffeeMachine2<Soda2> cm2 = new CoffeeMachine2<>();
        cm2.setIngredient(new Soda2());
        cm2.getIngredient().makeDrink();
    }
}
