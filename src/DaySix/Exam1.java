package DaySix;

public class Exam1 {
    public static void main(String[] args) {
        int [] data = {3 , 7 , 1 , 9 , 4};
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("最后结果为:" + sum);

    }
}
