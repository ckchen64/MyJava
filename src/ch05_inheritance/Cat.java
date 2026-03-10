package ch05_inheritance;

//상속을 해주는 Animal클래스(super클래스)를 Cat클래스(sub클래스)가 상속(extends)을 받습니다
public class Cat extends Animal {
    boolean indoor; //애완묘, 길고양이

    @Override
    public void bark() {
        System.out.println(super.name+"이(가) 야옹하고 웁니다");
    }

    @Override
    public void display() {
        super.display();

        if(indoor){
            System.out.println("구분: 애완묘");
        }else {
            System.out.println("구분: 길고양이");
        }
    }
}
