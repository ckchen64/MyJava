package ch02_control_statement;

import java.util.Scanner;

public class While04Jumsu {
    static void main(String[] args) {
        // 임의의 점수 수개를 입렵합니다
        int total = 0;
        double average = 0.0;
        int counter = 0; //시험과목(3과목으로 가정)의 숫자 = 점수입력의 횟수

        //바코드 스캐너(Scanner) 준비 : Scanner - 시스템 내부에 설정된 설정값(type)이고 설정 후
        Scanner scan = new Scanner(System.in); // while문 다음에 위치해도 된다
        // Scanner타입의 scan변수를 생성하여 Scanner(System.in)값을 할당하면,
        // import문장이 상부에 생성된다 import java.util.Scanner;

        while(true){ // endless while loop : 'true'를 찾을 때까지 loop 가동

            System.out.println("점수를 입력 하세요");
            int jumsu = scan.nextInt(); // scan변수의 입력방식 설정 : 사용자가 입력할 숫자
            System.out.println("입력한 점수: " +jumsu);

            if(jumsu < 0 || counter >= 3) { //음수값일 경우와 시험과목 숫자(3회) 이상 입력하면
                System.out.println("잘못된 값입니다!");
                break;
            }
            total += jumsu;
            counter++; // while loop가 1회 실행될 때마다 counter 변수가 1 증가한다

            }
        System.out.println("총합: "+total);
        System.out.println("평균: "+total/+counter);
    }
}
