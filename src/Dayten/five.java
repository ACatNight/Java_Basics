package Dayten;

public class five {
    public static void main(String[] args) {
        System.out.println("加密后的结果是:" + encrypt(1983));

    }
    public static String encrypt(int number){
        int[] numbers = split(number);
        //1.把这个密码拆分成一个一个数字 才可以对其加密
        //2.遍历这个数组中的每个数字 对其进行加密处理
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = (numbers[i] + 5) % 10;
        }
        //numbers = 6 4 3 8
        //3.对数组反转 把对数组进行反转的操作交给一个独立的方法来完成
        reverse(numbers);
        //8 3 4 3
        //4.把这些加密的数字拼接起来能为加密后的结果返回即可
        String data = "";
        for (int i = 0; i < numbers.length ; i++) {
            data += numbers[i];

        }
        return data;
    }
    public static void reverse(int[] numbers){
        //numbers = 6 4 3 8
        for (int i = 0,j = numbers.length - 1; i < j ; i++,j--) {
            //交换 i和j的位置
            int temp = numbers[j];
            //2.把前一个位置处的值赋值给后一个位置处
            numbers[j] = numbers[i];
            //3.把最后一个位置处原理的值（用于临时变量记住)赋值给前一个位置
            numbers[i] = temp;

        }
    }
    public static int[] split(int number){

        int [] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] =(number / 100) % 10;
        numbers[2] = (number / 10) % 10;
        numbers[3] = number % 10;
        return numbers; // 这里改成返回数组
    }
}
