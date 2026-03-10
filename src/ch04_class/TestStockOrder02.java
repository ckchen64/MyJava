package ch04_class;

public class TestStockOrder02 {
    private String stockName;
    private int quantity;
    private int price;
    private String orderType = "매수";// '매수'를 default값으로 지정하였다.

//    public Product03(String name, int price, String inputdate){
//        this.name = name;//객체 자신(this)이 소유한 name변수에 매개변수 name의 값을 할당하시오
//        this.price = price;
//        this.inputdate = inputdate;
//    }


    public TestStockOrder02(String stockName, int price,int quantity, String orderType){//생성자의 포맷을 정의한다
        this.stockName = stockName;//객체 자신(this)이 소유한 name변수에 매개변수 name의 값을 할당하시오
        this.quantity = quantity;
        this.price = price;
        this.orderType = orderType;
    }


    public void showInfo(){
        System.out.println("종목명: "+stockName+", 단가: "+price+", 수량: "+quantity
            +", 주문형태: "+orderType+", 주문총액: "+calculateTotalAmount());
    }

    public int calculateTotalAmount(){ return price * quantity; }
}
