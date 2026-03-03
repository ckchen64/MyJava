package ch01_variable_operator;

public class Condition02 {
    static void main() {
        int x = 10, y = 20 ;

        // 2개의 숫자에서 큰 수 고르기
        //타입 result = 조건식 ? 조건식이 참 : 조건식이 거짓 ;
        // 조건식은 관계,논리 연산자를 이해하여야 한다.
        int result = x >= y ? x : y ; // int 조건식의 타입은 결과값에 따라 결정
        String R = x >= y ? "x" : "y" ; // String 조건식의 타입은 결과값에 따라 결정
        System.out.println("비교결과: " + R + " = " + result);
        System.out.println();

        //x가 짝수 인지 홀수 인지 판단
        String result01 = y%2 == 0 ? "짝수" : "홀수" ; // result1 한번 정의된 변수는 동일이름으로 변경할 수 없다
        System.out.println("비교결과: " + R + " = " + result01);

        //a가 3의 배수이면 제곱을 아니면 더하기 5의 결과값 출력
        int a = 6 ;
        double result2 = a%3 == 0 ? Math.pow(a,2) : a + 5 ; // x*x = Math.pow(x,2)
        System.out.println(result2);

        // 3월이 봄인가요?
        int month = 3 ;
        String season= month>=3 && month <=5 ? "봄입니다" : "봄이 아닙니다" ;
        System.out.println(+month + "월은 " + season);



    }
}
