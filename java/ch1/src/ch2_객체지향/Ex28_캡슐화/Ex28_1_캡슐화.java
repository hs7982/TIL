package ch2_객체지향.Ex28_캡슐화;

/*
    캡슐화 - 객체지향 프로그래밍의 핵심 중 하나임(다형성 다음으로 중요)
            클래스 안에 있는 변수나 메서드를 외부에서 쉽게 접근하지 못하도록 은닉하는것을 말함
            (중요한 데이터를 쉽게 바꾸지 못하도록 할 때 사용)

    - 캡슐화 목적
        1) 데이터 보호 (정보 은닉)
        2) 데이터 외부 노출 방지

    - 캡슐화 하는 방법
        1) 은닉하려는 정보를 private 제어자로 놓는다.
        2) public한 getter나 setter 메서드를 이용해서 데이터를 변경
            (setter 에서는 데이터를 쓰기 전에, 데이터 유효성 검사 로직을 넣어줄수도 있다.)
 */

class Capsule {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // 0이하의 값이 들어오면 0
        // 1이상의 값이 들어오면 그대로 저장
        if(id >= 1)
            this.id = id;
        else
            this.id = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 빈칸으로 들어오면 '이름 없음' ,
        // 한글자라도 들어오면 그거 그대로 넣기

        if(!name.equals("")  ||  name != "") {
            this.name = name;
        }
        else {
            this.name = "이름 없음";
        }


    }

    @Override
    public String toString() {
        return "Capsule{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Ex28_1_캡슐화 {
    public static void main(String[] args) {
        Capsule c1 = new Capsule();
        c1.setId(10);
        c1.setName("");
        System.out.println(c1);

        Capsule c2 = new Capsule();
        c2.setId(-9);
        c2.setName("구관모");
        System.out.println(c2);
    }
}
