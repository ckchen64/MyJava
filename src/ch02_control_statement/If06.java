package ch02_control_statement;

public class If06 {
    static void main() {
        int month = 10;
        if(month%12 >=3 && month%12 <=5) {
            System.out.println(month + "월은 봄입니다");
        } else if (month%12 >=6 && month%12 <=8) {
            System.out.println(month + "월은 여름입니다");
        } else if (month%12 >=9 && month%12 <=11) {
            System.out.println(month + "월은 가을입니다");
        } else {
            System.out.println(month + "월은 겨울입니다");
        }
        System.out.println();

        switch(month){
            case 3: case 4: case 5:
                System.out.println(month + "월은 봄입니다");
                break;
            case 6: case 7 :case 8:
                System.out.println(month + "월은 여름입니다");
                break;
            case 9: case 10 : case 11:
                System.out.println(month + "월은 가을입니다");
                break;
            case 1: case 2 :case 12:
                System.out.println(month + "월은 겨울입니다");
                break;
            default:
        }
    }
}
