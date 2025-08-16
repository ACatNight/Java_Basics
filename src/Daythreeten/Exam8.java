package Daythreeten;

import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1, 2, 3:
                System.out.println("您输入的数字是春季");
                break;
            case 4, 5, 6:
                System.out.println("您输入的数字是夏季");
                break;
            case 7, 8, 9:
                System.out.println("您输入的数字是秋季");
                break;
            case 10, 11, 12:
                System.out.println("您输入的数字是冬季");
                break;
            default:
                System.out.println("输出错误");
        }
    }
}