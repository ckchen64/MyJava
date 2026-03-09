package ch04_class;

public class Product02 {
    // 변수의 사용제한자:
    // private(class내)>default>protected(package내)>public(모든범위)
    // 변수(variable)=필드(field)는 같은 의미로 사용된다
    // 멤버변수는 타입별로 기본값 있음: 문자열(nul), 정수(0), 실수(0.0)
    static String brand ; // 브랜드(static 변수 = 클래스변수)
                          // static변수는 모든 객체들이 공유할 수 있는 장점이 있으나, 각 지역에서 임의 변경이 있을 때, 혼란을 만든다
                          // static변수는 클래스 이름으로 접근 가능하며 '클래스변수'라고 부른다.
    private String name; //상품명
    private int price; // @단가
    String inputdate; //입고일자

    public String getName(){
        return name;
    }  // public 변수타입 get변수명() { return 변수명;}

    public void setName(String name){//private으로 선언되면 변수는 get와 결합할 때 첫자를 대문자로 변경
                                     // 매개변수는 지역변수의 부분집합이다
        this.name = name; // this : 해당 클래스에 정의된 변수를 의미 (name = _name)
                          // public void set변수명(String 변수명){this.변수명 = 변수명;}
    }

    public int getPrice(){// private으로 선언된 변수를 인용할 때,
        // public 타입 get변수명(){ return 변수명}
        return price ;
    }

    public void setPrice(int price){//private으로 선언되면 변수는 get와 결합할 때 첫자를 대문자로 변경
        this.price = price;
    }
    public void getInputdate(){//private으로 선언되면 변수는 get와 결합할 때 첫자를 대문자로 변경
        this.inputdate = inputdate;
    }

}
