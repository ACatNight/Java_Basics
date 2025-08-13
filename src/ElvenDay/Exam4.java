package ElvenDay;

public class Exam4 {
    public static void main(String[] args) {
        int [] nums = {2 , 5 , 8 ,10};
        int sum = 0;
        for(int i = 0; i < nums.length;i++){
            sum = sum + nums[i];
        }
        System.out.println("数组的总和为:" + sum);
    }
}
