package ch06_abstract_interface.cafeinterface;

public class Americano05 extends Beverage05 implements WaterAdjustable {
    public double waterAmount;

    public Americano05(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }

    @Override
    public void adjustWater(double amount) {
        this.waterAmount += amount; //양을 추가합니다.
        System.out.println("물추가: "+amount+"ml");
        System.out.println("현재 물의 량 "+this.waterAmount);
    }

    @Override
    public void drink() {
        System.out.println("물의 량이 "+waterAmount+"ml인"+super.getName()+"를 뜨거운 빵과 함께 마시면 좋습니다");
    }

    @Override
    public String toString() {
        return super.toString() + ", 물의 양: " +waterAmount ;
    }
}
