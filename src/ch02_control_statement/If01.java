package ch02_control_statement;

public class If01 {
    static void main() {
        // su가 짝수이면 출력함니다
        int su = 5;
        if(su%2 == 0){ //단순 if문
            System.out.println(su+"는 짝수");
        }
        System.out.println("나는 무조건 실행됩니다");
    }
}
