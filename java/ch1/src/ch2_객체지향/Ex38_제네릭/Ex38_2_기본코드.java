package ch2_객체지향.Ex38_제네릭;

/* 커피집을 운영하고 있고, 음료머신이 있음(커피도 만들고, 탄산도 만들수 있는)
    메뉴에는 커피가 들어가는게 있고, 에이드 같은 탄산이 들어가는것도 있다고 치자
    이 커피머신에 프로그래밍을 해야 한다면 각 메뉴마다 클래스를 사용해야 한다.
 */
class CoffeeBean {
    public void makeDrink() {
        System.out.println("커피를 커피커피");
    }
}
class Soda {
    public void makeDrink() {
        System.out.println("탄산을 탄산탄산");
    }
}
class CoffeeMachine {
    // 재료가 '커피'인 경우
    private CoffeeBean ingredient;
    public CoffeeBean getIngredient() {
        return ingredient;
    }
    public void setIngredient(CoffeeBean ingredient) {
        this.ingredient = ingredient;
    }


    // 재료가 '탄산'인 경우
    private Soda ingredient2;
    public Soda getIngredient2() {
        return ingredient2;
    }
    public void setIngredient2(Soda ingredient2) {
        this.ingredient2 = ingredient2;
    }
}

public class Ex38_2_기본코드 {
    public static void main(String[] args) {
        // 메뉴마다 다 다른 클래스들을 만들고 인스턴스도 각각 생성 해야함
        CoffeeMachine cm1 = new CoffeeMachine();
        cm1.setIngredient(new CoffeeBean());
        cm1.getIngredient().makeDrink();

        CoffeeMachine cm2 = new CoffeeMachine();
        cm2.setIngredient2(new Soda());
        cm2.getIngredient2().makeDrink();
    }
}