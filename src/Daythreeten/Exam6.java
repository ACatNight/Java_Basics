package Daythreeten;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数 判断是奇数还是偶数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("您输入的" + n + "是偶数");
        }else
            System.out.println("您输入的" + n + "是奇数");
    }

}

