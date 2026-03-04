package ch02_control_statement;

public class AdultCheck {
    static void main(String[] args) {
        String name = "김철수";
        int age = 12;
        int _gender = 3; // "_" 같은 성격의 임시변수 표시

        String gender; //성별
        // 함수, 메소드에 의하여 변수에 값을 할당할 수 있다.
        if(_gender == 1 || _gender == 3) {//남자이면
            gender = "남자";
        }else{
            gender = "여자";
        }

        String adult;

        if(age>=19){
            adult = "성인";
        }else{
            adult = "미성년자";
        }

        // println 메소드 : 문자열을 출력하고 엔터기를 누르는 역할
        // method 역할=기능=함수
        System.out.println("이름: "+name+", "+"나이: "+age);
        // 서식 지정자 : %s(문자열 string), %d(정수 decimal)
        // printf 메소드 : 서직 지정자를 이용한 출력, 엔터티 기능 없음
        System.out.printf("이름: %s, 나이: %d, 성별: %s, 구분: %s",
                           name, age, gender, adult);
        System.out.println();

        String message = "%s님의 나이는 %d세이고 성별은 %s이며, %s입니다";
        System.out.printf(message, name, age, gender, adult);
    }
}
