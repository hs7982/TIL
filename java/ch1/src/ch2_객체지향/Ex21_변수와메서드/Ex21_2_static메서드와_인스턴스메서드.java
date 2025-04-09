package ch2_객체지향.Ex21_변수와메서드;

/** 할일: 클래스 메서드와 인스턴스 메서드의 차이 알아보기
 *  
 *  클래스 메서드는 static 이 붙고, 별도로 인스턴스를 생성하지 않아도 사용 가능
 *  클래스 메서드는 인스턴스 변수를 사용할 수 없다.
 */
public class Ex21_2_static메서드와_인스턴스메서드 {

    public static void main(String[] args) {
        //System.out.println(C.num); // num은 (일반)인스턴스 변수이기 때문에 C를 메모리에 올리는 작업을 하기 전까지는 아무도 못알아봄 
        System.out.println(C.num2); //  num2 가 C 안에 있고, C가 아직 인스턴스화 되지 않았지만 그래도static 이라서 메모리에 C.num2=10 처럼 들어가 있어서 인스턴스화 하기 전에도 사용 가능
        C tmpC = new C(); // 여기서 C를 인스턴스 화 하면 그 안에 있는 모든 변수들을 알아보게 됨
        System.out.println(tmpC.num); // tmpC에 C클래스를 인스턴스화(메모리에 올림) 해놨기 때문에 이제부터는 tmpC 라고 하면 C 안에 있는 변수나 기능들 사용 가능

        System.out.println("메인 시작");

        // firstMethod 가 static 일때는 그냥 대놓고 사용 가능
//        firstMethod(); 
        
        // firstMethod 가 static이 아닐때는 해당 메서드를 가지고 있는 클래스를 인스턴트화 한 후에
        Ex21_2_static메서드와_인스턴스메서드 tmp = new Ex21_2_static메서드와_인스턴스메서드();
        tmp.firstMethod(); // 그 안에 있는 메서드를 호출해야 한다.
        
        System.out.println("메인 끝");
    }

     void firstMethod() {
        System.out.println("firstMethod 시작");
        secondMethod();
        System.out.println("firstMethod 끝");
    }
    static void secondMethod() {
        System.out.println("secondMethod 시작");
        System.out.println("secondMethod 끝");
    }
}

class C {
    int num = 10;
    static int num2 = 10;
}