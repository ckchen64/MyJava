package ch02_control_statement;

public class Test99단 {
    static void main(String[] args) {

        int dan, times ;
        for( dan = 1; dan <= 9; dan++){
            for( times = 1; times <= 9; times++){
                System.out.println(dan + "x" + times + "=" + dan*times);
            }
            System.out.println();
        }
    }
}
