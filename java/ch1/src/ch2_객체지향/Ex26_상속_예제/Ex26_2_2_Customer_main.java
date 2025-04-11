package ch2_객체지향.Ex26_상속_예제;

public class Ex26_2_2_Customer_main {
    public static void main(String[] args) {
        NomalCustomer n1 = new NomalCustomer("송유진", "N-001", 100);
        VIPCustomer v1 = new VIPCustomer("권이지", "V-001", 10000, "C-001");

        n1.showCustomerInfo();
        v1.showCustomerInfo();

        n1.chargeCredit(20000);
        v1.chargeCredit(20000);

        n1.buyItem(10000);
        v1.buyItem(50000);

        n1.showCustomerInfo();
        v1.showCustomerInfo();
    }
}


