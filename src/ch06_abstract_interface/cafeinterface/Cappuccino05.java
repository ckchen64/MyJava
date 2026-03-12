package ch06_abstract_interface.cafeinterface;

public class Cappuccino05 extends Beverage05 implements MilkAddable  {
    private String milkType;
    private double foamAmount;// 거품량

    public Cappuccino05(String name, double price, String milkType, double foamAmount) {
        super(name, price);
        this.milkType = milkType;
        this.foamAmount = foamAmount;
    }


    @Override
    public void drink() {
        System.out.println("거품의 량이 "+foamAmount+"ml인"+super.getName()+"를 마십니다.");
    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("현재 "+this.milkType+"에서 "+milkType+"으로 변경합니다.");
        this.milkType = milkType; // 추가 우유의 종류를 변경합니다.
    }
}
