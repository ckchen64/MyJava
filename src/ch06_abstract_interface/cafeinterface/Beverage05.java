package ch06_abstract_interface.cafeinterface;

//추상(abstract)메소드를 생성하기 위해서는 클래스를 추상클래스(abstract class)로 설정하여야 한다.
public abstract class Beverage05 {
    //카페이름은 객체이름으로 정의하지 않아도 접근할 수 있도록 하는 것이 좋다.
    public static final String STORE_NAME = "GLORYA"; //static 클래스급 변수
    private static int beverageCount = 0 ;

    public static int getBeverageCount() {
        return beverageCount;
    }


    private String name; // 멤버변수
    private double price;

    // 멤버변수가 private으로 선언되었으므로 sub클래스에서 사용하기 위한 수단(getter)을 구비해 주어야 한다.
    public String getName() {
        return name;
    }

    // 모든 음료는 마십니다.
    // 추상메서드를 설정하면, Casting 단계가 불필요하다.
    public abstract void drink(); // 추상(abstract)메소드가 있는 클래스는 추상클래스(abstract class) 이어야 한다.

    public Beverage05() { }; // 매개변수 0개의 생성자

    public Beverage05(String name, double price) {
        this.name = name;
        this.price = price;

        beverageCount++; // Beverage05의 this.name가 생성되면 주문건수를 추가한다.

    }


    @Override
    public String toString() {
        return "주문내역 " + "\n"+
                "품목: " + name +
                ", 단가: " + price ;
    }
}
