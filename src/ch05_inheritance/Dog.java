package ch05_inheritance;

//상속을 해주는 Animal클래스(super클래스)를 Dog클래스(sub클래스)가 상속(extends)을 받습니다
public class Dog extends Animal{
    boolean guid ; //안내견 여부


    @Override
    public void bark() {// super클래스 Animal에 선언된 bark()메소드를 다시 정의한다.
        System.out.println(super.name+"이(가) 멍멍하고 짖습니다");
    }

    @Override // 이 메소드는 오버라이딩 되었습니다
    // 상속관계의 sub클래스에서 super클래스 메소드를 수정변경해서 사용하는 것

    public void display() {

        //super는 Animal 클래스
        super.display();

        if (guid) {
            System.out.println("안내견 여부: 적합");
        } else {
            System.out.println("안내견 여부: 부적합");
        }
    }
}
