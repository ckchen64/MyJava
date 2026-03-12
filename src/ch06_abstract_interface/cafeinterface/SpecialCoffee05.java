package ch06_abstract_interface.cafeinterface;

public class SpecialCoffee05 extends Beverage05 implements WaterAdjustable,ShotAddable,MilkAddable{

    private  double waterAmount;
    private int shotCount;
    private String milkType;

    public SpecialCoffee05(String name, double price, String milkType, int shotCount, double waterAmount) {
        super(name, price);
        this.milkType = milkType;
        this.shotCount = shotCount;
        this.waterAmount = waterAmount;
    }

    @Override
    public void drink() {
        System.out.println(super.getName()+"을(를) 마십니다");
    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("변경이전: "+this.milkType+", 변경이후: "+milkType);
    }

    @Override
    public void AddShot(int count) {
        this.shotCount += shotCount;
        System.out.println("샷이" +count+ "개 추가되어 "+ shotCount+"개 입니다");
    }

    @Override
    public void adjustWater(double amount) {
        this.waterAmount += waterAmount;
        System.out.println("에"+waterAmount+"ml를 추가하였습니다.");
    }
}
