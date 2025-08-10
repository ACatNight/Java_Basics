package DayEight;

public class practice4 {
    public static void main(String[] args) {
        //A = n * (n-1)
        int rs = factorial(3);
        System.out.println(rs);


    }
    public static int factorial(int n){
        int data = n * ( n - 1);
        return data;
    }
}
