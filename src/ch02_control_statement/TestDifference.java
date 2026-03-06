package ch02_control_statement;

public class TestDifference {
    static void main(String[] args) {
        int sumA = 0, sumB = 0;

        for (int i = 1; i <= 50; i++) {
            if (i%3 == 0) {
                sumA += i;
            } else {
                sumB += i;
            }
        }
        int diff = sumA - sumB;

        System.out.println("3의 배수의 합: "+sumA);
        System.out.println("3의 배수가 아닌 정수의 합: "+sumB);
        System.out.println("차이: "+diff);
    }
}
