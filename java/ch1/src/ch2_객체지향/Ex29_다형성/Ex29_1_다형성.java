package ch2_객체지향.Ex29_다형성;
/*
    다형성

        조상 타입의 참조변수에 자손 타입 객체를 담아서 사용
        ex)
            1) 일반적인 객체 생성
                Tv t = new Tv();
            2) 다형성 객체 생성
                Tv 가 조상클래스, SmartTv 가 자손클래스 라고 치면 아래처럼 사용 가능
                Tv t = new SmartTv();
                (해설: t는 조상타입의 참조 변수, SmartTv 는 객체 타입)

                SmartTv t = new Tv(); <<-- 이건 안됨

            *정리: 부모 타입 안에는 자식 들어갈 수 있음

        * 다형성 장점
            1) 유지보수: 여러 객체를 하나의 타입으로 관리 할 수 있음
            2) 재사용성: 객체의 재사용이 쉬워짐
            3) 느슨한 결합도: 클래스간의 의존성을 줄여서 확장성을 높일수 있다.(결합도 낮아짐)

*/
class Tv {
    boolean power; // 전원상태 (on-true/off-false)
    int channel; // 채널
    int volumn; // 볼륨

    void power() {
        power = !power; // 현재 전원상태의 반대값을 새로 저장
        if(power) System.out.println("일반 Tv 켜짐");
        else  System.out.println("일반 Tv 끔");
    }
    void channelUp() {
        System.out.println(++channel);
    }
    void channelDown() {
        System.out.println(--channel);
    }
    void volumnUp() {
        System.out.println(++volumn);
    }
    void volumnDown() {
        System.out.println(--volumn);
    }
}

class SmartTv extends Tv {
    boolean netflix;// ott 상태 (켜짐-true/꺼짐-false)

    void ott() {
        netflix = !netflix;
        if(netflix) System.out.println("Tv 킴");
        else  System.out.println("Tv 끔");
    }
}

public class Ex29_1_다형성 {
    public static void main(String[] args) {
        // 다형성 - 부모 타입의 참조변수 t 에 자식 객체 SmartTv를 담았음. 그래서 t 로는 SmartTv의 기능이 아닌 Tv 의 멤버들만 사용 가능
        Tv t = new SmartTv();
        t.power();
        // t.ott(); // t 리모콘 에는 ott 버튼 자체가 없기 때문에 사용 못함


        // 자식 타입의 변수에 부모 넣을수 없음.
        // 코드에는 빨간줄 안들어와도 컴파일 단계에서 에러남
        SmartTv stv = (SmartTv) new Tv();
        stv.power();
        stv.ott();

    }
}
