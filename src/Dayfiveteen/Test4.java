package Dayfiveteen;

public class Test4 {
    public static void main(String[] args) {
        five s1 = new five();
        s1.brand = "宝马";
        s1.price = 2323;
        s1.red = "红色";
        five s2 = new five();
        s2.brand = "红旗";
        s2.price = 2312;
        s2.red = "蓝色";

        System.out.println("品牌:" + s1.getBrand() + ",价格:" + s1.getPrice() + ",车辆颜色:" + s1.getRed());

        System.out.println("品牌:" + s2.getBrand() + ",价格:" + s2.getPrice() + ",车辆颜色:" + s2.getRed());

    }
}