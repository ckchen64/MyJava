package ch02_control_statement;

public class For03 {
    static void main(String[] args) {
        // 1 + 2 + 3 + ... + 50 = 1275
        int total = 0;
        int i = 1;
        while (i<=50){
            total += i;
            i++;
        }
        System.out.println("총합01: "+total);

        // 2 + 4 + 6 + ... + 100 = 2550
        total = 0;

        for (int j = 2; j <= 100; j+=2) { // j변수 : 신규변수이므로 타입 정의, 함수() 내에서 유효
            total += j;
            }
        System.out.println("총합02: "+total);

        // 1 + 3 + 5 + ... + 99 = 2500
        total = 0;

        for ( i = 1; i <= 100; i+=2) { // i변수 : 상위에 정의된 변수 이므로 타입생략
            total += i;
        }
        System.out.println("총합03: "+total);


        // 100 + 95 + 90 + ... + 5 = 1050
        total = 0;
        i = 100;
        while (i>0){
            total += i;
            i -= 5;
        }
        System.out.println("총합04: "+total);

        // 2² + 4² + 6² + ... + 20² = 1540
        total = 0;
        i = 2;
        while (i<=20){
            total += i*i;
            i += 2;
        }
        System.out.println("총합05: "+total);

        // 5² + 10² + 15² + ... + 100²= 71750
        total = 0;
        i = 5;
        while(i <= 100){
            total += i*i;
            i += 5;
        }
        System.out.println("총합06: "+total);

    }
}
