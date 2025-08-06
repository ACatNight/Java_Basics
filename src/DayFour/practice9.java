package DayFour;

import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println(number + "不是质数");
            return;
        }

        boolean isPrime = true;  // 质数标志

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;  // 找到一个因数就停止循环
            }
        }

        if (isPrime) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
    }
}
