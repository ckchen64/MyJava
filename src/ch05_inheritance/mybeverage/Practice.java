package ch05_inheritance.mybeverage;

public class Practice {
    static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                // 홀수인 경우 아래 코드를 실행하지 않고 다음 반복(i++)으로 이동
                continue;
            }
            System.out.println("짝수: " + i);
        }
    }
}
