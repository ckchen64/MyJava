package ch03_array;

import java.util.Scanner;


public class Array02 {

    static void main(String[] args) {
        /*
        String[] bts = {"진", "뷔", "정국", "RM", "지민", "슈가", "제이홉"};
        for (int i = 0; i < bts.length; i++) {
            System.out.println(bts[i]);
        }
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("멤버 수 입력: ");
        int size = scan.nextInt(); // scan.nextInt()는 입력도구이다. 반복해서 쓸수 있다

        String[] bts = new String[size];// 변수(jumsu) 형식(int[요소갯수]) 지정

        for (int i = 0; i < bts.length; i++) {
            System.out.print(i + "번째 멤버이름 입력: ");
            bts[i] = scan.next(); // scan.nextInt()는 입력도구이다. 반복해서 쓸수 있다

            }
        for (int i = 0; i < bts.length; i++)
            System.out.println(bts[i]);
        }
    }
