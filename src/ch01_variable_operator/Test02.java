package ch01_variable_operator;

public class Test02 {
    static void main() {
        int a = 10;
        int b = 8;

        boolean bool1 = a != b ;// !(10=8)=! F : T
        boolean bool2 = --a == b++ ;// (10-1)=8 : F
        //a=9, b=9
        boolean bool3 = a++ == b++ ;// (9)=9 : T
        //a=10, b=10
        boolean bool4 = bool3 && (5>7) ;// T&F : F
        boolean bool5 = !bool4 || (bool1 && bool2) ;// !F ||(T&&F): T||F: T

        System.out.println("+bool1: "+bool1);//T
        System.out.println("+bool2: "+bool2);//F
        System.out.println("+bool3: "+bool3);//T
        System.out.println("+bool4: "+bool4);//F
        System.out.println("+bool5: "+bool5);//T
        System.out.println();

        int x = 3, y = 8, z = 4 ;
        /*
        int max1 = x>y ? x : y ;
        String m1 = x>y ? "x: " : "Y: " ;

        int max2 = max1>z ? max1 : z ;
        String m2 = max1>z ? m1 : "z: " ;

        System.out.println(m1+" "+max1);*/

        int max = Math.max(x, Math.max(y,z));
        /*System.out.println("최대값은 "+m2+" "+max2);*/
        System.out.println(max);

        /*
        int a = 3 - -2, b = 3 ; //a=5, b=3
        int x = (a>=b) ? 5 : (a+2) ;// x= 5 >= 3 ? 5 : 7 = 5

        x += ++a ; //x = 5+6 = 11
        int y = ++a ; // y = 6+1 = 7
        y += a + --b ; // y = 7+7+(3-1) = 16

        char ch3 = 'D' ;
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x+2 ; // 대문자 이면, 16-1 : 11+2, z=15

        int result = 0 ;
        result = x > y ? z-y : x+z ; // 11>16 ? 15+16 : 11+15 =  26

        System.out.println("result: " + result); */




    }
}
