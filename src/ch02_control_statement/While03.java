package ch02_control_statement;

import java.util.Scanner;

public class While03 {
    static void main(String[] args) {
        // 1~100 까지의 정수 중 임의의 숫자 n을 확인합니다
        int answer = 40; //컴퓨터가 생각하고 있는 숫자로 가정함

        //바코드 스캐너(Scanner) 준비 : Scanner - 시스템 내부에 설정된 설정값(type)이고 설정 후
        Scanner scan = new Scanner(System.in); // while문 다음에 위치해도 된다
        // Scanner타입의 scan변수를 생성하여 Scanner(System.in)값을 할당하면,
        // import문장이 상부에 생성된다 import java.util.Scanner;

        while(true){ // endless while loop : 'true'를 찾을 때까지 loop 가동

            System.out.println("1~100 까지의 정수 중 임의의 숫자입력 하세요");
            int input = scan.nextInt(); // scan변수의 입력방식 설정 : 사용자가 입력할 숫자
            System.out.println("입력한 숫자: " +input);

            if(answer == input) { //정답일 경우
                System.out.println("correct!");
                break;

            } else if(answer > input){// 정답이 큰 경우
                System.out.println(input+"보다 큰 숫자 입니다");

            } else{
                System.out.println(input+"보다 작은 숫자 입니다");

            }
        }

    }
}
