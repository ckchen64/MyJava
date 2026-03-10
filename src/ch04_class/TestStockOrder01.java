package ch04_class;

public class TestStockOrder01 {
    private String stockName;
    private int quantity;
    private int price;
    private String orderType;


    public String getStockName(){ return stockName; }// 저장된 값을 불러올때(get)
    public void setStockName(String _stockName){//private으로 선언되면 변수는 get와 결합할 때 첫자를 대문자로 변경
        stockName = _stockName;
    }// 객체에 값을 생성(할당)할 때(set)

    public int getPrice(){ return price ; }
    public void setPrice(int _price){//private으로 선언되면 변수는 get와 결합할 때 첫자를 대문자로 변경
        price = _price;
    }

    public int getQuantity(){ return quantity ; }
    public void setQuantity(int _quantity){//private으로 선언되면 변수는 get와 결합할 때 첫자를 대문자로 변경
        quantity = _quantity;
    }

    public String getOrderType(){ return orderType ; }
    public void setOrderType(String _orderType){ orderType = _orderType ; }

    String showInfo(){
        String orderResult = "종목명: "+stockName+", 단가: "+price+", 수량: "+quantity
                             +"주문형태: "+orderType+"주문총액: "+calculateTotalAmount();
        return orderResult;   }

    public int calculateTotalAmount(){ return price * quantity; }
}
