package ch05_inheritance.general;

public class Americano03 extends Beverage03 {
    private double waterAmount; //물의 양
    public Americano03(String name, double price,double waterAmount){

        // sub클레스의 생성자 첫줄에는 super();라는 단어가 숨어있다
        // 사용자가 super(매개변수): 형식으로 재정의하면 super();는 사라진다.
        //
        super(name,price);// 생성자를 통하여 데이터를 super클래스에게 넘겨 준다
        // super클래스의 생성자를 호출하여 자기(Americano)클래스의 변수생성자로 사용한다.
        this.waterAmount = waterAmount;
    };

    public void printInfo() {// 접근제어자(public)은 생략할 수 있다
        super.showInfo();
        System.out.println("투입된 물의 량: "+ waterAmount+"ml");
        System.out.println();
    }


}
