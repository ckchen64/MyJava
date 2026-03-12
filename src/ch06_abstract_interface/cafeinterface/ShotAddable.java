package ch06_abstract_interface.cafeinterface;

//샷 횟수를 추가할 수 있도독 설계한 (인터페이스)클래스
//interface 의 메소드는 abstract class로 명명하지 않아도 항상 추상class 입니다
public interface ShotAddable {

    //interface 의 메소드는 abstract class로 명명하지 않아도 항상 추상메소드 입니다
    void AddShot(int count);
    // 이 추상메소드를 사용하는 sub클래스는 'implements Interface명'을 자신의 클래스명 뒤에 추가하여야 한다
    // interface에서는 추상메소드와 'public static final 상수'만 존재할 수 있다.
}
