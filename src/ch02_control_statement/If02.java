package ch02_control_statement;

public class If02 {
    // 작수이면 '하하하'를 홀수이면 '호호호'를 출력
    static void main() {
        int su = 5;

        //양자 택일 구문 if(조건식){ } else { }
        if(su%2 == 0){// 짝수이면
            System.out.println("하하하 "+su+"는 짝수");
        }
        else{ //홀수이면
            System.out.println("호호호 "+su+"는 홀수");
        }
    }
}
