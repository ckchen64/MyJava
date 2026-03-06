package ch02_control_statement;

public class For02 {
    static void main(String[] args) {
        // 1~10까지의 정수 중에서 짝수 혹은 홀수의 합
        int odd=0, even=0 ;
        int i;

        for ( i = 1; i < 11; i++) {
            if(i%2 == 0){
                even += i;
            } else{
                odd += i;
            }
            System.out.println(i+" "+odd+"홀수의 합: "+odd);
            System.out.println(i+" "+even+"짝수의 합: "+even);
        }

        System.out.println(i+"홀수의 합: "+odd);
        System.out.println(i+"짝수의 합: "+even);

    }
}
