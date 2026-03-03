package ch01_variable_operator;

public class Casting {
    static void main() {
        double d = 100 ; //묵시적 형변환(casting)이 이루어 짐 : 정수가 double로 인해 100.0이 됨
        System.out.println("d: " + d); // 100.0 자동형변환

        int i = (int)3.14 ; // 명시적 형변환 (형변환 연산자) : 3
        System.out.println("i: " + i);

        System.out.println(14/5); // 지정되지 않은 타입: 자바는 정수/정수 = 정수(2)이다
        System.out.println((double)14/5); // 실수형으로 변환 (double)정수(14.0)/(double)정수(5.0) = 실수(2.8)이다
        System.out.println((double)(14/5)); // 실수형으로 변환 (double)(정수/정수) = 실수(2.0)이다

        int kor = 50, eng = 60, math = 80 ;
        int total = kor + eng + math ;
        System.out.println("총점 : " + total);

        double average = total / 3; //수학적 결과 63.3333...이 정수(63)이 되고 double(63)=63.0
        System.out.println("평균 : " + average); //63.0

        average = (double)total / 3;
        System.out.println("평균2 : " + average);//63.3333


        char ch1 = 'c';//99, (C)67
        char ch2 = 'a';//97, (A)65
        boolean bool1 = ch1 > ch2 ; //묵시적 형변환
        System.out.println("bool1 : " + bool1);

        int result = ch1 - ch2 + (char)'c' ;
        System.out.println("result : " + result);

        char ch3 = 'D';
        String str = ch3>='A' && ch3<='Z'? "대문자" : "대문자아님";
        System.out.println("str : " + str);


    }
}