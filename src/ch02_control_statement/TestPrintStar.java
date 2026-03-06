package ch02_control_statement;

public class TestPrintStar {
    static void main(String[] args) {

        for (int star = 1; star <= 12; star++) {
            System.out.print("*");
            if(star%5 == 0){
                System.out.println();
            }
        }
    }
}
