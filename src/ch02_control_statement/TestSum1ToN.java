package ch02_control_statement;

public class TestSum1ToN {
    static void main(String[] args) {

        int sum = 0, n = 5  ;
        for( int i = 1; i <= n; i++){
           sum += i;
        }
        System.out.println("1부터 "+n+"까지의 합계: "+sum); //1~5까지의 합은 15
    }
}
