package ch02_control_statement;

public class If03 {
    static void main() {
        int jumsu = 95;

        //다중선택 if(){} else if(){}... else{} : if제어문은 조건이 만족되면 프로세스를 종료한다
        //학점 부여
        if(jumsu >= 90){
            System.out.println(jumsu + "점은 A학점");
        } else if (jumsu >= 80) {
            System.out.println(jumsu + "점은 B학점");
        } else if (jumsu >= 70) {
            System.out.println(jumsu + "점은 C학점");
        } else if (jumsu >= 60) {
            System.out.println(jumsu + "점은 D학점");
        } else{
            System.out.println(jumsu + "점은 F학점");
        }

    }
}
