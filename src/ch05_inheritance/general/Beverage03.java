package ch05_inheritance.general;

/*
sub클래스가 super클래스의 변수에 접근하는 방법
1. private로 제한된 변수는 getter/ setter로 접근
2. private 대신에 protected로 작성
3. 생성자를 통한 대입
 */

public class Beverage03 {
    private String name;
    private double price;

    public Beverage03(){} //coding의 클래스 관계 error메세지 방지를 위해
    // 매게볍수 0개 짜리 생성자는 향상 예비적으로 준비해 둔다.

    public Beverage03(String name, double price){// 매게볍수 2개 짜리 생성자이다.
        this.name = name;
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료이름: "+name);
        System.out.println("가격: "+price);
    }
}
