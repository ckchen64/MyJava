package ch02_control_statement;

public class Switch01 {
    static void main() {
        // 주사위 눈금의 수가 짝수인지 홀수인지 판단하기
        int su = 7 ;

        switch (su){//switch 제어문은 조건판정 이후 break제어문까지 실행한다
            // 초급자가 코딩하는 방식이다
            case 1:
                System.out.println("홀수");
                break;
            case 2:
                System.out.println("짝수");
                break;
            case 3:
                System.out.println("홀수");
                break;
            case 4:
                System.out.println("짝수");
                break;
            case 5:
                System.out.println("홀수");
                break;
            case 6:
                System.out.println("짝수");
                break;
            default : // case에 열거되지 않는 항목이 오면 여기가 실행됩니다.
                System.out.println("잘못된 숫자 입력입니다");
        }
        System.out.println();

        switch (su) {//switch() {case1: break;.... default:}
            // switch 제어문은 조건판정 이후 break제어문까지 실행한다
            // 중급자가 코딩하는 방식이다
            case 1:  case 3:  case 5:
                System.out.println("홀수");
                break;
            case 2:  case 4:  case 6:
                System.out.println("짝수");
                break;
            default: // case에 열거되지 않는 항목이 오면 여기가 실행됩니다.
                System.out.println("잘못된 숫자 입력입니다");
        }
    }
}
