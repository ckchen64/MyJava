package ch05_inheritance.mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount; // 샷추가 횟수

    @Override
    public String toString() {
        String imsi = ", 샷추가 횟수: "+ shotCount;
        return super.toString()+imsi;
    }

    Espresso04() {
    };

    Espresso04(String name, Double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }
    public void drinkEspresso(){
        String message = super.getName()+"에 샷추가는 "+shotCount+"회 입니다";
        System.out.println(message);
        System.out.println();
    }
}