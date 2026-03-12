package ch06_abstract_interface;

import ch04_class.Product01;//다른 패키지에 있는 public클래스의 public변수를 지정하면 자동 생성문구

public class Myproduct_ch04_Prodt01 {
    static void main(String[] args) {
        Product01 apple = new Product01(); // 다른 패키지에 있는 public클래스의 public변수를 지정(imprort) 하였다.
        apple.name = "사과";
        System.out.println("품목이름: "+apple.name);
    }
}
