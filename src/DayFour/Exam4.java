package DayFour;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double BMI = weight / (height * height);
        if (BMI < 18.5){
            System.out.println("BMI为" + BMI + "属于偏瘦体重");
        }else if (BMI >= 18.5 && BMI < 24){
            System.out.println("BMI为" + BMI + "属于正常体重");
        }else if (BMI > 24){
            System.out.println("BMI为" + BMI + "属于偏胖体重");
        }
    }

}
