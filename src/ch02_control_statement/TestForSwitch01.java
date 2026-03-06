package ch02_control_statement;

public class TestForSwitch01 {
    static void main(String[] args) {
        int even = 0, odd = 0;
        for ( int i= 1; i <= 10 ; i++) {
            switch (i%2){
                case 0:
                    even += i;
                    break;
                case 1:
                    odd += i;
                    break;
                default:
                    break;
            }
        }
        System.out.println("짝수합: "+even+"  홀수합: "+odd);
    }
}
