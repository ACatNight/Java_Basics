package DayFive;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入2个整数");
        int number = sc.nextInt();
        int number2 = sc.nextInt() ;
        int sum = 0;
        System.out.println("请输入一个运算符");
        char n = sc.next().charAt(0);
        if (n == '+'){
            sum = number + number2;
            System.out.println("当前结果为" + sum);
        }else if (n == '-'){
            sum = number - number2;
            System.out.println("当前结果为" + sum);
        }else if (n == '*'){
            sum = number * number2;
            System.out.println("当前结果为" + sum);
        }else if (n == '/'){
            if (number % number2 == 0){
                System.out.println("0");
            }
            sum = number / number2;
            System.out.println("当前结果为" + sum);
        }else {
            System.out.println("您输入的字符是错误的");
        }
    }
}
