package ch05_inheritance.mybeverage;

public class InheTest04 {
    static void main(String[] args) {
        //승급(업케스팅): 낮은등급의 클래스가 높은 등급의 클래스 타입으로 한시적 형태가 바뀌는 동작
        // 전제조건 : 반드시 상속 관계이어야 합니다.
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250);
        // 이로써 beverage01는 super클래스로 간주 됩니다.
        //상기  Beverage04는 Americano04를 사용하여도 상관없다
        // (super클래스의 메소드는 sub클래스에서의 사용권한이 자동 부여되기 때문)

        //super클래스내에 들어 있는 메소드(showInfo())를 sub클래스에서 상속개념에 근거해 접근이 가능합니다.
        beverage01.showInfo(); // 이로써 beverage01는 super클래스로 간주 됩니다.

        // 상위 코드에서 beverage01가 super클래스로 업케스팅 되었으므로
        // sub클래스에 있는 sipAmericano()메소드를 사용하기 위하여
        // beverage01를 명시적으로 sub클래스 타입(Americano04)을 선언해 주어야 합니다
        Americano04 coffee01 = (Americano04) beverage01; // 이로써 beverage01는 sub클래스로 환원 되었습니다.
        coffee01.sipAmericano();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        beverage02.showInfo();

        Espresso04 coffee02 = (Espresso04) beverage02;
        coffee02.drinkEspresso();

        Beverage04 beverage03 = new Latte04("라떼", 7000.0, "딸기 우유");
        beverage03.showInfo();

        Latte04 coffee03 = (Latte04) beverage03;
        coffee03.enjoyLatte();
        ((Latte04)beverage03).enjoyLatte();// 위의 2줄과 같은 기능
        System.out.println();

        //승급개념과 배열의 사용
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이프레소", 2000.0, 1),
                new Latte04("바나나라떼", 6000.0, "바나나 우유")
        };

        for (int i = 0; i < beverage.length; i++) {
            System.out.println("-----------------------------------------");
            beverage[i].showInfo();

            // instanceof 승급된 객체변수가 수많은 sub클래스 중에서 어떤 클래스로 생성되었는지를
            // 판단하고자 할 때 사용
            if(beverage[i] instanceof Americano04){// 아메리카노
                Americano04 amri = (Americano04) beverage[i];
                amri.sipAmericano();
            } else if (beverage[i] instanceof Espresso04) {//에스프레소
                Espresso04 espre = (Espresso04) beverage[i];
                espre.drinkEspresso();
            } else if (beverage[i] instanceof Latte04) {//라떼
                Latte04 latte = (Latte04) beverage[i];
                latte.enjoyLatte();
                System.out.println();
            } else {// 예비용
            }
            //모든 객체는 프린트할때  묵시적으로 Object클래스의 toString() 메소드가 호출이 됩니다
            System.out.println(beverage[i].toString());// .toString()는 생략해도 된다
        }
    }
}
