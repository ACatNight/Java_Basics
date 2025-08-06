package DayFour;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        if(number1 < number2){
            System.out.println(number2 + "是最大值" + "," + number1 + "是最小值");
        }else {
            System.out.println(number1 + "是最大值" + "," + number2 + "是最小值");
        }

    }
}
