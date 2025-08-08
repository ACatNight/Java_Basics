package DaySix;

public class two {
    public static void main(String[] args) {
        //目标 掌握数组的访问
        int[] arr = {12 , 24 , 36};
        //           0    1    2
        //1.访问数组的全部数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //2.修改数组中的数据
        arr[0] = 66;
        arr[2] = 100;
        System.out.println(arr[0]);
        System.out.println(arr[2]);
        //3.访问数组的个数 :数组名 .length (前提是数组中存在数据)
        System.out.println(arr.length); //数组长度属性

        //技巧 获取数据的最大索引
        System.out.println(arr.length - 1);


    }
}
