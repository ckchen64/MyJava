package ch02_control_statement;

public class For01 {
    static void main(String[] args) {
        //1~10의 sum
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            // for(초기식(변수값 할당, 1회만 실행);조건식;증감식){}, (i++)==(i+=1)
            // 초기식의 할당값(1)이 조건식에 적합하므로, {}를 실행한다 total==0+1,
            // i를 증가시킨다(2), total==1+2, i(3)_total==3+3, ...
            total += i;
        }
        System.out.println("총합01: "+total);//55

        //1+4+7....100의 sum
        total = 0; //변수 초기화시에 타입(type)은 생략한다
        for(int i = 1; i <= 100; i+=3){
            total += i;
        }
        System.out.println("총합02: "+total);//1717

        //97+92+87+...+2의 sum
        total = 0; //변수 초기화시에 타입(type)은 생략한다
        for(int i = 97; i > 0; i-=5){
            total += i;
        }
        System.out.println("총합03: "+total);

        //1*1+6*6+11*11+...+96*96의 sum
        total = 0; //변수 초기화시에 타입(type)은 생략한다
        for(int i = 1; i <= 96; i+=5){
            total += i*i;
        }
        System.out.println("총합04: "+total);

    }
}
