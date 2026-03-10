package ch05_inheritance;

public class Animal {
    // Animal에 존재하는 공통적인 변수를 추출하여 정리한다(변수의 일반화)
    String name ;
    int age ;
    String feed ;// 먹이

    @Override // 현시적으로 Animal이  super클래스 이지만
              // 묵시적으로 Java 메모리에 Object클래스가 항상 최상위 클래스로 인식된다.
              // 따라서 Animal클래스에서 Object클래스에 내장(메소드 은익화)된 'toString()'메소드를 오버라이딩 할 수 있다.

    public String toString() {
        String imsi = "이름: "+name+", 나이: "+age+", 먹이: "+feed;
        return imsi;
    }

    // 메소드 공식: type name(variable...){...}
    // eat(), bark()

    public void eat(){
        System.out.println(name+"이(가) "+feed+"를 먹습니다.");
    }

    public void bark(){
        System.out.println(name+"이(가) 짖습니다.");
    }

    public void display(){
        System.out.println("이름: "+name);
        System.out.println("나이: "+age);
    }
}
