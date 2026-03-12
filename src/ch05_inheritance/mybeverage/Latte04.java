package ch05_inheritance.mybeverage;

public class Latte04 extends Beverage04 {
    private String milkType;

    @Override
    public String toString() {
        String imsi = ", 우유의 종류: "+ milkType;
        return super.toString() + imsi;
    }

    Latte04(){};//우유의 종류
    Latte04(String name, Double price, String milkType){
        super(name,price);
        this.milkType = milkType;
    }
    public void enjoyLatte(){
        String message = "부드럽고 크리미한 %s를 마십니다. \n";
        System.out.printf(message, super.getName());

    }
}
