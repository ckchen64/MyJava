package ch03_array;

import java.util.Scanner;

public class ArrayEvenOdd {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("배열요소 개수 입력: ");
        int size = scan.nextInt(); // scan.nextInt()는 입력도구이다. 반복해서 쓸수 있다

        int[] jumsu = new int[size];// 변수(jumsu) 형식(int[요소갯수]) 지정
        int even = 0, odd = 0; // 합산 변수들은 반복문(for) 전에 정의

        for (int i = 0; i < jumsu.length; i++) {
            System.out.print(i + "번째 숫자 입력: ");
            jumsu[i] = scan.nextInt(); // scan.nextInt()는 입력도구이다. 반복해서 쓸수 있다

            if(jumsu[i]%2 == 0){//입력된 요소의 값이 짝수이면
                even += jumsu[i];
            } else {
                odd += jumsu[i];
            }
        }
        System.out.println("홀수의 총합: "+odd);
        System.out.println("짝수의 총합: "+even);
    }
}
