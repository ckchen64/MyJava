package ch06_abstract_interface.cafeinterface;

public class Latte05 extends Beverage05 implements MilkAddable{
    private String milkType;

    public Latte05(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        return super.toString()+"우유종류: " + milkType;
    }

    @Override
    public void drink() {
        System.out.println("우유의 종류는 "+milkType+"를 넣은"+super.getName()+"은 좋습니다");
    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("현재우유 "+this.milkType+"에서 "+milkType+"으로 변경합니다.");
        this.milkType = milkType; // 추가 우유의 종류를 변경합니다.
    }
}
