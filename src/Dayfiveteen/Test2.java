package Dayfiveteen;

public class Test2 {
    public static void main(String[] args) {
        //掌握封装的设计规范 合理隐藏 合理暴露
        three s1 = new three();
//        s1.setScore(12);//赋值
        s1.setScore(99);
        System.out.println(s1.getScore());//取出来

    }
}
