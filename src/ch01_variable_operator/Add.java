package ch01_variable_operator;

// 클래스명은 첫글짜가 대문자
//코딩의 처음은 필요한 데이터를 담을 그릇이 몇 개인지를 파악하는 것 부터
public class Add {
    static void main() {
        // 3 더하기 5 는 8 입니다
       int x ; //정수형 데이터를 담을 수 있는 x를 준비합니다(변수를 션언(정의)한다)
       int y ;
       int result ; //정수형 데이터를 담을 수 있는 result을 준비합니다 (변수를 션언(정의)한다)

       x = 3 ; //정수형 그릇 x에 3을 대입(할당: assign)합니다
       y = 5 ;
       result = x + y ; // + 기호는 덧셈 정수형 그릇 result에 x와 y를 읽어와서

       System.out.println("x=" + x);//문자열 + 숫자 = 문자열로 변환된다. 문자열 출력
       System.out.println("y=" + y);
       System.out.println("result=" + result);

        //"3 더하기 5 는 8 입니다"를 변수를 이용하여 출력하고 싶으면
        System.out.println( x + " 더하기 " + y + " 는 " + result + " 입니다");

        x = 4 ; // 앞에 사용되었던 변수에 새로운 숫자를 overwrite 한다.
        y = 8 ; // 준비된 그릇에 다른 숫자를 바꾸어 넣을 수 있으므로 변수(variable)라 한다

        // 변수는 정의 후 할당하는 순서를 지켜야 한다

        result = x * y ;
        //"4 곱하기 8 는 32 입니다"를 변수를 이용하여 출력하고 싶으면
        System.out.println( x + " 곱하기 " + y + " 은 " + result + " 입니다");

        // ctrl + R : 선택된 변수를 다른 이름으로 변경(replace)하고 싶을 때

    }
}
