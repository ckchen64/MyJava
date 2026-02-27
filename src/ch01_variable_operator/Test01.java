package ch01_variable_operator;

public class Test01 {
    static void main() {
        int x = 3, y = 5, z ;
        z = x++ + --y ;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);
        System.out.println();

        z += --x + y++ ;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);

    }
}
