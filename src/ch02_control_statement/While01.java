package ch02_control_statement;

public class While01 {
    static void main(String[] args) {

        // 1~10 까지의 합
        int total =0;
        int i = 1;

        while (i < 11){ //i의 자유도가 한정적일 때 for, 비한적적이 때 while
            total += i;
            i++;
        }
        System.out.println("sum01: "+total);


        // 1+4+7....+100 까지의 합
        total =0;
        i = 1;

        while (i < 101){ //i의 자유도가 한정적일 때 for, 비한적적이 때 while
            total += i;
            i += 3;
        }
        System.out.println("sum02: "+total);

        // 97+92+87....+2 까지의 합
        total =0;
        i = 97;

        while (i > 0){ //i의 자유도가 한정적일 때 for, 비한적적이 때 while
            total += i;
            i -= 5;
        }
        System.out.println("sum03: "+total);//990

        // 1*1+6*6+11*11....+96*96 까지의 합
        total =0;
        i = 1;

        while (i <= 96){ //i의 자유도가 한정적일 때 for, 비한적적이 때 while
            total += i*i;
            i += 5;
        }
        System.out.println("sum04: "+total);//63670

    }
}
