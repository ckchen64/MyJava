package ch05_inheritance.mybeverage;

public class Beverage04 {
        private String name;
        private double price;

    @Override
    public String toString() {
        String imsi = "상품명:"+name+", 단가: "+ price;
        return imsi;
//        return super.toString() +"\n" + imsi;
    }

    public String getName() {//Alt+insert
        return name;
    }

    public Beverage04(){} //coding의 클래스 관계 error메세지 방지를 위해
        // 매게볍수 0개 짜리 생성자는 향상 예비적으로 준비해 둔다.

        public Beverage04(String name, double price){// 매게볍수 2개 짜리 생성자이다.
            this.name = name;
            this.price = price;
        }

        protected void showInfo() {
            System.out.println("음료이름: "+name);
            System.out.println("가격: "+price+"원");
        }
}

