package ElvenDay;

public class five {
    public static void main(String[] args) {
        //1.定义一个循环控制打印多少行
        int n = 4;
        for (int i = 1; i <= n ; i++) {
            //2.控制打印多少个空格
            System.out.println(" ");
            for (int j = 1; j <= (n - i) ; j++) {
                System.out.print(" ");
            }
            //3.控制打印多少个星星
            for (int j = 1; j <= (2*i - 1) ; j++) {
                System.out.print(j % 2 == 0 ? " " : "*");
            }
            System.out.println();

        }
    }
}
