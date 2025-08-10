package DayEight;

public class practice2 {
    public static void main(String[] args) {
        int rs2 = number(5);
        boolean rs = isEven(rs2);
        if (rs){
            System.out.println(rs2 + "是偶数");
        }else
            System.out.println(rs2 + "是奇数");

    }
    public static int number(int a){
        return a;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;


    }
}
