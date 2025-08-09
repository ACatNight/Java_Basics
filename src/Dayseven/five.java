package Dayseven;

import java.util.Random;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        int [] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length ; i++) {
            System.out.println("当前员工的第" + (i + 1) + "个工号");
            int code = sc.nextInt();
            codes[i] = code;
        }
        Random r = new Random();
        for (int i = 0; i < codes.length; i++) {
            int index = r.nextInt(codes.length);
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}