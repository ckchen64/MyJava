package ch01_variable_operator;

public class PlusMinus01 {
    static void main() {
        int a = 10, b = 20, c, d ;

        c = ++a + b++ ; //++a: a에 1을 증가시키고 산술연산, b--: b를 산술연산 후에 b를 1증가

        System.out.println("a : " + a); //11
        System.out.println("b : " + b); //21
        System.out.println("c : " + c); //31
        System.out.println();

        a = 15 ;
        b = 12 ;
        c = --a + --b ;

        System.out.println("a : " + a); //14
        System.out.println("b : " + b); //11
        System.out.println("c : " + c); //25
        System.out.println();


        a = 10 ;
        b = 20 ;
        ++a ; //11
        b-- ; //19
        c = ++a + b-- ;

        System.out.println("a : " + a); //12
        System.out.println("b : " + b); //18
        System.out.println("c : " + c); //31=12+19



    }
}
