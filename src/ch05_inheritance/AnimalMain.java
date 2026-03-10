package ch05_inheritance;

public class AnimalMain {
    static void main(String[] args) {
        // 클래스이름 객체이름 = new 생성자이름();
        // 같은 package 안에서 super-sub으로 상속
        // extend된 클래스의 변수(필드)는 다른 클래스에서 공용으로 사용할 수 있다

        // 리트리버와 말티즈의 객체를 생성하다
        Dog retriver = new Dog();
        retriver.name = "리트리버01";
        retriver.age = 2;
        retriver.guid = false;
        retriver.feed = "건식사료";

        System.out.println("객체정보");
        System.out.println(retriver.toString());//retriver는 ch05_inheritance.Dog@3f99bd52에 있는 정보이다

        retriver.display();
        retriver.bark();
        System.out.println();

        Dog maltese = new Dog();
        maltese.name = "말티즈01";
        maltese.age = 7;
        maltese.guid = true;

        maltese.display();
        maltese.bark();
        System.out.println();

        // 페르시안과 샴의 객체를 생성하다
        Cat persian = new Cat();
        persian.name = "페르시안01";
        persian.age = 6;
        persian.indoor = false;
        persian.feed = "건식사료";

        System.out.println("객체정보");
        System.out.println(persian.toString());//retriver는 ch05_inheritance.Dog@3f99bd52에 있는 정보이다

        persian.display();
        persian.eat();
        persian.bark();
        System.out.println();

        Cat siamese = new Cat();
        siamese.name = "샴01";
        siamese.age = 7;
        siamese.indoor = true;
        siamese.feed = "습식사료";

        siamese.display();
        siamese.eat();
        siamese.bark();
        System.out.println();

    }
}
