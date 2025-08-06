package DayFour;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int big = sc.nextInt();
        int small = sc.nextInt();
        if (big < small){
            System.out.println("较大的数是" + small);
        }else if (big > small){
            System.out.println("较大的数是" + big);
        }
    }
}
