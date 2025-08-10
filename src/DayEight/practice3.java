package DayEight;

public class practice3 {
    public static void main(String[] args) {
        int rs = maxOfthree(2,5,3);
        System.out.println("最大值为" + rs);

    }
    public static int maxOfthree(int a,int b,int c){
        int max = 0;
        if (a > b && a > c){
            max = a;
        }else if (a < b && b > c){
            max = b;
        }else {
            max = c;
        }
        return max;

    }

}
