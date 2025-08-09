package Dayseven;

import java.util.Random;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        //提示录入五名员工的工号
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <  numbers.length; i++) {
            System.out.println("请录入当前第" + (i + 1) + "个员工的工号");
            int number = sc.nextInt();
            numbers[i] = number;
        }
        //打乱数组中的元素顺序
        Random r = new Random();
        for (int i = 0; i < numbers.length ; i++) {
            //numbers[i]
            // 每变了到一个数据 都随机一个数组索引名范围内的值 然后让当前遍历的数据与该索引位置处的值交换
            int index = r.nextInt(numbers.length);
            int temp = numbers[index];
            //把i位置处的值赋值给index位置处
            numbers[index] = numbers[i];
            //把index位置 原来的值赋值给i位置处
            numbers[i] = temp;

        }
        //4.遍历数组的工号
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i] + " ");
        }

    }
}
