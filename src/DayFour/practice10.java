package DayFour;

import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {
        System.out.println("欢迎进入简易计算机系统");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        System.out.println("请输入符号");
        char s = sc.next().charAt(0);
        System.out.println("数据已保存，开始输出结果");
        int sum = 0;
        if (s == '+'){
            sum = number1 + number2;
            System.out.println("结果为" + sum);
        }else if (s == '-'){
            sum = number1 - number2;
            System.out.println("结果为" + sum);
        }else if (s == '/'){
            sum = number1 / number2;
            System.out.println("结果为" + sum);
        } else if (s == '*'){
            sum = number1 * number2;
            System.out.println("结果为" + sum);
        } else {
            System.out.println("输入的字符错误,无法判断");
        }

    }
}
