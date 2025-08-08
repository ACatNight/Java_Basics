package DayFive;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请用户依此输入五个数字");
        int data2 = 0;
        int data3 = 0;
        while (true){
            int data = sc.nextInt();
            if (data % 2 == 0){
                data2 = data2 + 1;
            }else {
                data3 = data3 + 1;
            }
            int sum = data2 + data3;
            if (sum == 5){
                break;
            }
        }
        System.out.println("总输入了" + data3 + "个奇数," + data2 + "个偶数");

    }
}
