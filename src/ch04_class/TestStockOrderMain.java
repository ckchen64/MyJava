package ch04_class;

import java.util.Scanner;

public class TestStockOrderMain {
    static void main(String[] args) {

        TestStockOrder order01 = new TestStockOrder();
        // 생성자는 객체를 생성할 때, 객체의 속성(필드)에 값의 입력을 강제하여
        // 객체의 오류를 방지하기 위함
        order01.setStockName("삼성전자");
        order01.setPrice(170000);
        order01.setQuantity(100);
        order01.setOrderType("매수");

        System.out.println(order01.showInfo());
        System.out.println(order01.getStockName()+" "+order01.getPrice());

        TestStockOrder order02 = new TestStockOrder();
        order02.setStockName("SK하이닉스");
        order02.setPrice(800000);
        order02.setQuantity(50);
        order02.setOrderType("매도");

        System.out.println(order02.showInfo());



    }


}
