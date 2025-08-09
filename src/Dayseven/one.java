package Dayseven;

public class one {
    public static void main(String[] args) {
        //掌握数组最值
        //1.把数据拿到程序中来 用数组装起来
        int[] faceScores = {15,900,10000,20000,9500,-5};
        //2.定义一个变量用于最终记住最大值
        int max = faceScores[0];
        //3.从数组的第二个位置开始遍历
        for (int i = 1; i < faceScores.length ; i++) {
            if (faceScores[i] > max){ //判断当前遍历的这个数据  是否大于最大值变量max存储的数据
                max = faceScores[i];
            }

        }

        System.out.println(max);
    }
}
