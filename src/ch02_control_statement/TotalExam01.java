package ch02_control_statement;

public class TotalExam01 {
    static void main(String[] args) {
        String name = "김철수";
        int kor = 85, math = 90, engl = 70;;
        int total = kor + math + engl;
        double average = total/3.0; // total/3.0 = (double)total/3

        String grade; // 학점변수

        if(average>=90){
            grade = "A";
        } else if(average>=80){
            grade = "B";
        } else if(average>=70) {
            grade = "C";
        } else if(average>=60) {
            grade = "D";
        } else {
            grade = "F";
        }

        String comment;
        switch(grade){
            case "A": case "B":
                comment="참 잘하셨습니다.";
            break;
            case "C": case "D":
                comment="조금만 더 노력하세요.";
                break;
            case "F":
                comment="다음 학기에 재수강하세요.";
                break;
            default:
                comment="잘못된 입력입니다.";
                break;
        }

        String message = "";

        System.out.println("이름: "+name);
        message = "국어: %d점, 영어: %d점, 수학: %d점 \n";
        System.out.printf(message,kor,engl,math);
        System.out.println(); // = \n
        message = "총점: %d점, 평균: %.5f\n";
        System.out.printf(message,total,average);
        System.out.println("학점:"+grade);
        message = comment;
        System.out.println("메세지: "+message);
    }
}
