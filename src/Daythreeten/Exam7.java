package Daythreeten;

public class Exam7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 200; i++) {
            if (i % 3 == 0){
                sum += i;
            }
        }
        System.out.println("总和为:" + sum);
    }
}
