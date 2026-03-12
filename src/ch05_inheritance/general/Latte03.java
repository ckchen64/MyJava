package ch05_inheritance.general;

import ch05_inheritance.mybeverage.Beverage04;

public class Latte03 extends Beverage03 {
    private String milkType;

    Latte03(){};//우유의 종류
    Latte03(String name, Double price, String milkType){
        super(name,price);
        this.milkType = milkType;
    }

    public void printInfo(){
        super.showInfo();
        System.out.println("우유종류: "+milkType);
        System.out.println();
    }


}
