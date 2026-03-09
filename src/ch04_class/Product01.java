package ch04_class;

public class Product01 {// 단계01: 클래스 정의
    // 멤버변수(필드)와 필요기능, 메소드를 설계한다
    // 변수(variable)=필드(field)는 같은 의미로 사용된다
    String name; //상품명
    int price; // @단가
    String inputdate; //입고일자

    // 메소드 만들기: 정수 1개를 입력 받아서 +5를 수행하고 값을 반환합니다
    //반환타입, 메소드이름(매개변수1, 매개변수2,...){...}
    // 매개변수는 입력값, 메소드이름: Plus5
    int plus5(int x){
        return x + 5;
    }

    // 상품명: 신라면, 단가: 1000원, 입고일자: 2026/03/01
    String showData(){
        String result = "상품명: "+name+", 단가: "+price+", 입고일자: "+inputdate;
        return result;
    }

    // void ; 메소드의 반환값이 필요없을 경우
    void display(){
        System.out.println("상품명: " + name);
        System.out.println("단가: " + price);
        System.out.println("입고일자: " + inputdate);
    }
}
