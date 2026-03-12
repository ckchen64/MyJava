package ch03_array;

public class Array01ForEach {
    static void main(String[] args) {
        String[] bts = new String[7];

        bts[0] = "진";
        bts[1] = "뷔";
        bts[2] = "정국";
        bts[3] = "RM";
        bts[4] = "지민";
        bts[5] = "슈가";
        bts[6] = "제이홉";

       for (int i = 0; i < bts.length; i++) {//용도: 특정 위치의 객체 출력시
//            System.out.println(bts[i]);
        }

        System.out.println("향상된 for구문");
        //  for (타입 단수이름(개발자지정명):복수이름){...}
        for (String item:bts){// 용도: 모든 객체의 출력
            System.out.println(item);
        }

    }
}
