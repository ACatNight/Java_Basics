package Dayseven;

public class two {
    public static void main(String[] args) {
        //完成数组反转
        //1.准备一个数组
        int [] date ={10 , 20 , 30 , 40 , 50};
        //2.定义一个循环 设计2个变量 1个在前 一个在后
        for(int i = 0,j = date.length - 1; i < j; i++, j--){
            //arr[i]       arr[j]
            //交换
            //1.定义一个临时变量 记住后一个位置处的值
            int temp = date[j];
            //2.把前一个位置处的值赋值给后一个位置
            date[j] = date[i];
            //3.把临时变量中记住的后一个位置处的值赋值给前一个位置处
            date[i] = temp;

        }
        //变量数组中的每个数据看有没有反转成功
        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i] + " ");
        }


    }
}
