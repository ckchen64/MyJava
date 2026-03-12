package ch05_inheritance.general;

public class Espresso03 extends Beverage03{
    private int shotCount; // 샷추가 횟수

    Espresso03(){};
    Espresso03(String name, Double price,int shotCount){
        super(name,price);
        this.shotCount = shotCount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("샷추가: "+shotCount+"회");
        System.out.println();
    }
}
