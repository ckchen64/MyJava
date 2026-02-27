package ch01_variable_operator;

public class PrintMe {
    //이름 나이 키 몸무게 혈액형 유형 진위

    static void main() {

        // 변수정의 type name
        String name ;
        int    age  ;
        double height, weight ; // 같은 유형은 몰아서 정리 가능
        String blood ;
        char type ;
        boolean bool ;

        // 변수에 값 할당
        name = "홍길동" ;
        age = 36 ;
        height = 175.2 ;
        weight = 67.5 ;
        blood = "O" ;
        type = 'B' ;
        bool = true ;

        // 할당된 값의 출력
        System.out.println("이름= "+ name);
        System.out.println("나이= "+ age);
        System.out.println("키= "+ height);
        System.out.println("몸무게= "+ weight);
        System.out.println("혈액형= "+ blood);
        System.out.println("유형= "+ type);
        System.out.println("진위= "+ bool);

    }
}
