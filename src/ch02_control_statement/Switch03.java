package ch02_control_statement;

public class Switch03 {
    static void main(String[] args) {
        String name = "김철수";
        String grade = "B"; //고객의 등급(ABC 중 하나)
        String present = ""; //등급에 따른 선물

        switch (grade){
            case "A":
                present = "빌딩, ";
            case "B":
                present += "자동차, ";
            case "C":
                present += "노트북";
        }
        String message = "%s님의 경품은 %s입니다";
        System.out.printf(message,name,present);

        double average = 74.666666666;
        message = "평균: %.2f";// %.2f = 실수(float) 소숫점 2자리
        System.out.printf(message, average);


    }
}
