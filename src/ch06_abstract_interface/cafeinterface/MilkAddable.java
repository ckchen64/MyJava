package ch06_abstract_interface.cafeinterface;

//interface 의 메소드는 abstract class로 명명하지 않아도 항상 추상class 입니다
public interface MilkAddable {
      // 우유의 종류를 변경하게 될 경우
      //interface 의 메소드는 abstract class로 명명하지 않아도 항상 추상메소드 입니다
    public abstract void changeMilk(String milkType); // public abstract는 생략해도 같은 기능으로 인식한다
      // 이 추상메소드를 사용하는 sub클래스는 'implements Interface명'을 자신의 클래스명 뒤에 추가하여야 한다
      // interface에서는 추상메소드와 'public static final 상수'만 존재할 수 있다.
}
