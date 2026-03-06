package ch03_array;

import java.lang.reflect.Array;

public class MyArr01 {
    static void main(String[] args) {
        int x = 3;
        int y = 5;

        //배열의 정의 : 점수 3개를 배열로 만들어 봅시다
        // [] 배열(array)의 약속된 기호
        // 타입[] 배열이름 = new 타입[요소갯수];
        // 요소갯수는 '배열이름.length'이라는 메소드로 확인 가능
        // 배열생성 방법01: new 연산자를 이용하여 배열정의 하여 arr에 (기본)값을 할당

        int[] arr = new int[3]; // arr는 배열 이름이고 3개의 메모리저장 위치를 할당하였음
                                // 변수 3개를 설정한 효과와 같음

        arr[0] = x - y + 6; //4
        arr[2] = arr[0] + 3; //7
        arr[1] = arr[0] + arr[2]; //11

        for (int i = 0; i < arr.length ; i++) {//arr.length = arr의 변수갯수
            System.out.println(arr[i]);
        }

        //배열생성 방법02: {}를 사용하여 배열생성
        int[] brr = {15, 30, 22};

        for (int i = 0; i < brr.length ; i++) {//brr.length = brr의 변수갯수
            System.out.println(brr[i]);
        }
    }
}
