package ch01_variable_operator;

/*
작성자 : 홀길동
작성일 : 2026/02/26
내용 : 처음 만들어 보는 자바 프로그램
여러줄의 주석을 삽입할 때
 */

//주석(Comment): 프로그램 실행에 영향을 주지 않는 설명문구
public class YourPrint {
    // main() 메소드는 프로그램 starting point
    static void main(String[] args) {
        //모든 명령문장의 끝은 ;으로 마침한다.
        //모든 명령문은 {}안에 위치하여야 한다.
        System.out.println("world");
        System.out.println("홍 길동"); /*내이름을 출력합니다.*/
        /* 문자는 외따옴표, 문자열은 쌍따옴표
        sout(단축어) : System.out.println() = 문자열을 출력하고 엔터키를 눌러 준다
         */
        System.out.println("장");//성씨 입니다.
        System.out.println(); // 1줄의 공백을 출력하고, 엔터키를 눌러 준다
        System.out.println("철");
        System.out.println("수");
    }
}
