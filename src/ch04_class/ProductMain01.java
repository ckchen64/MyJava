package ch04_class;

public class ProductMain01 {
        // 단계02 : 객체(실세계의 구체적 사물) 생성 'new'생성자
        // '생성자 이름'은 '클래스 이름'과 일치해야 한다.
        // 클래스이름 객체이름 = new 생성자이름();
        // 다음 단어들은 자바 API에서 제공하는 클래스입니다.
        // String (클래스),System (클래스),Scanner (클래스),ArrayList (클래스)
    static void main(String[] args) {
        Product01 shin = new Product01();//신라면, 생성자 만들기
        // 동일 패키지의 다른 클래스에 'Product'클래스가 있다.
        // 만일, 클래스 이름을 'Factory'라고 하였다면 생성자도 'Factory'로 일치시켜야 한다.

        Product01 blackbeen;
        blackbeen = new Product01();//짜파게티

        // 단계03: 멤버변수에 값을 할당
        //'.' : 멤버참조 연산자
        shin.name = "신라면";
        shin.price = 1000;
        shin.inputdate = "2026/03/01";

        // 단계04: 멤버변수들의 값을 출력
        System.out.println("1번상품 정보 출력");
        System.out.println("상품명: " + shin.name);
        System.out.println("단가: " + shin.price);
        System.out.println("입고일자: " + shin.inputdate);

        blackbeen.name = "짜파게티";
        blackbeen.price = 2000;
        blackbeen.inputdate = "2026/03/02";

        // 단계04: 멤버변수들의 값을 출력
        System.out.println();
        System.out.println("2번상품 정보 출력");
        System.out.println("상품명: " + blackbeen.name);
        System.out.println("단가: " + blackbeen.price);
        System.out.println("입고일자: " + blackbeen.inputdate);

        int su = 3;
        int result = shin.plus5(su); // 멤버변수(shin)가 사용하기 위해서
                                     // Product클래스에서 정의된 메소드를 호출하였다
        System.out.println("결과: "+result); //8

        String str = shin.showData();
        System.out.println(str);

        shin.display(); // 메서드에 void 선언되어 있으므로 출력되는 값이 없다
        System.out.println("1");
    }
}
