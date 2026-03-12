package ch05_inheritance.mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount; //물의 양

    @Override
    public String toString() {
        String imsi = ", 물의 양: "+ waterAmount;
        return super.toString()+imsi;
    }

    public Americano04(String name, double price, double waterAmount){

        // sub클레스의 생성자 첫줄에는 super();라는 단어가 숨어있다
        // 사용자가 super(매개변수): 형식으로 재정의하면 super();는 사라진다.
        //
        super(name,price);// 생성자를 통하여 데이터를 super클래스에게 넘겨 준다
        // super클래스의 생성자를 호출하여 자기(Americano)클래스의 변수생성자로 사용한다.
        this.waterAmount = waterAmount;
    }

    // sip : 홀짝 마시다
    public void sipAmericano(){
        String message = super.getName() + "를 홀짝 마십니다";
        System.out.println(message);
        System.out.println();
    }
}
