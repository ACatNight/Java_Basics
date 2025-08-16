package Daythreeten;

public class Exam4 {
    public static void main(String[] args) {
        System.out.println(sum(2, 6));

    }
    public static  int sum(int a,int b){
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum += i;

        }
        return sum;
    }
}
