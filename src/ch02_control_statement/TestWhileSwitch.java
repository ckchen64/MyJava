package ch02_control_statement;

public class TestWhileSwitch {
    static void main(String[] args) {
        int even=0, odd=0, i=1;
        while (i<=10){
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
            i++;
        }
        System.out.println("짝수합: "+even+"  홀수합: "+odd);
    }
}
