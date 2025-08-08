package DaySix;

public class Exam5 {
    //使用 for 循环，求出 1~100 之间所有奇数的总和，并输出结果。
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 == 1){
                sum +=i;
            }
        }
        System.out.println("所有奇数的和为" + sum);
    }
}
