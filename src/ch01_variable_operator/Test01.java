package ch01_variable_operator;

public class Test01 {
    static void main() {
        int x = 3, y = 5, z ;
        z = x++ + --y ;
        // 3 4  2  1

        System.out.println("x: "+x); //3+1=4
        System.out.println("y: "+y); //5-1=4
        System.out.println("z: "+z); //3+4=7
        System.out.println();

        z += --x + y++ ;
        //3  1   2  4
        // z = z + --x + y++
        //   4   2  1  3   5

        System.out.println("x: "+x); //4-1=3
        System.out.println("y: "+y); //4+1=5
        System.out.println("z: "+z); //7+(3+4)=14
        System.out.println();

        int a = 3, result ;
        result = a++ + ++a ;
        System.out.println("result ; " + result); // 8=3+(1+4)
        System.out.println(a); //5
        System.out.println();

        int b = 3, result1 ;
        result1 = ++b + b++ ;
        System.out.println("result ; " + result1); // 8=4+4
        System.out.println(b); //4+1(=5)


    }
}

