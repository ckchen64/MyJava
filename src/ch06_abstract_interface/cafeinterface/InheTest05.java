package ch06_abstract_interface.cafeinterface;

import ch05_inheritance.general.Latte03;

public class InheTest05 {
    static void main(String[] args) {
        // Beverage05.STORE_NAME = "하하하"; final로 선언된 변수는 sub클래스에서 편집불가하다
        System.out.println("어서 오세요 "+ Beverage05.STORE_NAME + "입니다.");
        // 부모타입을 사용한 배열생성
        Beverage05[] orderList = {
                new Americano05("아메리카노", 5000.0, 200.),
                new Espresso05("에스프레소", 6000.0, 2),
                new Latte05("라떼", 7000.0, "아몬드우유"),
                new Cappuccino05("카푸치노", 5000.0, "우유", 50),
                new SpecialCoffee05("스페샬커피", 6000.0, "코코아", 2, 150)
        };

        System.out.println("주문건수: "+Beverage05.getBeverageCount());

        System.out.println("For-each를 사용한 출력");
        for (Beverage05 item : orderList) {
            System.out.println("-----------------------------");
            System.out.println(item);
            if (item instanceof Americano05) {
                ((Americano05) item).adjustWater(20.0);
            } else if (item instanceof Espresso05) {
                ((Espresso05) item).AddShot(2);
            } else if (item instanceof Latte05) {
                ((Latte05) item).changeMilk("바나나우유");
            } else if (item instanceof Cappuccino05) {
                ((Cappuccino05) item).changeMilk("카카오");
//                ((Cappuccino05) item).drink();
            }else if (item instanceof SpecialCoffee05) {
                ((SpecialCoffee05) item).AddShot(1);
                ((SpecialCoffee05) item).adjustWater(50);
                ((SpecialCoffee05) item).changeMilk("녹차");
            }
            item.drink(); //추상메서드를 설정하면 클래스 등급에 따른 Casting이 불필요하다.
            System.out.println();
        }
    }
}

