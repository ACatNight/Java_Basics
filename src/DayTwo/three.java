package DayTwo;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        //掌握自增自减运算符的使用
        int a = 10;
        a++; //a = a + 1
        System.out.println(a);
        a--; // a = a - 1
        System.out.println(a);

        System.out.println("----------");
        int i = 10;
        int rs = ++i; //先加后用
        int f = 4;
        System.out.println(--f);
        System.out.println(++f);

        System.out.println(rs);
        System.out.println(i);
        System.out.println("----------");
        int j = 10;
        int rs2 = j++; //先用后加
        System.out.println(rs2); //10
        System.out.println(j);//11
        System.out.println("---------");
        int m = 5;
        int n = 3;
        //m 5 6 5 4
        //n 3 4
                 //6 -  5  +  5   -  4  + 3 + 3
        int rs3 = ++m - --m + m-- - ++n + n-- + 3;
        System.out.println(rs3);
        System.out.println(m); // 4
        System.out.println(n); // 3
//        6 - 5 + 5 - 4 + 3 + 3 = 9
        System.out.println("---------------");
        int c = 10;
        int d = 5;

        int rs4 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs4);
        System.out.println(c);
        System.out.println(d);




    }
}
