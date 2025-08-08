package DaySix;

public class four {
    public static void main(String[] args) {
        int [] money = {16 , 26 , 36 , 6 , 100};
        int sum = 0; //定义一共变量用于累加和
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);
    }
}
