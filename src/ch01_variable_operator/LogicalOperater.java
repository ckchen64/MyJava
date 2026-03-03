package ch01_variable_operator;

//관계 연산자
public class LogicalOperater {
    static void main() {
        int x = 4, y = 7 ;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println();

        System.out.println("x > y :  " + (x > y));
        System.out.println("x >= y :  " + (x >= y));
        System.out.println();

        System.out.println("x < y :  " + (x < y));
        System.out.println("x <= y :  " + (x <= y));
        System.out.println();

        System.out.println("x == y :  " + (x == y));
        System.out.println("x != y :  " + (x != y));
        System.out.println();

        System.out.println("(x<y || x!=y):  " + (x<y || x!=y));
        System.out.println();

        boolean bool = x<y && x==y ;
        System.out.println("bool=(x<y && x==y):  " + bool);

        System.out.println("!(bool):  " + !bool);
        System.out.println();

        int month = 3 ;
        boolean result = month >= 3 && month <= 5 ;
        System.out.println("3월은 봄이다 : " + result);


    }
}
