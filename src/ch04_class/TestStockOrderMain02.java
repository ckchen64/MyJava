package ch04_class;

public class TestStockOrderMain02 {
    static void main(String[] args) {

//        TestStockOrder01 order01 = new TestStockOrder01();
//        // 생성자는 객체를 생성할 때, 객체의 속성(필드)에 값의 입력을 강제하여
//        // 객체의 오류를 방지하기 위함
//        order01.setStockName("삼성전자");
//        order01.setPrice(170000);
//        order01.setQuantity(100);
//        order01.setOrderType("매수");
//
//        System.out.println(order01.showInfo());
//        System.out.println(order01.getStockName()+" "+order01.getPrice());

        TestStockOrder02 order01 = new TestStockOrder02("삼성전자", 170000, 100,"매수");
        order01.showInfo();
        TestStockOrder02 order02 = new TestStockOrder02("SK하이닉스", 500000, 50, "매도");
        order02.showInfo();
        System.out.println();

        int size = 2;
        TestStockOrder02[] orderList = new TestStockOrder02[size];
        orderList[0] = new TestStockOrder02("삼성전자", 170000, 100,"매도");
        orderList[1] = new TestStockOrder02("SK하이닉스", 500000, 50, "매수");

        for (int i = 0; i < orderList.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보 :");
            orderList[i].showInfo();
        }
        System.out.println();

        TestStockOrder02[] orderList02 = {
            new TestStockOrder02("삼성전자", 170000, 100, "매도"),
            new TestStockOrder02("SK하이닉스", 500000, 50, "매도"),
            new TestStockOrder02("현대차", 400000, 150, "매도"),
        };

        for (int i = 0; i < orderList02.length; i++) {
            System.out.println((i+1)+"번째 주문 정보:");
            orderList02[i].showInfo();
        }
        System.out.println();




    }


}
