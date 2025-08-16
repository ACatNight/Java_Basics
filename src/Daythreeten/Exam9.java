package Daythreeten;

import java.util.Scanner;

public class Exam9 {
    public static void main(String[] args) {
        int n = 0;
        if (isPrime(n)){
            System.out.println("是质数");
        }else {
            System.out.println("不是质数");
        }

    }
    public static boolean isPrime(int n){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n % n == 0){
            return true;
        }else {
            return false;
        }
    }
}
