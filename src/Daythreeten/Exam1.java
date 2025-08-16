package Daythreeten;

import java.util.Scanner;

public class Exam1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请输入一个数字判断");
        int n = sc.nextInt();
        if (n >= 1){
            System.out.println("是正数");
        }else if(n < 0){
            System.out.println("是负数");
        }else {
            System.out.println("是0");
        }

    }
}
