package DaySix;

public class Exam6 {
    public static void main(String[] args) {
        //题目 6：打印九九乘法表
        //用嵌套的 for 循环，输出九九乘法表：
        for (int i = 0; i <=9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
                System.out.print(i + "*" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }
}
