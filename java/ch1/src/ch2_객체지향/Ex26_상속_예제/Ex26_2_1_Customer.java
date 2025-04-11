package ch2_객체지향.Ex26_상속_예제;

/* 할일: 등급에 따른 고객 데이터 만들기

        일반등급(이름: 송유진, 고객번호 N-001, 보유포인트 100)
        VIP등급(이름: 권이지, 고객번호 V-001, 보유포인트 10000)

    - 예상 시나리오
        두 고객 모두 '고객번호', 이름, 등급, 할인율(일반 5%, vip 10%) 에 대한 정보를 가지고 있어야 함
        VIP 한테만 개인 상담사('상담사id') 가 있음.

    - 출력: XXX 님의 등급은 XX 이고, 보너스 보인트는 XX 입니다.
 */
public class Ex26_2_1_Customer {
    String id;
    String name;
    String grade;
    int point;
    double discountRate;
    int credit;

    void showCustomerInfo() {
        System.out.println(name + "님의 등급은 " + grade + " 이고, 보너스 포인트는 " + point + " 입니다.");
    }

    void chargeCredit(int credit) {
        this.credit += credit;
    }

    void buyItem(int price) {
        if (credit < price) {
            System.out.println("잔액부족");
            return;
        }
        credit -= price;
        int savedPoint = (int) (price * discountRate);
        point += savedPoint;

        System.out.println(name + "님 - " + price + "원 사용, 남은 크레딧: " + credit);
        System.out.println(name + " - 적립된 포인트: " + savedPoint + "점, 보유 포인트는 " + point + "점");
    }
}

class NomalCustomer extends Ex26_2_1_Customer {
    NomalCustomer(String name, String id, int point) {
        this.name = name;
        this.id = id;
        this.point = point;
        this.grade = "일반등급";
        credit = 0;
        discountRate = 0.05;
    }
}

class VIPCustomer extends Ex26_2_1_Customer {
    String counselorID;

    VIPCustomer(String name, String id, int point, String counselorID) {
        this.name = name;
        this.id = id;
        this.point = point;
        this.grade = "VIP등급";
        discountRate = 0.10;
        credit = 0;
        this.counselorID = counselorID;
    }

    @Override
    void showCustomerInfo() {
        System.out.println(name + "님의 등급은 " + grade + " 이고, 보너스 포인트는 " + point + " 입니다. 상담사ID는 " + counselorID + " 입니다.");
    }
}