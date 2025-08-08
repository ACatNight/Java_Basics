package DaySix;

public class one {
    public static void main(String[] args) {
        //掌握数组的定义方式 一：初始化数据
        //1.数据类型[] 数据名 = new 数据类型[]{元素1，元素2,元素3,......}
        int[] ages = new int[]{12, 24 , 36};
        double[] scores = new double[]{89.9, 99.5,59.5,88};
        System.out.println(ages);
        System.out.println(scores);
        //2.简化写法
        //数据类型[] 数组名[] ={元素1,元素2，元素3,......}......
        int[]age2 = {12 , 24 ,36};
        double[] scores2 = {89.9, 99.5, 59.5,88};
        //3.数据类型[] 数据名 也可以写成 数据类型 数组名[]
        int age3[] = {12 , 24 ,36};
        double scores3[] = {89.9, 99.5, 59.5,88};




    }
}

