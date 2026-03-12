package ch06_abstract_interface.cafeinterface;

public class Espresso05 extends Beverage05 implements ShotAddable {
    public int shotCount;

    @Override
    public void AddShot(int count) {
        this.shotCount += count;
        System.out.println("샷이 "+count);
    }

    public Espresso05(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    @Override
    public void drink() {
        System.out.println("샷 횟수"+shotCount+"인 "+super.getName()+"를 마시면 좋습니다");
    }

    @Override
    public String toString() {
        return super.toString()+", 샷 횟수: "+shotCount;
    }
}
