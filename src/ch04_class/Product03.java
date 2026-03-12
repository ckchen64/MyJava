package ch04_class;

public class Product03 {
    private String name ; //
    private int price = 500 ; // 상품의 단가가 입력되지 않으면 500원으로 디폴트값을 지정할 때
    private String inputdate ; //


    //기본(default) 생성자 : 눈에 보이지 않음,
    // 정의: 갹체 생성시 오직 1회만 호출되는 메소드
    // 개발자가 생성자를 정의하면 기본생성자에서 개발자의 생성자로 대체
    // 생성자 만들기 : 접근제어자 (type:생략) 메소드명(매개변수 리스트){... }
    // 메소드, 생성자의 다중정의(overloading) : 같은 메소드명을 사용하면서 다른 타입매개변수, 변수개수 변경을 사용하여 가동성과 다양한 호출에 대응

    public Product03(){
        System.out.println("HHH");
    }

    public Product03 (String name, String inputdate){
        this.name = name;//객체 자신(this)이 소유한 name변수에 매개변수 name의 값을 할당하시오
        // 생략된 필드는 default값으로 출력된다(price = 500원)
        this.inputdate = inputdate;
    }

 //   public void setName(String name,String inputdate){this.name = name;this.inputdate = inputdate;}
    // setter에서는 매게변수가 1개만 지정되어야 한다

    public Product03(String name, int price, String inputdate){//생성자의 포맷을 정의한다
        this.name = name;//객체 자신(this)이 소유한 name변수에 매개변수 name의 값을 할당하시오
        this.price = price;
        this.inputdate = inputdate;
    }

    public void display() {
        System.out.println("상품명: "+name+", 단가: "+price+", 입고일: "+inputdate) ;
    }
}
