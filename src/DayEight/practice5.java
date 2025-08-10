package DayEight;

public class practice5 {
    public static void main(String[] args) {
        String b = reverseString("ACatNight");
        System.out.println(b);

    }
    public static String reverseString(String data){
        String c = new StringBuilder(data).reverse().toString(); //反转字符公式
        return c;

    }
}
