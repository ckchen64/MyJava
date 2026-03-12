package ch05_inheritance.general;

public class InheTest03 {
    static void main(String[] args) {
        Americano03 americano = new Americano03("아메리카노",4000.0,200.0);
        Espresso03 espresso = new Espresso03("에스프레소",5000.0, 2);
        Latte03 latte = new Latte03("라떼", 6000.0, "아몬드우유");

        americano.printInfo(); // 미정의된 메소드를 만들때 변수위에 커져를 가져다 놓고
                               // 콤보박스의 "create...'선택, 이후 메소드가 정의되어야 할
                               // 클래스선택하면 해당 클래스로 자동이동 됨
        espresso.printInfo();
        latte.printInfo();


    }
}
