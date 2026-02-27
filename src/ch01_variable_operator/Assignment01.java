package ch01_variable_operator;

public class Assignment01 {
    static void main() {
        int x = 5 ; // 정수형 변수 x에 숫자 5를 대입/할당(assign)해 주세요
        System.out.println("x: " + x);


        //x = 3 ; // 기존 값 무시 새로 할당 (덮어쓰기 overwrite)
        x += 3 ; // 누적해서 대입 (x=x+3과 같은 뜻) // 단산이관비논조대
        System.out.println("x: " + x);

        x *= 4 ;
        System.out.println("x: " + x);

        x %= 5 ;
        System.out.println("x: " + x);

        x -= 1 ;
        System.out.println("x: " + x);

        x += 5 ;
        System.out.println("x: " + x);
    }
}
