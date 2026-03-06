package ch03_array;

import java.util.Scanner;

public class StudentExam {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //외부 입력 수단을 초기화 한다

        System.out.print("이름입력: ");
        String name = scan.nextLine(); // name 변수 초기화

        System.out.print("시험과목수: ");
        int size = scan.nextInt(); // size 변수 초기화

        int[] jumsu = new int[size]; // jumsu 배열 초기화
        double total=0, average = 0; // 필요변수 생성

        for (int i = 0; i < jumsu.length; i++) {
            System.out.print("점수입력"+i+": "); // 점수기록 입력
            jumsu[i] = scan.nextInt();
            total += jumsu[i];// 입력된 점수의 합계를 구한다
        }
        average = total/size;//평균점수를 구한다
        System.out.println("학생의 정보");
        String message = "이름: %s, 총점: %.2f, 평균: %.2f";
        System.out.printf(message,name,total,average);
    }
}
